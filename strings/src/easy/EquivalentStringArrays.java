package easy;

public class EquivalentStringArrays {
  public static void main(String[] args) {
    String[] word1 = { "ab", "c" }, word2 = { "a", "bc" };

    System.out.println(arrayStringsAreEqual(word1, word2));
  }

  static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String w1 = "", w2 = "";

    for (String w : word1) {
      w1 += w;
    }

    for (String w : word2) {
      w2 += w;
    }

    return w1.equals(w2);
  }
}
