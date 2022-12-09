package patterns;

import java.util.Scanner;

/*
 *  AAA
 *  BBB
 *  CCC
 *  n = 3
 */

public class P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();

		int charValue = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print((char)charValue + " ");
			System.out.println();
			charValue++;
		}
	}
}
