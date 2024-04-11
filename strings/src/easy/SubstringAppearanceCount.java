package easy;

public class SubstringAppearanceCount {
  public static void main(String[] args) {
    String[] p = { "a", "abc", "bc", "d" };
    String s = "abc";

    System.out.println(numOfStrings(p, s));
  }

  static int numOfStrings(String[] p, String w) {
    int r = 0;

    for (String s : p) {
      if (w.contains(s)) {
        r++;
      }
    }

    return r;
  }
}
