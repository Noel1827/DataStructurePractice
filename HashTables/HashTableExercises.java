import java.util.*;

public class HashTableExercises {
  Map<Integer, Integer> map = new HashMap<>();

  public int mostFrequent(int[] arr) {

    for (var key : arr) {
      int count = (map.containsKey(key)) ? map.get(key) : 0;
      map.put(key, count + 1);
    }
    int key = 1;
    int max = -1;
    for (var item : map.entrySet()) {
      if (item.getValue() > max) {
        max = item.getValue();
        key = item.getKey();
      }
    }
    return key;
  }

  public int countPairsWithDiff(int[] numbers, int difference) {
    Set<Integer> set = new HashSet<>();
    int counter = 0;
    for (var number : numbers)
      set.add(number);

    for (var number : numbers) {
      if (set.contains(number + difference))
        counter++;
      if (set.contains(number - difference))
        counter++;
      set.remove(number);
    }
    return counter;
  }

  public int[] TwoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] arr = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      int compliment = target - numbers[i];
      if (map.containsKey(compliment)) {
        arr[0] = i;
        arr[1] = map.get(compliment);
        break;
      }
      map.put(numbers[i], i);

    }
    return arr;
  }
}
