//Creating Linked List: Insertion at Beginning

class MyLinkedList2{
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
	public void addNodeAtBegining(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = tail = newNode;    
        }    
        else {    
            //newNode will be added before head   
        		newNode.next = head;    
            //newNode will become new head of the list    
            head = newNode;    
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
public class LinkedList2 {
	public static void main(String[] args) {
		MyLinkedList2 list=new MyLinkedList2();
		list.addNodeAtBegining(5);
		list.addNodeAtBegining(9);
		list.addNodeAtBegining(23);
		list.addNodeAtBegining(56);
		list.addNodeAtBegining(3);
		list.printList();
	}
}
