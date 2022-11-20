package geeksForGeeks.linkedList;

import java.util.Scanner;

public class SearchInLinkedListIterative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be searched");
		int n = sc.nextInt();
		sc.close();
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);

		System.out.println("Element present at: " + searchLinkedList(head, n));
	}

	public static int searchLinkedList(Node head, int n) {
		int position = 0;
		while (head != null) {
			if (head.data == n)
				return position + 1;
			head = head.next;
			position++;
		}
		return -1;
	}
}
