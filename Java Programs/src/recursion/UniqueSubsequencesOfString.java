package recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubsequencesOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		sc.close();
		Set<String> aset = new HashSet<>();
		uniqueSubsequences(s, "", 0, aset);
	}

	public static void uniqueSubsequences(String s, String newString, int index, Set<String> aset) {
		if (index == s.length()) {
			if (aset.contains(newString))
				return;
			else {
				aset.add(newString);
				System.out.println(newString);
				return;
			}
		}

		uniqueSubsequences(s, newString + s.charAt(index), index + 1, aset);
		uniqueSubsequences(s, newString, index + 1, aset);
	}
}
