package recursion;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		sc.close();
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {
		if (s.length() == 1)
			return s;
		return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
	}
}
