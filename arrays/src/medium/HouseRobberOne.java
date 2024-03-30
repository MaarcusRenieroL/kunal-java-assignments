package medium;

public class HouseRobberOne {
  public static void main(String[] args) {
    int arr[] = { 2, 7, 9, 3, 1 };

    System.out.println(rob(arr));
  }

  static int rob(int[] nums) {
    if (nums.length < 2) {
      return nums[0];
    }

    int[] dp = new int[nums.length];

    dp[0] = nums[0];

    if (nums[1] > nums[0]) {
      dp[1] = nums[1];
    } else {
      dp[1] = nums[0];
    }

    for (int i = 2; i < nums.length; i++) {
      int sum = dp[i - 2] + nums[i];

      if (sum > dp[i - 1]) {
        dp[i] = sum;
      } else {
        dp[i] = dp[i - 1];
      }
    }

    return dp[nums.length - 1];
  }
}
