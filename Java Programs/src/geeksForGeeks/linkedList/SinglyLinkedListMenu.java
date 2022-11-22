package geeksForGeeks.linkedList;

import java.util.Scanner;

public class SinglyLinkedListMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		CreateNode head = null;

		while (flag) {
			System.out.println("Enter your choice");
			System.out.println("1. Insert element at beginning");
			System.out.println("2. Insert element at end");
			System.out.println("3. Insert element at given position");
			System.out.println("4. Delete first element");
			System.out.println("5. Delete last element");
			System.out.println("6. Delete element at given position");
			System.out.println("7. View current list");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter value to insert");
				int value = sc.nextInt();
				head = insertAtBeginning(head, value);
				System.out.println("Value inserted successfully");
				break;
			case 2:
				System.out.println("Enter value to insert");
				value = sc.nextInt();
				head = insertAtEnd(head, value);
				System.out.println("Value inserted successfully");
				break;
			case 3:
				System.out.println("Enter value to insert");
				value = sc.nextInt();
				System.out.println("Enter position");
				int position = sc.nextInt();
				head = insertAtPosition(head, value, position);
				System.out.println("Value inserted successfully");
				break;
			case 4:
				head = deleteFirstElement(head);
				break;
			case 5:
				head = deleteLastElement(head);
				break;
			case 6:
				System.out.println("Enter position");
				position = sc.nextInt();
				head = deleteFromPosition(head, position);
				break;
			case 7:
				traverseList(head);
				System.out.println();
				break;
			default:
				System.out.println("Wrong Choice");
			}

			System.out.println("Do you want to continue? Press n to stop");
			if (sc.next().equals("n")) {
				flag = false;
				sc.close();
			}

		}

	}

	public static CreateNode createNode(int value) {
		CreateNode node = new CreateNode(value);
		return node;
	}

	public static CreateNode insertAtBeginning(CreateNode head, int value) {
		if (head == null)
			return createNode(value);
		CreateNode newHead = createNode(value);
		newHead.next = head;
		return newHead;
	}

	public static CreateNode insertAtEnd(CreateNode head, int value) {
		if (head == null)
			return createNode(value);
		CreateNode newNode = createNode(value);
		CreateNode curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = newNode;
		return head;
	}

	public static void traverseList(CreateNode head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		traverseList(head.next);
	}

	public static CreateNode insertAtPosition(CreateNode head, int value, int position) {
		CreateNode newNode = createNode(value);
		if (head == null)
			return newNode;
		if (position < 2) {
			newNode.next = head;
			return newNode;
		}
		CreateNode curr = head;
		for (int i = 1; i <= position - 2; i++) {
			if (curr.next != null)
				curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
	}

	public static CreateNode deleteFirstElement(CreateNode head) {
		if (head == null || head.next == null)
			return null;
		return head.next;
	}

	public static CreateNode deleteLastElement(CreateNode head) {
		if (head == null || head.next == null)
			return null;
		CreateNode curr = head;
		while (curr.next.next != null)
			curr = curr.next;
		curr.next = null;
		return head;
	}

	public static CreateNode deleteFromPosition(CreateNode head, int position) {
		if (head == null)
			return null;
		if (head.next == null) {
			if (position == 1)
				return null;
			else {
				System.out.println("Invalid position");
				return head;
			}
		}
		if (position < 1) {
			System.out.println("Invalid position");
			return head;
		}
		if (position == 1) {
			return head.next;
		}
		CreateNode curr = head;
		for (int i = 1; i <= position - 2; i++) {
			curr = curr.next;
			if (curr.next == null) {
				System.out.println("Invalid position");
				return head;
			}
		}
		curr.next = curr.next.next;
		return head;
	}
}

class CreateNode {
	int data;
	CreateNode next;

	CreateNode(int data) {
		this.data = data;
	}
}
