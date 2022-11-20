package geeksForGeeks.linkedList;

import java.util.Scanner;

public class InsertionAtEndOfSinglyLinkedList {
	public static void main(String[] args) {
		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();
		Node head = null;
		System.out.println("Enter element to be inserted");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Before");
		head = insertAtEnd(head, n);
		System.out.println("\nAfter");
		traversal.recursiveTraversal(head);
		System.out.println("\n------------------------------------");

		head = new Node(10);
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		head = insertAtEnd(head, n);
		System.out.println("\nAfter");
		traversal.recursiveTraversal(head);
	}

	public static Node insertAtEnd(Node head, int n) {
		Node node = new Node(n);
		if (head == null)
			return node;
		Node curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = node;
		return head;
	}
}
