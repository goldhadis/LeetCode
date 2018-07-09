package cn.com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请给出一个数组： ");
		String str = in.next();
		String[] arrayString = str.split(",");
		int[] arrayInt = new int[arrayString.length];
//		把数组内所有字符变成整型
		for(int count=0;count<arrayString.length;count++) {
			arrayInt[count] = Integer.parseInt(arrayString[count]);			
		}
		System.out.print("请输入一个目标数据： ");;
		int target = in.nextInt();
//		Arrays.toString的作用是把数组以字符串形式打印出来，不然打印的是内存地址
		System.out.println(Arrays.toString(twoSum(arrayInt,target)));
	}
	public static int[] twoSum(int[] nums,int target) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					int[] arraydata = new int[2];
//					下标返回到一个新的数组
					arraydata[0] = i;
					arraydata[1] = j;
					return arraydata;
				}
			}
		}
		return null;
	}

}
