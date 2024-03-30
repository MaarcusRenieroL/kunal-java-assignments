package medium;

import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    rotate(nums, k);

    System.out.println(Arrays.toString(nums));
  }

  static void rotate(int[] nums, int k) {
    k = k % nums.length;

    swap(nums, 0, nums.length - 1);
    swap(nums, 0, k);
    swap(nums, k, nums.length - 1);
  }

  static void swap(int[] nums, int l, int r) {
    while (l <= r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
  }
}
