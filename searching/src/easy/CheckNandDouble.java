package easy;

public class CheckNandDouble {
  public static void main(String[] args) {
    System.out.println(checkIfExist(new int[] { 10, 2, 5, 3 }));
  }

  static boolean checkIfExist(int[] a) {
    boolean f = false;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if ((a[i] == 2 * a[j]) && (i != j)) {
          f = true;
        }
      }
    }

    return f;
  }
}
