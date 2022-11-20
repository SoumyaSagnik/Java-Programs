package geeksForGeeks.linkedList;

public class LinkedListIntroduction {
	public static void main(String[] args) {
		Node head = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);

		head.next = n1;
		n1.next = n2;

		System.out.println(head.data);
		System.out.println(head.next.data);
	}
}
