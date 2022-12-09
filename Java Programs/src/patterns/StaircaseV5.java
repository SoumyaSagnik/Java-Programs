package patterns;

import java.util.Scanner;

/*
 *  1
 *  2 1
 *  3 2 1
 *  n = 3
 */

public class StaircaseV5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 0; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
