package geeksForGeeks.circularLinkedList;

public class CommonFunctions {
	public void printList(Node head) {
		if (head == null)
			return;
		Node curr = head;
		while (curr.next != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(curr.data + " ");
		System.out.println();
	}

	public Node createNodes(int[] arr) {
		if (arr == null || arr.length == 0)
			return null;
		Node head = new Node(arr[0]);
		if (arr.length == 1) {
			head.next = head;
			return head;
		}
		Node curr = head;
		for (int i = 1; i < arr.length; i++) {
			Node n = new Node(arr[i]);
			curr.next = n;
			curr = n;
		}
		curr.next = head;
		return head;
	}
}
