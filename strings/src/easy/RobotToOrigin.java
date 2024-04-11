package easy;

public class RobotToOrigin {
  public static void main(String[] args) {
    System.out.println(judgeCircle("UUDD"));
  }

  static boolean judgeCircle(String m) {
    int l = 0, r = 0, u = 0, d = 0;

    for (char c : m.toCharArray()) {
      if (c == 'U') {
        u++;
      } else if (c == 'D') {
        d++;
      } else if (c == 'L') {
        l++;
      } else {
        r++;
      }
    }

    return (u == d && l == r);
  }
}
