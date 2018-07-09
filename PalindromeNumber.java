package cn.com.leetcode;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.print("请输入一个整数： ");
		Scanner ipt = new Scanner(System.in);
		int data = ipt.nextInt();
		System.out.println(isPalindromeNumber(data));
	}
	public static boolean isPalindromeNumber(int x) {
		if(x<0) {
			return false;
		}else {
			String str = ""+x;
			String restr = new StringBuilder(str).reverse().toString();
			if(str.equals(restr)) {
				return true;
			}else {
				return false;
			}
		}
	}

}
