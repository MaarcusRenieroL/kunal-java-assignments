package medium;

public class SpiralMatrixTwo {
  public static void main(String[] args) {

    int[][] result = generateMatrix(3);

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }

  }

  static int[][] generateMatrix(int n) {
    int[][] result = new int[n][n];

    if (result == null || result.length == 0) {
      return result;
    }

    int left = 0, right = result[0].length - 1, top = 0, bottom = result.length - 1, count = 1;

    while ((left <= right) && (top <= bottom)) {
      for (int i = left; i <= right; i++) {
        result[top][i] = count++;
      }

      top++;

      for (int i = top; i <= bottom; i++) {
        result[i][right] = count++;
      }

      right--;

      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          result[bottom][i] = count++;
        }

        bottom--;
      }

      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          result[i][left] = count++;
        }

        left++;
      }

    }

    return result;
  }
}
