package utils;

public class Functions {

  public static String toString(int[] arr) {
    String result = "[";

    for (int i = 0; i < arr.length - 1; i++) {
      result += arr[i] + ", ";
    }

    result += arr[arr.length - 1] + "]";

    return result;
  }
}
