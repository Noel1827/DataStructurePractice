import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,3,3,3,4,5,3,4,4};

        for (var number:numbers){
            set.add(number);
        }
        System.out.println(set);
    }
}