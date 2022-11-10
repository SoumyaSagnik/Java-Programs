package concepts;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements in sorted order");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched");
		int k = sc.nextInt();
		sc.close();
		System.out.println("Element present at index: " + binarySearch(arr, 0, arr.length - 1, k));
	}

	public static int binarySearch(int[] arr, int left, int right, int key) {
		int mid = (left + right) / 2;
		while (left <= right) {
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
			mid = (left + right) / 2;
		}
		
		return -1;
	}
}
