package geeksForGeeks.doublyLinkedList;

import java.util.Scanner;

public class InsertAtEndOfDoublyLinkedList {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);

		n1.next = n2;
		n2.prev = n1;
		n2.next = n3;
		n3.prev = n2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be inserted");
		int n = sc.nextInt();
		sc.close();

		CommonFunctions cf = new CommonFunctions();
		cf.printList(n1);
		cf.printList(insertAtEnd(n1, n));
		System.out.println();
		cf.printList(insertAtEnd(null, n));
	}

	public static Node insertAtEnd(Node head, int n) {
		Node newNode = new Node(n);
		if (head == null)
			return newNode;
		Node curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = newNode;
		newNode.prev = curr;
		return head;
	}
}
