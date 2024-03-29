package easy;

import java.util.Arrays;

public class CheckIfTheSentenceIsAPanagram {
  public static void main(String[] args) {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";

    System.out.println(checkIfPanagram(sentence));
  }

  static boolean checkIfPanagram(String sentence) {
    int k = 0;
    String alphabets = "abcdefghijklmnopqrstuvwxyz";

    char[] sentenceArray = sentence.toCharArray();
    Arrays.sort(sentenceArray);

    String convertedSentence = new String(sentenceArray);

    for (int i = 0; i < sentence.length(); i++) {
      if (k == 26) {
        break;
      }

      if (convertedSentence.charAt(i) == alphabets.charAt(k)) {
        k++;
      }
    }

    if (k == 26) {
      return true;
    } else {
      return false;
    }

  }
}
