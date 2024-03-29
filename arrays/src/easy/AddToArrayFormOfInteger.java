package easy;

import java.util.List;
import java.util.ArrayList;

public class AddToArrayFormOfInteger {
  public static void main(String[] args) {
    int[] num = { 1, 2, 0, 0 };
    int k = 34;

    List<Integer> result = addToArrayForm(num, k);

    System.out.println(result);
  }

  static List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> result = new ArrayList<>();

    String numStr = "";

    for (int i = 0; i < num.length; i++) {
      numStr += num[i];
    }

    int number = 0;

    for (int i = 0; i < numStr.length(); i++) {
      number = number * 10 + numStr.charAt(i) - '0';
    }

    number += k;

    while (number > 0) {
      result.add(0, number % 10);
      number /= 10;
    }

    return result;
  }

}
