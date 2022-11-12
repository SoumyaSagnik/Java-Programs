package recursion;

import java.util.Scanner;

public class SumofFirstnNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		System.out.println(sumOfNaturalNumbers(n));
	}

	public static int sumOfNaturalNumbers(int n) {
		if (n == 0)
			return n;
		return n + sumOfNaturalNumbers(n - 1);
	}
}
