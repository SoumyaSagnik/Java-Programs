package geeksForGeeks.linkedList;

import java.util.Scanner;

public class InsertionAtBeginningOfSinglyLinkedList {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node head1 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be inserted at beginning");
		int n = sc.nextInt();
		sc.close();
		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();
		System.out.println("Before:");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = insertAtBeginning(head, n);
		traversal.recursiveTraversal(head);
		// with empty list
		System.out.println("\n------------------------");
		System.out.println("Before:");
		traversal.recursiveTraversal(head1);
		System.out.println("After:");
		head1 = insertAtBeginning(head1, n);
		traversal.recursiveTraversal(head1);

	}

	public static Node insertAtBeginning(Node head, int n) {
		Node newHead = new Node(n);
		newHead.next = head;
		return newHead;
	}
}
