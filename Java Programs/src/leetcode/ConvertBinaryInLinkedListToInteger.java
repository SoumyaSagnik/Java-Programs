package leetcode;

import java.util.Scanner;

// Given list is not null.

public class ConvertBinaryInLinkedListToInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CommonFunctions cf = new CommonFunctions();
		System.out.println("Enter list size");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " values");
		ListNode head = null;
		for (int i = 0; i < n; i++)
			head = cf.createNode(head, sc.nextInt());
		sc.close();
		System.out.println(getDecimalValue(head));
	}

	public static int getDecimalValue(ListNode head) {
		String num = "";
		while (head != null) {
			num += head.val;
			head = head.next;
		}
		return Integer.parseInt(num, 2);
	}
}
