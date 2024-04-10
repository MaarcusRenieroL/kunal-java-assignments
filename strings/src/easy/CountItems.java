package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItems {
  public static void main(String[] args) {
    List<List<String>> l = new ArrayList<>();

    l.add(Arrays.asList("phone", "blue", "pixel"));
    l.add(Arrays.asList("computer", "silver", "lenovo"));
    l.add(Arrays.asList("phone", "gold", "iphone"));

    System.out.println(countMatches(l, "color", "blue"));
  }

  static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int count = 0, rk = 0;

    if (ruleKey.equals("type")) {
      rk = 0;
    } else if (ruleKey.equals("color")) {
      rk = 1;
    } else {
      rk = 2;
    }

    for (List<String> item : items) {
      if (item.get(rk).equals(ruleValue)) {
        count++;
      }
    }

    return count;
  }
}
