package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a whole number");
		String n = sc.next();
		sc.close();
		BigInteger b = new BigInteger(n);
		System.out.println("Factorial of " + n + " is: " + factorial(b));
	}

	public static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}
