package easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

  public static void main(String[] args) {
    int[] nums = { 8, 1, 2, 2, 3 };
    int[] result = smallerNumbersThanCurrent(nums);

    System.out.println(Arrays.toString(result));
  }

  static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] result = new int[nums.length];
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          if (nums[j] < nums[i]) {
            count += 1;
          }
        }
      }

      result[i] = count;
      count = 0;
    }

    return result;
  }
}
