package easy;

public class ReshapeTheMatrix {
  public static void main(String[] args) {
    int[][] m = {
        { 1, 2 },
        { 3, 4 }
    };

    int[][] r = matrixReshape(m, 1, 4);

    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[i].length; j++) {
        System.out.print(r[i][j] + " ");
      }

      System.out.println();
    }
  }

  static int[][] matrixReshape(int[][] m, int r, int c) {
    int[][] res = new int[r][c];
    int x = 0, y = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        res[x][y] = m[i][j];
        y++;

        if (y == c) {
          y = 0;
          x++;
        }
      }
    }

    return res;
  }
}
