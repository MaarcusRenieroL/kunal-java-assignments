package medium;

public class KthLargestElement {
  public static void main(String[] args) {
    System.out.println(findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
  }

  static int findKthLargest(int[] n, int k) {
    n = merge(n);

    return n[n.length - k];
  }

  static int[] merge(int[] n) {
    if (n.length == 1) {
      return n;
    }

    int m = n.length / 2;

    int[] l = new int[m], r = new int[n.length - m];

    for (int i = 0; i < m; i++) {
      l[i] = n[i];
    }

    for (int i = m; i < n.length; i++) {
      r[i - m] = n[i];
    }

    l = merge(l);
    r = merge(r);

    return mergeSort(l, r);
  }

  static int[] mergeSort(int[] l, int[] r) {
    int[] m = new int[l.length + r.length];
    int i = 0, j = 0, k = 0;

    while ((i < l.length) && (j < r.length)) {
      if (l[i] < r[j]) {
        m[k++] = l[i++];
      } else {
        m[k++] = r[j++];
      }
    }

    while (i < l.length) {
      m[k++] = l[i++];
    }

    while (j < r.length) {
      m[k++] = r[j++];
    }

    return m;
  }
}
