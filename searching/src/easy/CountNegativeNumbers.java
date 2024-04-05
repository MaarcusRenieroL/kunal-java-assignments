package easy;

public class CountNegativeNumbers {
  public static void main(String[] args) {
    int[][] g = {
        { 4, 3, 2, -1 },
        { 3, 2, 1, -1 },
        { 1, 1, -1, -2 },
        { -1, -1, -2, -3 }
    };
    System.out.println(countNegatives(g));
  }

  static int countNegatives(int[][] g) {
    int res = 0, r = 0, c = g[0].length - 1;

    while (r < g.length && c >= 0) {
      if (g[r][c] < 0) {
        res += g.length - r;
        c--;
      } else {
        r++;
      }
    }

    return res;
  }
}
