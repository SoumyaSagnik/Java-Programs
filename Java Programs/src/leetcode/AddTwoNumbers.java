package leetcode;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		String n1 = sc.next();
		System.out.println("Enter second number");
		String n2 = sc.next();
		sc.close();

		ListNode l1 = numberToList(n1);
		ListNode l2 = numberToList(n2);
		ListNode sum = addTwoNumbers(l1, l2);
		traverseList(sum);
	}

	public static ListNode createNode(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null)
			return newNode;
		ListNode curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = newNode;
		return head;
	}

	public static ListNode numberToList(String n) {
		ListNode head = null;
		while (n.length() > 0) {
			head = createNode(head, Integer.parseInt(n.substring(n.length() - 1)));
			n = n.substring(0, n.length() - 1);
		}
		return head;
	}

	public static void traverseList(ListNode head) {
		if (head == null)
			return;
		System.out.print(head.val);
		traverseList(head.next);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String n1 = listToNumber(l1);
		String n2 = listToNumber(l2);

		BigInteger a = new BigInteger(n1);
		BigInteger b = new BigInteger(n2);
		BigInteger sum = a.add(b);
		return numberToList(String.valueOf(sum));
	}

	public static String listToNumber(ListNode head) {
		String num = "";
		while (head != null) {
			num += head.val;
			head = head.next;
		}
		StringBuilder sb = new StringBuilder(num);
		return sb.reverse().toString();
	}

}