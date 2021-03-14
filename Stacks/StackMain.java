import java.util.Stack;

class StackMain {
    public static boolean balanced(String input) {
        Stack<Character> opens = new Stack<>();

        for (char x : input.toCharArray()) {
            if (x == '(' || x == '[' || x == '<' || x == '{')
                opens.push(x);

            switch (x) {
                case ')':
                    if (opens.empty() || opens.peek() != '(')
                        return false;
                    opens.pop();
                    break;
                case ']':
                    if (opens.empty() || opens.peek() != '[')
                        return false;
                    opens.pop();
                    break;
                case '>':
                    if (opens.empty() || opens.peek() != '>')
                        return false;
                    opens.pop();
                    break;
                case '}':
                    if (opens.empty() || opens.peek() != '{')
                        return false;
                    opens.pop();
                    break;

            }
            // if (x == ')' || x == ']' || x == '>') {
            // if (opens.peek() == x)
            // opens.pop();
            // }
        }

        return opens.empty();

    }

    public static void main(String args[]) {
        // String st = "abs";
        // StringReverser reverser = new StringReverser();
        // var result = reverser.reverse(null);
        // System.out.println(result);
        System.out.println(balanced(")1+2"));
    }
}