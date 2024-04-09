package medium;

import java.util.*;

public class GroupAnagrams {
  public static void main(String[] args) {
    System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
  }

  static List<List<String>> groupAnagrams(String[] s) {
    HashMap<String, List<String>> m = new HashMap<>();

    for (String w : s) {
      char[] c = w.toCharArray();
      Arrays.sort(c);
      String sa = new String(c);

      if (!m.containsKey(sa)) {
        m.put(sa, new ArrayList<>());
      }

      m.get(sa).add(w);
    }

    return new ArrayList<>(m.values());
  }
}
