package easy;

public class KthMissingNumber {
  public static void main(String[] args) {
    System.out.println(findKthPositive(new int[] { 2, 3, 4, 7, 11 }, 5));
  }

  static int findKthPositive(int[] arr, int k) {
    int s = 0, e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] - m - 1 < k) {
        s = m + 1;
      } else {
        e = m - 1;
      }
    }

    return s + k;
  }
}
