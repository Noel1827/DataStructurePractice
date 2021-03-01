
public class Main {
    public static void main(String args[]){
     LinkedList l = new LinkedList();
        l.addFirst(9);
        l.addFirst(2);
        l.addLast(10);
        l.reverse();
      System.out.println("the index value is" + l.indexOf(2));
        l.print();
    }
}
 