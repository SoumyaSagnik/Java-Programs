package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of disks");
		int n = sc.nextInt();
		sc.close();
		towerOfHanoi(n, "S", "H", "D");
	}

	public static void towerOfHanoi(int n, String src, String helper, String destination) {
		if (n == 1) {
			System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
			return;
		}
		towerOfHanoi(n - 1, src, destination, helper);
		System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
		towerOfHanoi(n - 1, helper, src, destination);
	}
}

// Complexity: 2^n