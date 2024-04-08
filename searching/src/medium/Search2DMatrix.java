package medium;

public class Search2DMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 3, 5, 7 },
        { 10, 11, 16, 20 },
        { 23, 30, 34, 60 }
    };
    int target = 3;

    System.out.println(searchMatrix(matrix, target));
  }

  static boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix[0].length, p1 = 0, p2 = n - 1;

    while (p1 < n && p2 >= 0) {
      if (matrix[p1][p2] == target) {
        return true;
      } else if (matrix[p1][p2] > target) {
        p2--;
      } else {
        p1++;
      }
    }

    return false;
  }
}
