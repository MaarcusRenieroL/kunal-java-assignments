package hard;

public class FirstMissingPositive {
  public static void main(String[] args) {
    System.out.println(firstMissingPositive(new int[] { 1, 2, 0 }));
  }

  static int firstMissingPositive(int[] n) {
    int[] a = new int[n.length + 1];

    for (int i = 0; i < n.length; i++) {
      if (n[i] >= 0 && n[i] <= n.length) {
        a[n[i]] = 1;
      }
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        return i;
      }
    }

    return -1;
  }
}
