package recursion;

import java.util.Scanner;

public class RemoveDuplicatesInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		sc.close();
		System.out.println(removeDuplicates(s, "", 0));
	}

	public static String removeDuplicates(String s, String newString, int index) {
		if (index == s.length())
			return newString;
		if (newString.contains(String.valueOf(s.charAt(index))))
			return removeDuplicates(s, newString, index + 1);
		else
			return removeDuplicates(s, newString + String.valueOf(s.charAt(index)), index + 1);
	}
}
