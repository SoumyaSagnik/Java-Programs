package geeksForGeeks.doublyLinkedList;

public class CommonFunctions {
	public void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}
