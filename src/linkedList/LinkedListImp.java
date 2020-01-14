package linkedList;

class LinkedListImp<T> implements LinkedList<T> {

	// Node Initialization
	@SuppressWarnings("hiding")
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	// Node instance
	Node<T> head;

	/*
	 * Algorithm to Add element at first index ************************************
	 * 1. Make head the current node***********************************************
	 * 2. While current != null traverse all node**********************************
	 * 3. Make next node current node
	 */
	@Override
	public String printList() {
		String toString = "[ ";
		Node<T> currentNode = head;
		while (currentNode != null) {
			toString += currentNode.data + ", ";
			currentNode = currentNode.next;
		}

		if (head != null)
			toString = toString.substring(0, toString.length() - 2);
		return toString + " ]";
	}

	/*
	 * To Find length of linked list
	 */
	@Override
	public int length() {
		int length = 0;
		Node<T> currentNode = head;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;

	}

	/*
	 * Algorithm to Add element at the end of list*********************************
	 * 1.checks, whether the head is equal to null which means the list is empty.__
	 * 2.If the list is empty, head will point to a newly added node.______________
	 * 3.If the list is not empty, create a Node to traverse LL.___________________
	 * 4.Add element to last.next=toAdd.___________________________________________
	 */
	@Override
	public void add(T data) {
		Node<T> toAdd = new Node<T>(data);

		// if LL is empty
		if (head == null) {
			head = toAdd;
			return;
		}

		toAdd.next = null;
		Node<T> last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = toAdd;
	}

	/*
	 * Algorithm to Add element at first index ************************************
	 * 1.checks, whether the head is equal to null which means the list is empty.__
	 * 2.If the list is empty, both head will point to a newly added node._________
	 * 3.If the list is not empty, create temporary node temp will point to head.__
	 * 4.Add the new node as head of the list._____________________________________
	 * 5.Temp which was pointing to the old head will be added after the new head.
	 */
	@Override
	public void addFirst(T data) {
		Node<T> toAddFirst = new Node<T>(data);

		// if LL is empty
		if (head == null) {
			head = toAddFirst;
			return;
		}

		Node<T> temp = head;
		head = toAddFirst;
		head.next = temp;
	}

	/*
	 * Algorithm to Add element at specific location ******************************
	 * 1.checks, whether the head is equal to null which means the list is empty.__
	 * 2.If the list is empty, head will point to a newly added node.______________
	 * 3.If the list is not empty, create a Node to traverse LL.___________________
	 * 4.Add element to last.next=toAdd.___________________________________________
	 */
	@Override
	public void add(int index, T data) {
		int len = length();
		if (index == 0) {
			addFirst(data);
			return;
		}
		if (len <= index) {
			System.out.println("List's length is shorter or length then given Index.");
			System.out.println("Adding at Last Index");
			add(data);
			return;
		}

		Node<T> toAdd = new Node<T>(data);
		Node<T> temp = head;
		Node<T> current = null;

		for (int i = 0; i < index - 1; i++) {
			current = temp;
			temp = temp.next;
		}
		current.next = toAdd;
		toAdd.next = temp;

	}

	@Override
	public void clear() {
		head = null;

	}

}