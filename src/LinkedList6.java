//Creating Linked List: Deletion from Specific Node Value of Linked List

class MyLinkedList6 {
	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtEnd(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added after tail
			tail.next = newNode;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}

	public void deleteNodeFromSpecificNode(int locationValue) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head.data == locationValue) {
			head = head.next;
		} else {
			Node currentNode = head;
			Node locationNode = null;
			Node previousNode = null;
			while (currentNode != null) {
				if (currentNode.data == locationValue) {
					locationNode = currentNode;
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			if (locationNode == null) {
				System.out.println("Location Value does not exist.");
			} else {
				previousNode.next = locationNode.next;
				if(locationNode==tail) {
					tail=previousNode;
				}
			}
		}
	}

	public void printList() {
		// currentNode will point to head
		Node currentNode = head;

		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.println("Nodes of singly linked list: ");
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
}
public class LinkedList6 {
	public static void main(String[] args) {
		MyLinkedList6 list = new MyLinkedList6();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(15);
		list.printList();
		list.deleteNodeFromSpecificNode(5);
		list.printList();
	}
}
