package hard;

public class GoodArray {
  public static void main(String[] args) {
    int[] nums = { 12, 5, 7, 23 };

    System.out.println(isGoodArray(nums));
  }

  static boolean isGoodArray(int[] nums) {
    int x = nums[0], y;

    for (int n : nums) {
      while (n > 0) {
        y = x % n;
        x = n;
        n = y;
      }
    }

    return x == 1;
  }
}
