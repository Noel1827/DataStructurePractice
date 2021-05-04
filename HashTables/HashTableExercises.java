import java.util.*;

public class HashTableExercises {
    Map<Integer, Integer> map = new HashMap<>();

    public int mostFrequent(int[] arr) {
       
        for (var key : arr) {
           int count = (map.containsKey(key)) ? map.get(key) : 0;
            map.put(key, count+1);
        }
        int key=1;
        int max =-1;
      for(var item:map.entrySet()){
          if(item.getValue()>max){
            max = item.getValue();
            key = item.getKey();
          }
      }
        return key;
    }
}
