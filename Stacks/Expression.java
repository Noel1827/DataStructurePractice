import java.util.Stack;

public class Expression {
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeft(ch))
                stack.push(ch);

            if (isRight(ch)) {
                if (stack.empty())
                    return false;
                var top = stack.pop();
                if (brackesMatch(top,ch ));
                    return false;
            }
        }
        return true;
    }

    private boolean isLeft(char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }

    private boolean isRight(char ch) {
        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }
    private boolean brackesMatch(char left, char right){
        return (right == ')' && left != '(' )|| (right == '}' && left != '{') || (right == ']' && left != '[')  || (right == '>' && left != '<');
    }

}
