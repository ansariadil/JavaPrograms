package doubleLinkedList;

public class DoubleLinkedListImpl<T> {

	DLL_Node<T> head;

	public String printListForword() {
//		DLL_Node<T> last = null;
		DLL_Node<T> currentNode = head;
		System.out.println("Traversal in forward Direction");
		String toString = "[ ";
		while (currentNode != null) {
//			System.out.print(currentNode.getData() + " ");
			toString += currentNode.getData() + ", ";
//			last = currentNode;
			currentNode = currentNode.getNext();
		}
		if (toString.length() < 3)
			return toString + "]";
		return toString.substring(0, toString.length() - 2) + " ]";
//		System.out.println();
//		System.out.println("Traversal in reverse direction");
//		while (last != null) {
//			System.out.print(last.data + " ");
//			last = last.prev;
//		}
	}

	// Adding a node at the front of the list
	public void push(T data) {
		DLL_Node<T> toAdd = new DLL_Node<T>(data);

		toAdd.setNext(head);
		toAdd.setPrev(null);

		if (head != null)
			head.setPrev(toAdd);

		head = toAdd;
	}
}
