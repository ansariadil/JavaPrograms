package linkedList;

public interface LinkedList<T> {
	public String printList();

	public int length();

	public void add(T data);

	public void add(int index, T data);

	public void addFirst(T data);

	public void clear();

	public Node<T> removeFromStart();

	public Node<T> removeFromEnd();

	public void remove(int index);

	public void removeAllOccurance(T data);

	public void removeFirstOccurance(T data);

	public void removeLastOccurance(T data);

	public void removeMidOccurance(T data, int occurance);

}
