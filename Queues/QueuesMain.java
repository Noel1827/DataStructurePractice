
import java.util.*;
class QueuesMain{
    public static void main(String args[]){
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
       
        // System.out.println(queue);
        // reverse(queue);
        // System.out.println(queue);

        // ArrayQueue test = new ArrayQueue();
        // test.enqueue(9);
        // test.enqueue(0);
        // test.enqueue(4);
        // test.enqueue(1);
        // test.enqueue(1);
        // System.out.println(test.isFull());
        // test.dequeue();
        // System.out.println(test);

        PriorityQueue queue = new PriorityQueue(5);
        queue.insert(3);
        queue.insert(2);
        queue.insert(10);
        queue.insert(20);
        queue.print();


    }
    // public static void reverse(Queue<Integer> queue){
    //     Stack<Integer> temp = new Stack<>();
    //     while(!queue.isEmpty()){
    //         temp.push(queue.remove());
    //     }
    //     while(!temp.isEmpty()){
    //         queue.add(temp.pop());
    //     }

    // }
}