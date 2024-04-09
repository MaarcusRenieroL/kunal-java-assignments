package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  public static void main(String[] args) {
    System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
  }

  static List<List<Integer>> threeSum(int[] n) {

    Arrays.sort(n);

    if (n.length < 3 || n == null) {
      return new ArrayList<>();
    }

    Set<List<Integer>> s = new HashSet<>();

    for (int i = 0; i < n.length - 2; i++) {
      int l = i + 1, r = n.length - 1;

      while (l < r) {
        int t = n[i] + n[l] + n[r];

        if (t == 0) {
          s.add(Arrays.asList(n[i], n[l], n[r]));
          l++;
          r--;
        } else if (t > 0) {
          r--;
        } else {
          l++;
        }
      }
    }

    return new ArrayList<>(s);
  }
}
