package easy;

public class MaximumSubarray {
  public static void main(String[] args) {
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    System.out.println(maxSubArray(nums));
  }

  static int maxSubArray(int[] nums) {
    int result = Integer.MIN_VALUE, sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum > result) {
        result = sum;
      }

      if (sum < 0) {
        sum = 0;
      }
    }

    return result;
  }
}
