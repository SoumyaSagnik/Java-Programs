package geeksForGeeks.linkedList;

public class RecursiveTraversalOfSinglyLinkedList {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		RecursiveTraversalOfSinglyLinkedList traversal = new RecursiveTraversalOfSinglyLinkedList();
		traversal.recursiveTraversal(head);
	}

	public void recursiveTraversal(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		recursiveTraversal(head.next);
	}
}
