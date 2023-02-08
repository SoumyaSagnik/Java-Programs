package interview;

import java.util.Scanner;

/*
 * Given an array, return index of zero preceding the longest sequence of ones
 * [1,1,0,1,1,1,0,1] -> 2
 * [1,1,1,1,1,0,1,1,1] -> 5
 */

public class PreceedingZeroOfLongestContiuousOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " values");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(preecedingZeroIndex(arr));
	}

	public static int preecedingZeroIndex(int[] arr) {
		int index = -1;
		int currentOneCount = 0;
		int maxOneCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				currentOneCount++;
			} else {
				if (currentOneCount > maxOneCount) {
					maxOneCount = currentOneCount;
					index = i - maxOneCount - 1 == -1 ? maxOneCount : i - maxOneCount - 1;
				}
				currentOneCount = 0;
			}
			
		}
		return index;
	}
}
