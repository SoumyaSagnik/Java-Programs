package patterns;

import java.util.Scanner;

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * where n = 3
 */

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();

		int value = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print(value++ + " ");
			System.out.println();
		}
	}
}
