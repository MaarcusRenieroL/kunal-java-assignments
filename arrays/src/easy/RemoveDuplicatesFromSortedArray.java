package easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2 };
    System.out.println(Arrays.toString(removeDuplicates(nums)));
  }

  static int[] removeDuplicates(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }

    int[] result = new int[set.size()];

    int i = 0;

    for (int num : set) {
      result[i++] = num;
    }

    return result;
  }
}
