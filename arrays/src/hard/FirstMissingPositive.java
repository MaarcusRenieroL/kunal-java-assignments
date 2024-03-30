package hard;

public class FirstMissingPositive {
  public static void main(String[] args) {
    int[] nums = { 3, 4, -1, 1 };
    System.out.println(firstMissingPositive(nums));
  }

  static int firstMissingPositive(int[] nums) {
    int[] arr = new int[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0 && nums[i] <= nums.length) {
        arr[nums[i]] = 1;
      }
    }

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == 0) {
        return i;
      }
    }

    return arr.length;
  }
}
