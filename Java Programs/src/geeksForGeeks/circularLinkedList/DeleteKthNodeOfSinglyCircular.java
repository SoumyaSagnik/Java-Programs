package geeksForGeeks.circularLinkedList;

import java.util.Scanner;

public class DeleteKthNodeOfSinglyCircular {
	public static void main(String[] args) {
		CommonFunctions cf = new CommonFunctions();
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 10 };
		int[] arr3 = { 10, 20 };
		int[] arr4 = {};
		Node head = cf.createNodes(arr);
		Node head2 = cf.createNodes(arr2);
		Node head3 = cf.createNodes(arr3);
		Node head4 = cf.createNodes(arr4);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of k");
		int k = sc.nextInt();
		sc.close();
		Node n1 = deleteKthSinglyCircular(head, k);
		cf.printList(n1);
		cf.printList(deleteKthSinglyCircular(head2, k));
		cf.printList(deleteKthSinglyCircular(head3, k));
		cf.printList(deleteKthSinglyCircular(head4, k));
	}

	public static Node deleteKthSinglyCircular(Node head, int k) {
		if (head == null || head.next == head)
			return null;
		if (k <= 1) {
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
		Node curr = head;
		for (int i = 0; i < k - 2; i++) {
			curr = curr.next;
			if (curr.next == head)
				return null;
		}
		curr.next = curr.next.next;
		return head;
	}
}
