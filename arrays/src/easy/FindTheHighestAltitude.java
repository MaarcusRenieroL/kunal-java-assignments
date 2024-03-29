package easy;

public class FindTheHighestAltitude {
  public static void main(String[] args) {
    int[] gain = { -4, -3, -2, -1, 4, 3, 2 };

    System.out.println(largestAltitude(gain));
  }

  static int largestAltitude(int[] gain) {
    int result = 0, max = 0;

    for (int i = 0; i < gain.length; i++) {
      max += gain[i];

      if (result < max) {
        result = max;
      }
    }

    return result;
  }
}
