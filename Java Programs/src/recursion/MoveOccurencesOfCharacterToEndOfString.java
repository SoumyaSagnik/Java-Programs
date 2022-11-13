package recursion;

import java.util.Scanner;

public class MoveOccurencesOfCharacterToEndOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Enter target character");
		char c = sc.next().charAt(0);
		sc.close();
		System.out.println(moveToEnd(s, c, 0, "", 0));
		;
	}

	public static String moveToEnd(String s, char c, int index, String newString, int count) {
		if (index == s.length()) {
			for (int i = 0; i < count; i++)
				newString += String.valueOf(c);
			return newString;
		}
		if (s.charAt(index) != c) {
			return moveToEnd(s, c, index + 1, newString + String.valueOf(s.charAt(index)), count);
		} else {
			return moveToEnd(s, c, index + 1, newString, count + 1);
		}
	}
}
