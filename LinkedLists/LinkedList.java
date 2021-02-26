public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    private class Node{
        private int value;
        private Node next;

        public Node(int x){
            this.value=x;
        }
    }
    public boolean isEmpty(){return first==null;}

    // addFirst

    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty())
        first = last = node;
        else {
            node.next=first;
            first=node;
        }
        size++;
    }
    // addLast
public void addLast(int item){
    Node node = new Node(item);

    if(isEmpty())
    first = last = node;
    else{
        last.next=node;
        last = node;
    }
    size++;
}
    // deleteFirst
    public void deleteFirst(){

        if(isEmpty())
        throw new IllegalArgumentException();

        if(first == last)
            first = last = null;
            else{
                Node second = first.next;
                first.next = null;
                first = second;
            }
            size--;
    }
    // deleteLast

    public void deleteLast(){
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (first == last) {
            first = last = null;
        }else{
            Node current = first;
            while(current != null){
                if(current.next == last)break;
                current = current.next;
            }
            last = current;
            
        }
    }
    // contains
    // indexOf

    public void print(){
        Node temp = first;
     while(temp != null){
            System.out.println(temp.value);
            temp=temp.next;
     }
        
    }
}
