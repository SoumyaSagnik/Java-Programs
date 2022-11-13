package recursion;

import java.util.Scanner;

/*
 * Note: String order is followed in subsequences
 * Eg: abc, ca is not valid
 */

public class SubsequencesOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		sc.close();
		subsequences(s, 0, "");
	}

	public static void subsequences(String s, int index, String newString) {
		if (index == s.length()) {
			System.out.println(newString);
			return;
		}
		// to be
		subsequences(s, index + 1, newString + s.charAt(index));
		// not to be
		subsequences(s, index + 1, newString);
	}
}

// 2^n