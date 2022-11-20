package geeksForGeeks.linkedList;

public class DeleteLastNodeSinglyLinkedList {
	public static void main(String[] args) {
		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();

		// null
		Node head = null;
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteLastNode(head);
		traversal.recursiveTraversal(head);

		// One element
		head = new Node(10);
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteLastNode(head);
		traversal.recursiveTraversal(head);

		// Two elements
		head = new Node(10);
		head.next = new Node(20);
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteLastNode(head);
		traversal.recursiveTraversal(head);

		// Multiple elements
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		System.out.println("\nBefore");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteLastNode(head);
		traversal.recursiveTraversal(head);
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
