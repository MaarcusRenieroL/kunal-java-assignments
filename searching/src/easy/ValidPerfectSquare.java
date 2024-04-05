package easy;

public class ValidPerfectSquare {
  public static void main(String[] args) {
    System.out.println(isPerfectSquare(16));
  }

  static boolean isPerfectSquare(int n) {
    int s = 1, e = n;

    while (s < e) {
      int m = s + (e - s) / 2;

      if (m * m == n) {
        return true;
      } else if (m * m > n) {
        e = m - 1;
      } else {
        s = m + 1;
      }
    }

    return false;
  }
}
