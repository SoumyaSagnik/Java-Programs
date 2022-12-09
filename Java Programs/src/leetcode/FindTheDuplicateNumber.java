package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheDuplicateNumber {
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
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] nums) {
		Map<Integer, Integer> amap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (amap.containsKey(nums[i]))
				amap.put(nums[i], amap.get(nums[i]) + 1);
			else
				amap.put(nums[i], 1);
		}

		for (Map.Entry<Integer, Integer> entry : amap.entrySet()) {
			if (entry.getValue() > 1)
				return entry.getKey();
		}

		return -1;
	}
}
