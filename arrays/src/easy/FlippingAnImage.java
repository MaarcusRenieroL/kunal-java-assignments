package easy;

import java.util.Arrays;

public class FlippingAnImage {
  public static void main(String[] args) {
    int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
    int[][] result = flipAndInvertImage(image);

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }

  }

  static int[][] flipAndInvertImage(int[][] image) {
    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image.length; j++) {
        if (image[i][j] == 0) {
          image[i][j] = 1;
        } else if (image[i][j] == 1) {
          image[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < image.length; i++) {
      int start = 0;
      int end = image.length - 1;

      while (start < end) {
        swap(i, start, end, image);
        start++;
        end--;
      }
    }

    return image;
  }

  static void swap(int row, int a, int b, int[][] image) {
    int temp = image[row][a];
    image[row][a] = image[row][b];
    image[row][b] = temp;
  }
}
