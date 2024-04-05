package easy;

public class SmallestLetter {
  public static void main(String[] args) {
    char[] l = new char[] { 'c', 'f', 'j' };
    char t = 'c';

    System.out.println(nextGreatestLetter(l, t));
  }

  static char nextGreatestLetter(char[] l, char t) {
    int s = 0, e = l.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (t < l[m]) {
        e = m - 1;
      } else {
        s = m + 1;
      }
    }

    return l[s % l.length];
  }

}
