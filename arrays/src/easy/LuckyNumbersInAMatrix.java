package easy;

import java.util.List;
import java.util.ArrayList;

public class LuckyNumbersInAMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 3, 7, 8 },
        { 9, 11, 13 },
        { 15, 16, 17 }
    };

    List<Integer> result = luckyNumbers(matrix);

    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
  }

  static List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      int min = Integer.MAX_VALUE, index = -1;

      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] < min) {
          min = matrix[i][j];
          index = j;
        }
      }

      boolean isLucky = true;

      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[j][index] > min) {
          isLucky = false;
        }
      }

      if (isLucky) {
        result.add(min);
      }

    }

    return result;
  }
}
