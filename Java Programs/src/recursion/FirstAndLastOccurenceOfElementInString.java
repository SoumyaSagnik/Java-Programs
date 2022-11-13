package recursion;

import java.util.Scanner;

public class FirstAndLastOccurenceOfElementInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Enter target");
		String k = sc.next();
		sc.close();
		firstAndLastOccurence(s, k.charAt(0), 0, -1, -1);
	}

	public static void firstAndLastOccurence(String s, char target, int index, int first, int last) {
		if (s.length() == index) {
			System.out.println("First occurence = " + first);
			System.out.println("Last occurence = " + last);
			return;
		}
		if (s.charAt(index) == target) {
			if (first == -1) {
				first = index;
				last = index;
			} else
				last = index;
		}
		firstAndLastOccurence(s, target, index + 1, first, last);
	}
}
