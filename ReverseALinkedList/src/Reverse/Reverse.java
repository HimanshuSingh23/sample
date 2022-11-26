package Reverse;
public class Reverse {
	private Node head;
	private int size;
	
	//Initialize the size of the linked list as 0
	Reverse()
	{
		this.size=0;
	}
	
	//Form the linked list
	public void formLinkedList(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
		size=size+1;
	}
	
	//Display the linked list;
	public void reverseLinkedList()
	{
		Node current=head;
		Node previous=null;
		Node nextNode=null;
		while(current!=null)
		{
			nextNode=current.next;
			current.next=previous;
			previous=current;
			current=nextNode;
		}
		head=previous;
		Node temp=head;
		 while(temp!=null)
         {
        	 System.out.print(temp.value+"->");
        	 temp=temp.next;
         }
         System.out.println("END");
         System.out.println("The Size of the Linked List is"+size);
	}
	
	//Display the linked list
    public void displayLinkedList()
    {
         Node temp=head;
         while(temp!=null)
         {
        	 System.out.print(temp.value+"->");
        	 temp=temp.next;
         }
         System.out.println("END");
         System.out.println("The Size of the Linked List is"+size);
    }
	
	class Node{
		private int value;
		private Node next;
		
		Node(int value)
		{
			this.value=value;
		}
		
		Node(int value, Node next)
		{
			this.value=value;
			this.next=next;
		}
	}

}
