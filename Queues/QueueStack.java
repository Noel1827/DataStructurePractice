import java.util.*;
public class QueueStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int item){
        s1.push(item);
    }
    public int dequeue(){
        int temp = 0;
        for(int i = 0; i< s1.size()-1; i++){
            s2.push(s1.pop());
        }
        temp = s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }

    public boolean isEmpty(){
        return s1.size()==0;
    }
    public int peek(){
        int temp = 0;
        for(int i = 0; i< s1.size()-1; i++){
            s2.push(s1.pop());
        }
        temp = s1.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }


  
}
