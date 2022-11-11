package concepts;

import java.util.Scanner;

public class BinarySearchRecursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements in sorted order");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter element to be searched");
		int k = sc.nextInt();
		sc.close();
		System.out.println("Element present at index: " + binarySearch(arr, 0, arr.length - 1, k));
	}

	public static int binarySearch(int[] arr, int left, int right, int key) {
		if (left > right)
			return -1;
		int mid = (left + right) / 2;
		if (key == arr[mid])
			return mid;
		else if (key < arr[mid])
			return binarySearch(arr, left, mid - 1, key);
		else
			return binarySearch(arr, mid + 1, right, key);
	}
}
