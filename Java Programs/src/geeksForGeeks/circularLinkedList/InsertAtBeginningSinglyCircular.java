package geeksForGeeks.circularLinkedList;

import java.util.Scanner;

public class InsertAtBeginningSinglyCircular {
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

		CommonFunctions cf = new CommonFunctions();
		cf.printList(n1);
		cf.printList(insertAtBeginning(n1, n));
		System.out.println();
		cf.printList(insertAtBeginning(null, n));
		System.out.println("--------------------");

		n1 = new Node(10);
		n2 = new Node(20);
		n3 = new Node(30);

		n1.next = n2;
		n2.next = n3;
		n3.next = n1;
		
		cf.printList(insertAtBeginningPro(n1, n));
		cf.printList(insertAtBeginningPro(null, n));
	}

	public static Node insertAtBeginning(Node head, int n) {
		Node newHead = new Node(n);
		if (head == null) {
			newHead.next = newHead;
			return newHead;
		}
		Node curr = head;
		while (curr.next != head)
			curr = curr.next;
		newHead.next = head;
		curr.next = newHead;
		return newHead;
	}

	// O(1)
	public static Node insertAtBeginningPro(Node head, int n) {
		Node newHead = new Node(n);
		if (head == null) {
			newHead.next = newHead;
			return newHead;
		}
		int c = 0;
		newHead.next = head.next;
		head.next = newHead;
		c = head.data;
		head.data = newHead.data;
		newHead.data = c;
		return head;
	}
}
