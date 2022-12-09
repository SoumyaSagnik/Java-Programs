package geeksForGeeks.doublyLinkedList;

public class ReverseDoublyLinkedList {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);

		n1.next = n2;
		n2.prev = n1;
		n2.next = n3;
		n3.prev = n2;
		n3.next = n4;
		n4.prev = n3;

		CommonFunctions cf = new CommonFunctions();
		System.out.println("Before:");
		cf.printList(n1);

		Node reverseList = reverseDoublyLinkedList(n1);
		System.out.println("After:");
		cf.printList(reverseList);
	}

	public static Node reverseDoublyLinkedList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
	}
}
