package geeksForGeeks.doublyLinkedList;

import java.util.Scanner;

public class InsertAtBeginning {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);

		n1.next = n2;
		n2.next = n3;
		n2.prev = n1;
		n3.prev = n2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to insert at beginning");
		int n = sc.nextInt();
		sc.close();

		CommonFunctions cf = new CommonFunctions();
		cf.printList(insertBeginning(n1, n));
		cf.printList(insertBeginning(null, n));
	}

	public static Node insertBeginning(Node head, int data) {
		Node newHead = new Node(data);
		if(head == null)
			return newHead;
		newHead.next = head;
		head.prev = newHead;
		return newHead;
	}
}
