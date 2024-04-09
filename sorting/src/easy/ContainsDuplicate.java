package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 }));
  }

  static boolean containsDuplicate(int[] n) {
    HashMap<Integer, Integer> m = new HashMap<>();

    for (int num : n) {
      m.put(num, m.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> e : m.entrySet()) {
      if (e.getValue() >= 2) {
        return true;
      }
    }

    return false;
  }
}
