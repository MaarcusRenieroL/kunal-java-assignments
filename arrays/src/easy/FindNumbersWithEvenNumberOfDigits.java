package easy;

public class FindNumbersWithEvenNumberOfDigits {
  public static void main(String[] args) {
    System.out.println(findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
  }

  static int findNumbers(int[] nums) {
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      int count = countDigit(nums[i]);

      if (count % 2 == 0) {
        result++;
      }
    }

    return result;
  }

  static int countDigit(int num) {
    int result = 0;

    while (num != 0) {
      num = num / 10;
      result += 1;
    }

    return result;
  }
}
