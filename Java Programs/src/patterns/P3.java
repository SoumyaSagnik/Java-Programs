package patterns;

import java.util.Scanner;

/*
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * when n = 4
 */

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
