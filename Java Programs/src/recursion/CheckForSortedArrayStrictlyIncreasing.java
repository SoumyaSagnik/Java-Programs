package recursion;

import java.util.Scanner;

public class CheckForSortedArrayStrictlyIncreasing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " values");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println(checkSortedArray(arr, 0));
	}

	public static boolean checkSortedArray(int[] arr, int index) {
		if (arr.length == 0 || arr.length == 1)
			return true;
		if (index == arr.length - 2) {
			if (arr[index] < arr[index + 1])
				return true;
		}
		if (arr[index] < arr[index + 1])
			return checkSortedArray(arr, index + 1);
		else
			return false;
	}
}
