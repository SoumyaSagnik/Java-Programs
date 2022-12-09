package leetcode;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
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
		ListNode result = deleteDuplicates(head);
		cf.traverseList(result);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head;
		ListNode currPlusOne = curr.next;
		while (currPlusOne != null) {
			if (curr.val == currPlusOne.val) {
				curr.next = currPlusOne.next;
				currPlusOne = curr.next;
			} else {
				curr = currPlusOne;
				currPlusOne = curr.next;
			}
		}
		return head;
	}

	// OR
	public ListNode deleteDuplicates2(ListNode head) {
		if (head == null)
			return head;
		ListNode node = head;
		while (head.next != null) {
			if (head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return node;
	}
}
