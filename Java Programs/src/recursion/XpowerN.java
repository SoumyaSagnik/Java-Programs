package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class XpowerN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String n = sc.next();
		System.out.println("Enter exponent");
		int e = sc.nextInt();
		sc.close();
		BigInteger x = new BigInteger(n);
		System.out.println(xPowerN(x, e));
		System.out.println("------------------------------------");
		System.out.println(dp(x, e)); // Optimized
	}

	public static BigInteger xPowerN(BigInteger x, int n) {
		if (x.equals(BigInteger.ZERO))
			return BigInteger.ZERO;
		if (n == 0)
			return BigInteger.ONE;
		return x.multiply(xPowerN(x, n - 1));
	}

	public static BigInteger dp(BigInteger x, int n) {
		if (x.equals(BigInteger.ZERO))
			return BigInteger.ZERO;
		if (n == 0)
			return BigInteger.ONE;
		if (n % 2 == 0)
			return dp(x, n / 2).multiply(dp(x, n/2));
		else
			return x.multiply(dp(x, n / 2).multiply(dp(x, n/2)));
	}
}
