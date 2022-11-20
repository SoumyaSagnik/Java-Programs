package geeksForGeeks.linkedList;

import java.util.Scanner;

public class SearchLinkedListRecursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be searched");
		int n = sc.nextInt();
		sc.close();
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);

		System.out.println("Element present at: " + searchLinkedList(head, n, 1));
	}

	public static int searchLinkedList(Node head, int n, int position) {
		if (head == null)
			return -1;
		if (head.data == n)
			return position;
		return searchLinkedList(head.next, n, position + 1);
	}
}
