package soo.leetcode;

public class ReverseString_01 {

  public static void main(String[] args) {
    final String google = "google";

    System.out.println(reverseString1(google));
    System.out.println(reverseString2(google));
    System.out.println(reverseString3(google));
  }

  public static String reverseString1(String s) {
    StringBuffer reverseString = new StringBuffer(s);
    return reverseString.reverse().toString();
  }

  public static String reverseString2(String s) {
    if (s.length() <= 1) {
      return s;
    }

    return reverseString2(s.substring(1)) + s.charAt(0);
  }

  public static String reverseString3(String orig) {
    char[] s = orig.toCharArray();
    int n = s.length;
    int halfLength = n / 2;
    for (int i = 0; i < halfLength; i++) {
      char temp = s[i];
      s[i] = s[n - 1 - i];
      s[n - 1 - i] = temp;
    }
    return new String(s);
  }
}
