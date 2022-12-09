package leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class CommonFunctions {

	/*
	 * Inserts element at end of list
	 */
	public ListNode createNode(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null)
			return newNode;
		ListNode curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = newNode;
		return head;
	}

	public void traverseList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
}
