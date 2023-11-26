//Linked List: All Operations

class LinkedList {
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

	public void addNodeAtBegin(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added before head
			newNode.next = head;
			// newNode will become new head of the list
			head = newNode;
		}
	}

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		// Create a new node
		Node newNode = new Node(data);

		Node currentNode = head;
		Node locationNode = null;
		while (currentNode != null) {
			int value = currentNode.data;
			if (value == locationValue) {
				locationNode = currentNode;
				break;
			}
			currentNode = currentNode.next;
		}
		if (locationNode == null) {
			System.out.println("Location Value does not exist.");
		} else {
			newNode.next = locationNode.next;
			locationNode.next = newNode;
		}
	}

	public void addNodeBeforeSpecificNodeValue(int locationValue, int data) {
		// your assignment
	}

	public void deleteNodeFromBeginning() {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
	}

	public void deleteNodeFromEnd() {
		Node currentNode = head;
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head == tail) {
			head = tail = null;
		} else {
			while (currentNode != null) {
//				if(currentNode.next.next == null) {//allowed
				if (currentNode.next == tail) {
					currentNode.next = null;
					tail = currentNode;
					break;
				}
				currentNode = currentNode.next;
			}
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
				if (locationNode == tail) {
					tail = previousNode;
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
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(4);
		list.addNodeAtBegin(23);
		list.addNodeAtBegin(13);
		list.addNodeAtBegin(56);
		list.addNodeAfterSpecificNodeValue(9, 3);
		list.printList();
		list.deleteNodeFromEnd();
		list.deleteNodeFromBeginning();
		list.deleteNodeFromSpecificNode(23);
		list.printList();
	}
}
