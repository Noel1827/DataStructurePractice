import java.nio.channels.IllegalSelectorException;

public class LinkedListQueue {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count=0;

    public boolean isEmpty(){
        return head== null;
    }

    public void enqueue(int item){
        var node = new Node(item);
        if(isEmpty())
        head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public int peek(){
        if(isEmpty())
        throw new IllegalStateException();

        return head.value;
    }

    public int dequeue(){
        if(isEmpty())
        throw new IllegalStateException();

        int value = head.value;
      
        if(head == tail){
            tail = head = null;
        }else{
            head = head.next;
        }
            
        count--;
        return value;
    }
    public int size(){
        return count;
    }

    public void print(){
        var current = head;
        while(current != null){
            System.out.print(current.value +" ");
            current = current.next;
        }
    }
}
