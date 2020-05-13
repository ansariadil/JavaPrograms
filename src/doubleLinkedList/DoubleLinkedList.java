package doubleLinkedList;

public class DoubleLinkedList {
	public static void main(String... args) {

		DoubleLinkedListImpl<Integer> doubleLL = new DoubleLinkedListImpl<Integer>();

//		doubleLL.push(5);
		doubleLL.push(3);

		System.out.println(doubleLL.printListForword());
	}
}
