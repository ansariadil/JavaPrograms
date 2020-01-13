package linkedList;

class LinkedListImp {

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	Node head;

	public boolean add(int data) {
		Node toAdd = new Node(data);

		// if LL is empty
		if (head == null) {
			head = toAdd;
			return true;
		}

		toAdd.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = toAdd;
		return true;
	}

	public String printList(LinkedListImp list) {
		String toString = "[ ";
		Node currentNode = head;
		while (currentNode != null) {
			toString += currentNode.data + ", ";
			currentNode = currentNode.next;
		}
		toString = toString.substring(0, toString.length() - 2);
		return toString + " ]";
	}

}