package easy;

public class NumberOfGoodPairs {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1, 1, 3 };

    System.out.println(numIdenticalPairs(nums));
  }

  static int numIdenticalPairs(int[] nums) {
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if ((i < j) && (nums[i] == nums[j])) {
          result += 1;
        }
      }
    }

    return result;
  }
}
