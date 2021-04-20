import java.util.*;

class Main {

    public static void main(String args[]) {
        // a green apple
        System.out.println(findFirstNonRepeatingChar("a green apple"));

    }

    // public static char findFirstNonRepeatingChar(String str) {
    // Map<Character, Integer> map = new HashMap<>();
    // var chars = str.toCharArray();
    // for (char x : chars) {
    // var count = (map.containsKey(x))? map.get(x):0;
    // map.put(x,count+1);
    // }

    // for(char x: chars){
    // if(map.get(x)==1)
    // return x;
    // }

    // return 0;
    // }

    public static char findFirstNonRepeatingChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (var x : chars) {
           var count = (map.containsKey(x))? map.get(x):0;

           map.put(x, count+1);
        }

        for (var x : chars) {
            if (map.get(x) == 1)
                return x;
        }
        return Character.MIN_VALUE;
    }
}