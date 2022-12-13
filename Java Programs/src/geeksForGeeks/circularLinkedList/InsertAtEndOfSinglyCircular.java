package geeksForGeeks.circularLinkedList;

import java.util.Scanner;

public class InsertAtEndOfSinglyCircular {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);

		n1.next = n2;
		n2.next = n3;
		n3.next = n1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be inserted");
		int n = sc.nextInt();
		sc.close();

		Node n11 = new Node(1);
		n11.next = n11;

		CommonFunctions cf = new CommonFunctions();
		cf.printList(insertAtEndSinglyCircular(n1, n));
		cf.printList(insertAtEndSinglyCircular(null, n));
		cf.printList(insertAtEndSinglyCircular(n11, n));
		System.out.println("-------------------------");

		n1 = new Node(10);
		n2 = new Node(20);
		n3 = new Node(30);

		n1.next = n2;
		n2.next = n3;
		n3.next = n1;

		cf.printList(insertEndSinglyCircular(n1, n));
		cf.printList(insertEndSinglyCircular(null, n));
	}

	// naive solution
	public static Node insertAtEndSinglyCircular(Node head, int n) {
		Node newNode = new Node(n);
		if (head == null) {
			newNode.next = newNode;
			return newNode;
		}
		Node curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}
		newNode.next = head;
		curr.next = newNode;

		return head;
	}

	// O(1)
	public static Node insertEndSinglyCircular(Node head, int n) {
		Node newNode = new Node(n);
		if (head == null) {
			newNode.next = newNode;
			return newNode;
		}
		int c = 0;
		newNode.next = head.next;
		head.next = newNode;
		c = head.data;
		head.data = newNode.data;
		newNode.data = c;
		return head.next;
	}
}
