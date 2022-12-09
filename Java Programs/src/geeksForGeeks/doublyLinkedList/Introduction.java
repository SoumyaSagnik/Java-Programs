package geeksForGeeks.doublyLinkedList;

public class Introduction {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.prev = head;
		head.next.next = new Node(30);
		head.next.next.prev = head.next;

		traverseList(head);
		System.out.println(head.next.next.prev.data);
	}

	public static void traverseList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}
