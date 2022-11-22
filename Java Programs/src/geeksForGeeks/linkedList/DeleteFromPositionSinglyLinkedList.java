package geeksForGeeks.linkedList;

import java.util.Scanner;

public class DeleteFromPositionSinglyLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position");
		int position = sc.nextInt();
		sc.close();
		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();
		Node head = null;
		head = deleteFromPosition(head, position);
		traversal.recursiveTraversal(head);
		System.out.println();
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head = deleteFromPosition(head, position);
		traversal.recursiveTraversal(head);
	}

	public static Node deleteFromPosition(Node head, int position) {
		if (head == null)
			return null;
		if (head.next == null) {
			if (position == 1)
				return null;
			else {
				System.out.println("Invalid position");
				return head;
			}
		}
		if (position < 1) {
			System.out.println("Invalid position");
			return head;
		}
		if (position == 1) {
			return head.next;
		}
		Node curr = head;
		for (int i = 1; i <= position - 2; i++) {
			curr = curr.next;
			if (curr.next == null) {
				System.out.println("Invalid position");
				return head;
			}
		}
		curr.next = curr.next.next;
		return head;
	}
}
