package medium;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int[] result = productExceptSelf(nums);

    System.out.println(Arrays.toString(result));
  }

  static int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int left = 1, right = 1;

    for (int i = 0; i < nums.length; i++) {
      {
        result[i] = left;
        left *= nums[i];
      }
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= right;
      right *= nums[i];
    }

    return result;
  }
}
