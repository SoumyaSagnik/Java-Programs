package patterns;

import java.util.Scanner;

/*
 * 1
 * 2 3
 * 3 4 5
 * n = 3
 */

public class StaircaseV4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= n; i++) {
			int value = i;
			for (int j = 1; j <= i; j++)
				System.out.print(value++ + " ");
			System.out.println();
		}
	}
}
