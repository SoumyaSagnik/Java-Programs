package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter " + n + " values");
		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}

	public static int[] getConcatenation(int[] nums) {
		int[] arr = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++)
			arr[i] = nums[i];
		for (int i = nums.length; i < arr.length; i++)
			arr[i] = nums[i - nums.length];
		return arr;
	}
}
