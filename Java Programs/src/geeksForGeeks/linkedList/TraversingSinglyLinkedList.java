package geeksForGeeks.linkedList;

public class TraversingSinglyLinkedList {
	public static void main(String[] args) {
		traverseSinglyLinkedList(null);
		System.out.println();
		Node head = new Node(10);
		traverseSinglyLinkedList(head);
		System.out.println();
		Node t1 = new Node(20);
		Node t2 = new Node(30);

		head.next = t1;
		t1.next = t2;
		traverseSinglyLinkedList(head);
	}

	public static void traverseSinglyLinkedList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
