package recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		fibonacci(0, 1, n);
	}

	public static void fibonacci(int a, int b, int n) {
		if (n == 0)
			return;
		System.out.print(a + " ");
		fibonacci(b, a + b, n - 1);
	}
}
