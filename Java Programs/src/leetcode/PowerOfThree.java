package leetcode;

import java.util.Scanner;

public class PowerOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		System.out.println(powerOfThree(n));
	}

	public static boolean powerOfThree(int n) {
		if (n <= 0)
			return false;
		for (int i = 0; Math.pow(3, i) <= n; i++) {
			if (Math.pow(3, i) == n)
				return true;
		}
		return false;
	}
}
