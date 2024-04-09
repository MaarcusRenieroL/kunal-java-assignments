package easy;

public class MissingNumber {
  public static void main(String[] args) {
    System.out.println(missingNumber(new int[] { 3, 0, 1 }));
  }

  static int missingNumber(int[] nums) {
    int s = 0, ns = 0;

    for (int n : nums) {
      ns += n;
    }

    for (int i = 0; i < nums.length + 1; i++) {
      s += i;
    }

    return s - ns;
  }
}
