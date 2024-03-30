package medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] result = searchRange(nums, target);

    System.out.println(result[0] + " " + result[1]);
  }

  static int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    int l = 0, r = nums.length - 1, index = -1;

    while (l <= r) {
      int m = (l + r) / 2;

      if (nums[m] == target) {
        index = m;
        break;
      } else if (nums[m] > target) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }

    if (index == -1) {
      result[0] = -1;
      result[1] = -1;
      return result;
    } else {
      int i = index, j = index;

      while (i >= 0 && nums[i] == target) {
        i--;
      }

      while (j < nums.length && nums[j] == target) {
        j++;
      }

      result[0] = i + 1;
      result[1] = j - 1;
    }

    return result;
  }
}
