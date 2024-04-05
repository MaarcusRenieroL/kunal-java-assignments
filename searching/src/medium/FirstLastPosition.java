package medium;

public class FirstLastPosition {
  public static void main(String[] args) {
    int[] r = searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);

    System.out.println(r[0] + " " + r[1]);

  }

  static int[] searchRange(int[] n, int t) {
    int[] res = new int[] { -1, -1 };
    int l = 0, r = n.length - 1, i = 0;

    while (l <= r) {
      int m = l + (r - l) / 2;

      if (n[m] == t) {
        i = m;
        break;
      } else if (n[m] > t) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }

    if (i == -1) {
      return res;
    } else {
      l = i;
      r = i;

      while (l >= 0 && n[l] == t) {
        l--;
      }

      while (r < n.length && n[r] == t) {
        r++;
      }
    }

    res[0] = l + 1;
    res[1] = r - 1;

    return res;
  }
}
