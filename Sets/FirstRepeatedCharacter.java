import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String args[]) {
        // green apple
        String test = "green apple";
        Set<Character> set = new HashSet<>();
        for (var ch : test.toCharArray()) {
            if (set.contains(ch)){
                System.out.println(ch);
                break;
            }
            else
                set.add(ch);
        }
    }
}
