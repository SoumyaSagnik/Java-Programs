package geeksForGeeks.doublyLinkedList;

public class DeleteLastNodeOfDoublyLinkedList {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);

		n1.next = n2;
		n2.prev = n1;
		n2.next = n3;
		n3.prev = n2;

		CommonFunctions cf = new CommonFunctions();
		cf.printList(deleteLastNode(n1));
	}

	public static Node deleteLastNode(Node head) {
		if (head == null || head.next == null)
			return null;
		Node curr = head;
		while (curr.next.next != null)
			curr = curr.next;
		curr.next = null;
		return head;
	}
}
