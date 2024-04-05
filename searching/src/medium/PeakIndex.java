package medium;

public class PeakIndex {
  public static void main(String[] args) {
    System.out.println(peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));
  }

  static int peakIndexInMountainArray(int[] a) {
    int s = 0, e = a.length - 1;

    if (a.length >= 3) {

      while (s < e) {
        int m = s + (e - s) / 2;

        if (a[m] > a[m + 1]) {
          e = m;
        } else {
          s = m + 1;
        }
      }
    }

    return s;
  }
}
