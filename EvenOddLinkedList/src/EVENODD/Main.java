package EVENODD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd list=new EvenOdd();
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(1);
		list.display();
		list.displaySize();
		list.insertLast(5);
		list.display();
		list.displaySize();

	}

}
