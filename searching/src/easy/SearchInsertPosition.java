package easy;

public class SearchInsertPosition {
  public static void main(String[] args) {
    System.out.println(searchPosition(new int[] { 1, 3, 5, 6 }, 2));
  }

  static int searchPosition(int[] a, int t) {
    int l = 0, r = a.length - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;

      if (a[m] == t) {
        return m;
      } else if (a[m] > t) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }

    return l;
  }
}
