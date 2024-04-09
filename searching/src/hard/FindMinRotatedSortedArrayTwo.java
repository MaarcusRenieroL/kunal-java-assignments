package hard;

public class FindMinRotatedSortedArrayTwo {
  public static void main(String[] args) {
    int[] n = { 1, 3, 5 };

    System.out.println(findMin(n));
  }

  static int findMin(int[] n) {
    int r = n[0];
    for (int i = 1; i < n.length; i++) {
      r = (r < n[i]) ? r : n[i];
    }

    return r;
  }
}
