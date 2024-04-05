package easy;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
  }

  static int search(int[] n, int t) {
    int s = 0, e = n.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (n[m] == t) {
        return m;
      } else if (n[m] > t) {
        e = m - 1;
      } else {
        s = m + 1;
      }
    }

    return -1;
  }
}
