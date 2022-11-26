package FirstandLast;

public class FAL {
	private Node head;
	private int size;
	
	//Initialize a node with size 0
	FAL()
	{
		this.size=0;
	}
	
	//Insert from first
	public void insertFirst(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
		size=size+1;
	}
	
	//Insert from last
	public void insertLast(int value)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node node=new Node(value);
		temp.next=node;
		node.next=null;
		size=size+1;
	}
	
	//display the linked list
	public void displayTheLinkedList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("END");
		System.out.println("The size of the linked list is"+size);
		
	}
	
	class Node
	{
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
