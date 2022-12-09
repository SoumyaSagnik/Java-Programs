package leetcode;

import java.util.Scanner;

public class RemoveLinkedListElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CommonFunctions cf = new CommonFunctions();
		System.out.println("Enter list size");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " values");
		ListNode head = null;
		for (int i = 0; i < n; i++)
			head = cf.createNode(head, sc.nextInt());
		System.out.println("Enter value to be removed");
		int val = sc.nextInt();
		ListNode result = removeElements(head, val);
		cf.traverseList(result);
		sc.close();
	}

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		while (true) {
			if (head.val == val)
				if (head.next != null)
					head = head.next;
				else
					return null;
			else
				break;
		}
		ListNode curr = head;
		while (curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else
				curr = curr.next;
		}
		return head;
	}
}
