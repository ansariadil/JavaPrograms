package arrayList;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ArrayListImpl<E> {

	// Iterate all elements and perform action for each element
	public void forEach(Consumer<? super E> action);

	// 1.retainAll(2) 1 will have only elemtns in 2
	public boolean retainAll(Collection C) throws ClassCastException, NullPointerException;

//	Removes all of the elements of this collection that satisfy the given predicate.
	public boolean removeIf(Predicate filter) throws NullPointerException;

//	Returns true if this list contains the specified element.
	public boolean contains(E element);

//	Removes the first occurrence of the specified element from this list, if it is present.
	public void remove(E element) throws ClassCastException, NullPointerException, UnsupportedOperationException;

	public void remove(int index) throws ClassCastException, NullPointerException, UnsupportedOperationException;

//	Returns the element at the specified position in this list.
	public E get(int index) throws IndexOutOfBoundsException;

//	[fromIndex, toIndex)
	public List<E> subList(int fromIndex, int toIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

//	public Spliterator<E> spliterator()

//	Replaces the element at the specified position in this list with the specified element.
	public E set(int index, E element) throws IndexOutOfBoundsException;

//	This method returns the number of elements in this list.
	public int size();

//	? used to remove from this list all of its elements that are contained in the specified collection.
	public boolean removeAll(Collection c) throws NullPointerException;

//	 This method takes the desired minimum capacity as a parameter.
	public void ensureCapacity(int minCapacity);

	// used to return a list iterator over the elements in this list (in proper
	// sequence). The returned list iterator is fail-fast.
	public ListIterator listIterator();

//	This method used to return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. 
	public ListIterator listIterator(int index) throws IndexOutOfBoundsException;

	// used to check if a list is empty or not
	public boolean isEmpty();

	// used to remove all elements within the specified range from an ArrayList
	// object
	public void removeRange(int fromIndex, int toIndex) throws IndexOutOfBoundsException;

	// used to remove all the elements from a list. The list will be empty after
	// this call returns.
	public void clear();

	// The element to be appended to this list.
	public boolean add(E element);

	public boolean add(int index, E element) throws IndexOutOfBoundsException;

	// trims the capacity of an ArrayList instance to be the list’s current size.
	public void trimToSize();

	public int IndexOf(E o);

	public int lastIndexOf(E o);

	public E[] toArray();

	public E[] toArray(E[] arr) throws ArrayStoreException;
	
	public boolean addAll(Collection c) throws NullPointerException ;
	
	public boolean addAll(int index, Collection c) throws IndexOutOfBoundsException , NullPointerException;

}
