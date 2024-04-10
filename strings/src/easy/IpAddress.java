package easy;

public class IpAddress {
  public static void main(String[] args) {
    System.out.println(defangIPaddr("1.1.1.1"));
  }

  static String defangIPaddr(String a) {
    return a.replace(".", "[.]");
  }
}
