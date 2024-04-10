package easy;

public class SortSentence {
  public static void main(String[] args) {
    System.out.println(sortSentence("is2 sentence4 This1 a3"));
  }

  static String sortSentence(String s) {
    String[] words = s.split(" ");
    String[] result = new String[words.length];

    for (String word : words) {
      result[(word.charAt(word.length() - 1) - '0') - 1] = word.substring(0, word.length() - 1);
    }

    return String.join(" ", result);
  }
}
