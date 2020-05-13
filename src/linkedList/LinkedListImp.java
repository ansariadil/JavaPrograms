package linkedList;

class LinkedListImp<T> implements LinkedList<T> {

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
			toString += currentNode.getData() + ", ";
			currentNode = currentNode.getNext();
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
			currentNode = currentNode.getNext();
		}
		return length;

	}

	@Override
	public void clear() {
		head = null;
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

		toAdd.setNext(null);
		Node<T> last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(toAdd);
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
		head.setNext(temp);
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
			temp = temp.getNext();
		}
		current.setNext(toAdd);
		toAdd.setNext(temp);

	}

	// Remove from the beginning
	@Override
	public Node<T> removeFromStart() {
		Node<T> node = head;
		if (node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		return node;
	}

	// Remove from the End
	@Override
	public Node<T> removeFromEnd() {
		if (head == null || head.getNext() == null)
			return null;

		Node<T> secondLast = head.getNext();
		while (secondLast.getNext().getNext() != null) {
			secondLast = secondLast.getNext();
		}
		secondLast.setNext(null);
		return head;
	}

	@Override
	public void remove(int index) {
		// index starts fom zero
		int length = length();

		if (length == 0)
			throw new IllegalArgumentException("Empty");

		if (index < 0 || index >= length) {
			throw new IllegalArgumentException("Index starts from 0");
		}
		if (index == 0) {
			removeFromStart();
			return;
		}

		if (index == length - 1) {
			removeFromEnd();
			return;
		}
		Node<T> currentNode = head;
		for (int i = 0; i < length; i++) {
			if (i == index - 1) {
				currentNode.setNext(currentNode.getNext().getNext());
				return;
			}
			currentNode = currentNode.getNext();
		}

	}

	@Override
	public void removeAllOccurance(T data) {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty List");

		Node<T> currentNode = head;
		for (int i = 0; i < length; i++) {
			if (currentNode.getData() == data) {
				remove(i);
				i--;
				length--;
			}
			currentNode = currentNode.getNext();
		}

	}

	@Override
	public void removeFirstOccurance(T data) {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty List");

		Node<T> currentNode = head;
		for (int i = 0; i < length; i++) {
			if (currentNode.getData() == data) {
				remove(i);
				return;
			}
			currentNode = currentNode.getNext();
		}

	}

	@Override
	public void removeLastOccurance(T data) {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty List");

		int lastOccurance = -1;
		Node<T> currentNode = head;
		for (int i = 0; i < length; i++) {
			if (currentNode.getData() == data) {
				lastOccurance = i;
			}
			currentNode = currentNode.getNext();
		}
		if (lastOccurance == -1)
			throw new IllegalArgumentException(data + " Not exist in list");
		else
			remove(lastOccurance);

	}

	@Override
	public int findIndex(T data) {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty List");

		Node<T> currentNode = head;
		for (int i = 0; i < length; i++) {
			if (currentNode.getData() == data) {
				return i;
			}
			currentNode = currentNode.getNext();
		}
		throw new IllegalArgumentException(data + " Not exist in list");

	}

	@Override
	public void replace(int index, T data) {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty List");

		Node<T> currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.setData(data);
	}

	@Override
	public int occurence(T data) {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty List");

		int occurance = 0;
		Node<T> currentNode = head;
		for (int i = 0; i < length; i++) {
			if (currentNode.getData() == data)
				occurance += 1;
			currentNode = currentNode.getNext();
		}
		return occurance;
	}

	@Override
	public void reverse() {
		int length = length();
		if (length == 0)
			throw new IllegalArgumentException("Empty");

		if (length == 1)
			return;

		Node<T> prevLink = null;
        Node<T> currentLink = head;
        Node<T> nextLink = null;
        while (currentLink != null) {
            nextLink = currentLink.getNext();
            currentLink.setNext(prevLink);
            prevLink = currentLink;
            currentLink = nextLink;
        }
	}

}