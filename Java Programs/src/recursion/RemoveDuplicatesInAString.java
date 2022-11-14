package recursion;

import java.util.Scanner;

public class RemoveDuplicatesInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		sc.close();
		System.out.println(removeDuplicates(s, "", 0));
		System.out.println("----------------------------------");
		System.out.println(removeDuplicates(s, ""));
	}

	public static String removeDuplicates(String s, String newString, int index) {
		if (index == s.length())
			return newString;
		if (newString.contains(String.valueOf(s.charAt(index))))
			return removeDuplicates(s, newString, index + 1);
		else
			return removeDuplicates(s, newString + String.valueOf(s.charAt(index)), index + 1);
	}

	public static String removeDuplicates(String s, String newString) {
		if (s.length() == 1) {
			if (newString.contains(s))
				return newString;
			else
				return newString + s;
		}
		if (newString.contains(s.substring(0, 1))) {
			return removeDuplicates(s.substring(1), newString);
		} else
			return removeDuplicates(s.substring(1), newString + s.charAt(0));
	}
}
