package geeksForGeeks.circularLinkedList;

public class Introduction {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n1;

		CommonFunctions cf = new CommonFunctions();
		cf.printList(n1);

		Node n5 = new Node(69);
		n5.next = n5;
		cf.printList(n5);
	}
}
