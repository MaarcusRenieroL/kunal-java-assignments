package easy;

public class GoalParser {
  public static void main(String[] args) {
    System.out.println(interpret("G()(al)"));
  }

  static String interpret(String command) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == 'G') {
        builder.append('G');
      } else if (command.charAt(i) == '(') {
        if (command.charAt(i + 1) == ')') {
          builder.append('o');
        } else {
          builder.append("al");
        }
      }
    }

    return builder.toString();
  }
}
