package medium;

public class SetMatrixZeros {
  public static void main(String[] args) {
    int[][] matrix = {
        { 0, 1, 2, 0 },
        { 3, 4, 5, 2 },
        { 1, 3, 1, 5 }
    };

    setZeros(matrix);

    for (int[] row : matrix) {
      for (int col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }

  }

  static void setZeros(int[][] matrix) {
    int col = 0;

    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        col = 1;
      }

      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = matrix[0][j] = 0;
        }
      }
    }

    for (int i = matrix.length - 1; i >= 0; i--) {
      for (int j = matrix[0].length - 1; j >= 1; j--) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }

      if (col == 1) {
        matrix[i][0] = 0;
      }
    }

  }
}
