package geeksForGeeks.linkedList;

public class DeleteFirstNodeSinglyLinkedList {
	public static void main(String[] args) {
		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();

		// null
		Node head = null;
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteFirstNode(head);
		traversal.recursiveTraversal(head);

		// one element
		head = new Node(10);
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteFirstNode(head);
		traversal.recursiveTraversal(head);

		// multiple elements
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		System.out.println("Before");
		traversal.recursiveTraversal(head);
		System.out.println("\nAfter");
		head = deleteFirstNode(head);
		traversal.recursiveTraversal(head);

	}

	public static Node deleteFirstNode(Node head) {
		if (head == null)
			return null;
		return head.next;
	}
}
