package easy;

public class TransposeMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int[][] transposeMatrix = transpose(matrix);

    for (int i = 0; i < transposeMatrix.length; i++) {
      for (int j = 0; j < transposeMatrix[i].length; j++) {
        System.out.print(transposeMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int[][] transpose(int[][] matrix) {
    int[][] transposeMatrix = new int[matrix.length][matrix.length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        transposeMatrix[j][i] = matrix[i][j];
      }
    }

    return transposeMatrix;
  }
}
