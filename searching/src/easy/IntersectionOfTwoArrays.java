package easy;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })));
  }

  static int[] intersection(int[] n1, int[] n2) {
    Set<Integer> s = new HashSet<>();
    Set<Integer> i = new HashSet<>();

    for (int n : n1) {
      s.add(n);
    }

    for (int n : n2) {
      if (s.contains(n)) {
        i.add(n);
      }
    }

    int[] r = new int[i.size()];
    int idx = 0;
    for (int n : i) {
      r[idx++] = n;
    }

    return r;
  }
}
