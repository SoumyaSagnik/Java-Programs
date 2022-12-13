package geeksForGeeks.circularLinkedList;

public class DeleteHeadSinglyCircular {
	public static void main(String[] args) {
		CommonFunctions cf = new CommonFunctions();
		int[] arr = { 10, 20, 30 };
		int[] arr2 = { 10 };
		int[] arr3 = { 10, 20 };
		Node head = cf.createNodes(arr);
		Node head2 = cf.createNodes(arr2);
		Node head3 = cf.createNodes(arr3);
		Node newHead = deleteHeadSinglyCircularNaive(head);
		cf.printList(newHead);
		cf.printList(deleteHeadSinglyCircularNaive(head2));
		cf.printList(deleteHeadSinglyCircularNaive(head3));

		System.out.println("----------------------------");
		head = cf.createNodes(arr);
		head2 = cf.createNodes(arr2);
		head3 = cf.createNodes(arr3);
		cf.printList(deleteHeadSinglyCircularPro(head));
		cf.printList(deleteHeadSinglyCircularPro(head2));
		cf.printList(deleteHeadSinglyCircularPro(head3));
	}

	// Naive
	public static Node deleteHeadSinglyCircularNaive(Node head) {
		if (head == null || head.next == head)
			return null;
		Node curr = head;
		while (curr.next != head)
			curr = curr.next;
		curr.next = head.next;
		head.next = null;
		return curr.next;
	}

	// O(1)
	public static Node deleteHeadSinglyCircularPro(Node head) {
		if (head == null || head.next == head)
			return null;
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}

}
