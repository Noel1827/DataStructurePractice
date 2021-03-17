import java.util.Arrays;

public class ArrayQueue {
    int[] items;
    int front=0, end=0;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int number){
        if(isFull())
        throw new StackOverflowError();
        items[end++] = number;
    }

    public int dequeue(){

        return items[front++];
    }

    public int peek(){
        return items[end-1];
    }

    public boolean isEmpty(){
        return front == end;
    }
    public boolean isFull(){
        return end == items.length;
    }

    @Override
    public String toString(){
        var copy = Arrays.copyOfRange(items, front, end);
        return Arrays.toString(copy);
    }

}
