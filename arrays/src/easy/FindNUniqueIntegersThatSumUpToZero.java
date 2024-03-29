package easy;

import java.util.Arrays;

public class FindNUniqueIntegersThatSumUpToZero {
  public static void main(String[] args) {
    int n = 2;

    int[] result = sumZero(n);

    System.out.println(Arrays.toString(result));
  }

  static int[] sumZero(int n) {
    int[] result = new int[n];
    int i = 0, j = n - 1;

    while (i < j) {
      result[i++] = n;
      result[j--] = -n;
      n--;
    }

    return result;
  }
}
