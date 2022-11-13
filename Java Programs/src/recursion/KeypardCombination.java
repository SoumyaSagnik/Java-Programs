package recursion;

import java.util.Scanner;

public class KeypardCombination {
	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter keypad buttons");
		String s = sc.next();
		sc.close();
		printCombinations(s, 0, "");
	}

	public static void printCombinations(String s, int index, String combination) {
		if (index == s.length()) {
			System.out.println(combination);
			return;
		}
		String mapping = keypad[s.charAt(index) - '0'];
		for (int i = 0; i < mapping.length(); i++) {
			printCombinations(s, index + 1, combination + mapping.charAt(i));
		}
	}
}
