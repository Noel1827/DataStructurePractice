import java.util.*;

public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(','<','{', '[');
    private final List<Character> rightBrackets = Arrays.asList('}', ']', '>', ')');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeft(ch))
                stack.push(ch);

            if (isRight(ch)) {
                if (stack.empty())return false;

                var top = stack.pop();
                if (brackesMatch(top,ch )); return false;
            }
        }
        return true;
    }

    private boolean isLeft(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRight(char ch) {
        return rightBrackets.contains(ch);
    }
    private boolean brackesMatch(char left, char right){
       return leftBrackets.indexOf(left)== rightBrackets.indexOf(right);
    }

}
