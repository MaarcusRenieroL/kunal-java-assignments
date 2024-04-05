package medium;

public class SearchRotatedArray {
  public static void main(String[] args) {
    System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
  }

  static int search(int[] n, int t) {
    int l = 0, r = n.length - 1;

    while (l <= r) {
      int m = (l + r) / 2;

      if (n[m] == t) {
        return m;
      }

      if (n[l] <= n[m]) {
        if (n[l] <= t && t <= n[m]) {
          r = m - 1;
        } else {
          l = m + 1;
        }
      } else {
        if (n[m] < t && t <= n[r]) {
          l = m + 1;
        } else {
          r = m - 1;
        }
      }
    }

    return -1;
  }

}
