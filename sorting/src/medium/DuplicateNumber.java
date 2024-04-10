package medium;

public class DuplicateNumber {
  public static void main(String[] args) {
    System.out.println(findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
  }

  static int findDuplicate(int[] n) {
    boolean[] v = new boolean[n.length + 1];

    for (int num : n) {
      if (v[num]) {
        return num;
      } else {
        v[num] = true;
      }
    }

    return -1;
  }
}
