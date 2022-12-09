package patterns;

import java.util.Scanner;

/*
 * 111
 * 222
 * 333 ...
 * Column changes as row changes
 */

public class NcrossNRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(i + 1);
			System.out.println();
		}
	}
}
