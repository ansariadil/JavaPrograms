package linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedListImp<Integer>();

		// 1. Add element at the end Operation

		list.add(5);
		list.add(8);
		list.add(9);
		System.out.println(list.printList());

//		LinkedListImp<String> list1 = new LinkedListImp<String>();
//		list1.add("a");
//		System.out.println(list1.printList());

//		 2. Add element at the beginning Operation
//		list.addFirst(3);
//		list.addFirst(3);
//		list.addFirst(2);
//		list.addFirst(1);
//		System.out.println(list.printList());

//		3. Add element in mid
//		list.add(8, 7);
//		System.out.println(list.printList());

		
//		3. Clear list
//		list.clear();
//		System.out.println(list.printList());
		
		System.out.println(list.getClass().equals(LinkedListImp.class));
	}
}
