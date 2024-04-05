package easy;

public class Sqrt {
  public static void main(String[] args) {
    System.out.println(mySqrt(10));
  }

  static int mySqrt(int x) {
    int s = 0, e = x, m = -1;

    while (s <= e) {
      m = s + (e - s) / 2;

      if ((long) m * m > (long) x) {
        e = m - 1;
      } else if (m * m == x) {
        return m;
      } else {
        s = m + 1;
      }
    }

    return Math.round(e);
  }
}
