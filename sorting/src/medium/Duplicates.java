package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
  public static void main(String[] args) {
    System.out.println(findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
  }

  static List<Integer> findDuplicates(int[] n) {
    Set<Integer> s = new HashSet<>();
    List<Integer> a = new ArrayList<>();

    for (int num : n) {
      if (s.contains(num)) {
        a.add(num);
      } else {
        s.add(num);
      }
    }

    return a;
  }
}
