package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
  public static void main(String[] args) {
    List<List<String>> items = new ArrayList<>();
    items.add(Arrays.asList("phone", "blue", "pixel"));
    items.add(Arrays.asList("computer", "silver", "phone"));
    items.add(Arrays.asList("phone", "gold", "iphone"));

    System.out.println(countMatches(items, "type", "phone"));
  }

  static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int result = 0, i = 0;

    if (ruleKey == "type") {
      i = 0;
    } else if (ruleKey == "color") {
      i = 1;
    } else {
      i = 2;
    }

    for (int j = 0; j < items.size(); j++) {
      if (items.get(j).get(i) == ruleValue) {
        result++;
      }
    }

    return result;
  }
}
