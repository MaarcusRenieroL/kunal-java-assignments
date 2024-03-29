package easy;

public class MatrixDiagonalSum {
  public static void main(String[] args) {
    System.out.println(diagonalSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
  }

  static int diagonalSum(int[][] mat) {
    int result = 0, length = mat.length;

    for (int i = 0; i < length; i++) {
      result += mat[i][i];

      if (i != length - i - 1) {
        result += mat[i][length - i - 1];
      }
    }

    return result;
  }
}
