package geeksForGeeks.linkedList;

import java.util.Scanner;

public class InsertAtGivenPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position");
		int p = sc.nextInt();
		System.out.println("Enter value");
		int n = sc.nextInt();
		sc.close();

		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();

		// null
		Node head = null;
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = insertAtPosition(head, n, p);
		traversal.recursiveTraversal(head);

		// multiple
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		System.out.println("\nBefore");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = insertAtPosition(head, n, p);
		traversal.recursiveTraversal(head);
	}

	public static Node insertAtPosition(Node head, int n, int p) {
		Node node = new Node(n);
		if (head == null)
			return node;
		if (p <= 1) {
			node.next = head;
			return node;
		}
		Node curr = head;
		for (int i = 1; i < p - 1; i++) {
			if (curr.next != null)
				curr = curr.next;
		}
		node.next = curr.next;
		curr.next = node;
		return head;
	}
}
