package linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedListImp<Integer>();

		// 1. Add element at the end Operation

		list.add(5);
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(8);
		list.add(9);
		System.out.println(list.printList());


		list.reverse();
		System.out.println(list.printList());
	}
}
