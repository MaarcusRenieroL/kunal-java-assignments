package easy;

public class HigherLower {
  static int p = 6;

  public static void main(String[] args) {
    System.out.println(guessNumber(10));
  }

  static int guessNumber(int n) {
    int l = 1, r = n;

    while (l < r) {
      int m = l + (r - l) / 2;

      if (guess(m) == -1) {
        r = m - 1;
      } else if (guess(m) == 1) {
        l = m + 1;
      } else {
        return m;
      }
    }

    return -1;
  }

  static int guess(int n) {
    if (n > p) {
      return -1;
    } else if (n < p) {
      return 1;
    } else {
      return 0;
    }
  }
}
