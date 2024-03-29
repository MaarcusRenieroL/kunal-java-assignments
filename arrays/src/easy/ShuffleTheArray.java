package easy;

import java.util.Arrays;

public class ShuffleTheArray {
  public static void main(String[] args) {
    int[] nums = { 2, 5, 1, 3, 4, 7 };
    int[] result = shuffle(nums, 3);

    System.out.println(Arrays.toString(result));
  }

  static int[] shuffle(int[] nums, int n) {
    int[] result = new int[2 * n];
    int j = 0;

    for (int i = 0; i < nums.length; i += 2) {
      result[i] = nums[j++];
      result[i + 1] = nums[n++];
    }
    return result;
  }
}
