//Creating Linked List: Insertion after Specific Node Value of Linked List

class MyLinkedList3{
	public Node head = null;    
    public Node tail = null;  
    
    class Node{
    	int data;
    	Node next;
    	public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }
    } 
    
    public void addNodeAtEnd(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    } 
	public void addNodeAfterSpecificNodeValue(int locationValue,int data) {    
            
        Node currentNode = head;
    	Node locationNode=null;
    	while(currentNode != null) {  
            if(currentNode.data==locationValue) {
            	locationNode=currentNode;
            	break;
            }
            currentNode = currentNode.next;    
        }
    	if(locationNode==null) {
    		System.out.println("Location Value does not exist.");
    	}else {
    		//Create a new node    
            Node newNode = new Node(data);
    		newNode.next = locationNode.next;       
        	locationNode.next = newNode;
    	}  
    }    
    public void printList() {    
        //currentNode will point to head    
        Node currentNode = head;    
            
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else {    
	        System.out.println("Nodes of singly linked list: ");    
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");  
	            currentNode = currentNode.next;    
	        }    
	        System.out.println();
        }
    }   
}
public class LinkedList3 {
	public static void main(String[] args) {
		MyLinkedList3 list=new MyLinkedList3();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAfterSpecificNodeValue(23,3);
		list.printList();
	}
}
