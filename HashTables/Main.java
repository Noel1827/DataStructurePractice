import java.util.*;

class Main {

    public static void main(String args[]) {
        // a green apple
        // System.out.println(findFirstNonRepeatingChar("a green apple"));

    //    HashTable table = new HashTable();
    //    table.put(6, "A");
    //    table.put(8,"B");
    //    table.put(11,"C");
    //    table.put(6,"A+");
    //    table.remove(60);
    //   System.out.println(table.get(10));
      int[] arr = {1,2,23,4,3,2,2};

      HashTableExercises map = new HashTableExercises();
      System.out.println(map.TwoSum(arr,0));
      int[] returned = map.TwoSum(arr,4);
      System.out.println(returned[0]+" "+ returned[1]);
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