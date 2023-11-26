//Creating Linked List: Insertion at End


class MyLinkedList{
	
    class Node{
    	int data;
    	Node next;
    	public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }
    } 
    
    public Node head = null;    
    public Node tail = null;  
    
	public void addNodeAtEnd(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = tail = newNode;    
        }    
        else {    
            //newNode will be added after tail    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
    public void printList() {   
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else {  
	        System.out.println("Nodes of singly linked list: "); 
            //currentNode will point to head    
            Node currentNode = head;      
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.next;    
	        }    
	        System.out.println();
        }
    }   
}
public class LinkedList1 {
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.printList();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);
		list.printList();
	}
}
