import java.util.Stack;
public class StringReverser {
    public String reverse(String input){
        if(input == null)
        throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for(char a : input.toCharArray()){
            stack.push(a);
        }
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty())
        reversed.append(stack.pop());
        return reversed.toString();
    }
}
