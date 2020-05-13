package doubleLinkedList;

public class DLL_Node<T> {
	private T data;
	private DLL_Node<T> next;
	private DLL_Node<T> prev;

	public DLL_Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DLL_Node(T data) {
		super();
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLL_Node<T> getNext() {
		return next;
	}

	public void setNext(DLL_Node<T> next) {
		this.next = next;
	}

	public DLL_Node<T> getPrev() {
		return prev;
	}

	public void setPrev(DLL_Node<T> prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "DLL_Node [data=" + data + ", next=" + next + ", prev=" + prev + "]";
	}

}
