package com.soo.leetcode;

public class Nim_02 {

  public static void main(String[] args) {
    System.out.println(canWin(0));
  }

  //Java solution O(1) time
  public static boolean canWin(int n) {
    return !(n % 4 == 0);
  }
}
