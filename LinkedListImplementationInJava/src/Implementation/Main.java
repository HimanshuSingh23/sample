package Implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImp list= new LinkedListImp();
	    list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(8);
	    list.insertFirst(17);
	    list.insertLast(21);
	    list.display();
	    //list.insert(9,3);
	    //list.display();
	    list.deleteStart();
	    list.display();
	    list.reverse();
		

	}

}
