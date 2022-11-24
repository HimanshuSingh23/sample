package Implementation;

public class LinkedListImp {
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public LinkedListImp() {
		this.size=0;
	}

	
	//add a node at the first position
	public void insertFirst(int val)
	{
		Node node= new Node(val);
		node.next=head;
		head=node;
		size=size+1;
	}
	
	
	//add at the end of the linked list
	public void insertLast(int val)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node node = new Node(val);
		temp.next=node;
		node.next=null;
		size=size+1;
		
	}
	
	
	//insert at the ith index of the linked list
	public void insert(int val, int index)
	{
		Node temp=head;
		for(int i=1; i<index;i++)
		{
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
	}
	
	//delete from the start of the linked list
	public void deleteStart()
	{
		Node temp=head.next;
		head.next=null;
		head=temp;
		size=size-1;
	}
	
	
	//reverse a singly linked list
	public void reverse()
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
		Node temp= head;
		while(temp!=null)
		{
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("END");
		System.out.println("The size of the linked list is " +size);
		
	}
	
	
	
	//display the linked list
	public void display()
	{
		Node temp= head;
		while(temp!=null)
		{
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("END");
		System.out.println("The size of the linked list is " +size);
	}

	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		
		
		
	}

}



