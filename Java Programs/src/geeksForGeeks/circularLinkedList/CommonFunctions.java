package geeksForGeeks.circularLinkedList;

public class CommonFunctions {
	public void printList(Node head) {
		if(head == null)
			return;
		Node curr = head;
		while (curr.next != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(curr.data + " ");
		System.out.println();
	}
}
