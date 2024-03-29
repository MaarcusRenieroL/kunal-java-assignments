package easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;

    int[] result = twoSum(nums, target);

    System.out.println(Arrays.toString(result));
  }

  static int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        result[0] = map.get(target - nums[i]);
        result[1] = i;
        break;
      } else {
        map.put(nums[i], i);
      }
    }

    return result;
  }
}
