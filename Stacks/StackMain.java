import java.util.Stack;
class StackMain{
    public static void main(String args[]){
        String st = "abs";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(st);
        System.out.println(result);
    }
}