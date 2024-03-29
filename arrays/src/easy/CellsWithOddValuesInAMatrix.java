package easy;

public class CellsWithOddValuesInAMatrix {
  public static void main(String[] args) {
    System.out.println(oddCells(2, 3, new int[][] { { 0, 1 }, { 1, 1 } }));
  }

  static int oddCells(int m, int n, int[][] indices) {
    int[][] matrix = new int[m][n];
    int result = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrix[indices[i][0]][j]++;
      }

      for (int j = 0; j < m; j++) {
        matrix[j][indices[i][1]]++;
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] % 2 != 0) {
          result += 1;
        }
      }
    }

    return result;
  }
}
