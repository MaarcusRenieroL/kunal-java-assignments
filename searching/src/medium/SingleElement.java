package medium;

public class SingleElement {
  public static void main(String[] args) {
    int[] n = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

    System.out.println(singleNonDuplicate(n));
  }

  static int singleNonDuplicate(int[] n) {
    int l = 0, r = n.length - 1;

    while (l < r) {
      int m = (l + r) / 2;
      if (m % 2 == 1) {
        m--;
      }

      if (n[m] != n[m + 1]) {
        r = m;
      } else {
        l = m + 2;
      }
    }

    return n[l];
  }

}
