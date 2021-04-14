/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.util;


/**
 * Sorted Linked List of TaskLists
 * @author owenloker
 * @author magolden
 * @param <E> type parameter for this class
 */
public class SortedList<E extends Comparable<E>> implements ISortedList<E> {
	
	/** Front ListNode */
	private ListNode front;
	
	/** Size of list */
	private int size;
	
	/**
	 * ListNode inner class used to create LinkedLists
	 * @author magolden
	 * @author owenloker
	 */
	private class ListNode {
		
		/** Next listnode in the list */
		private ListNode next;
		
		/** Value of the current node */
		public E data;
		
		/**
		 * ListNode constructor
		 * @param element data of the ListNode
		 * @param node reference to the next node in the list
		 */
		public ListNode(E element, ListNode node) {
			this.data = element;
			this.next = node;
		}
	}
	
	/**
	 * SortedList Constructor
	 */
	public SortedList() {
		front = null;
		size = 0;
	}
	
	/**
	 * Adds the element to the list in sorted order.
	 * @param element element to add
	 * @throws NullPointerException if element is null
	 * @throws IllegalArgumentException if element cannot be added 
	 */
	
	@Override
	public void add(E element) {
		if (element == null) {
			throw new NullPointerException("Cannot add null element.");
		}
		if (front == null) { //Special case of adding to an empty list
			front = new ListNode((E) element, front); //Update front to point to new node
			size++; //Increment size
		}
		else {
			recursiveAdd(front, (E) element); //Recursion when list has contents
		}
	}
	
	private void recursiveAdd(ListNode current, E element) {
		if (current.next == null) { //Base case next is null
			current.next = new ListNode(element, current.next); //Add new node
			size++; //Increment size
		}
		else {
			recursiveAdd(current.next, element); //Recursion when list has contents
		}
	}
	
//	/**
//	 * Adds the element to the list in sorted order.
//	 * @param element element to add
//	 * @throws NullPointerException if element is null
//	 * @throws IllegalArgumentException if element cannot be added 
//	 */
//	public void add(E element) {
//		ListNode current = front;
//		if (front == null) {
//	        front = new ListNode(element, current);
//		}
//		else {
//			while (current.next != null) {
//					current = current.next;
//				}
//				current.next = new ListNode(element, current);
//			}
//		size++;
//	}
	
	/** 
	 * Checks to see if the item at the specified index not a valid index
	 * @param idx index to check
	 */
	private void checkIndex(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new IndexOutOfBoundsException("Invalid index.");
		}
	}

	/**
	 * Returns the number of elements in the list.
	 * @return number of elements in the list
	 */
	@Override
	public int size() {
		return this.size;
	}

	/**
	 * Returns the element from the given index.  The element is
	 * removed from the list.
	 * @param idx index to remove element from
	 * @return element at given index
	 * @throws IndexOutOfBoundsException if the idx is out of bounds
	 * 		for the list
	 */
	
	@Override
	public E remove(int idx) {
		checkIndex(idx);
		
		E removed = null;
		if(idx == 0) {
			removed = front.data;
			front  = front.next;
		} else {
			ListNode current = front;
			for(int i = 0; i < idx - 1; i++) {
				current = current.next;
			}
			removed = current.next.data;
			current.next = current.next.next;
		}
		size--;
		return removed;
	}

	/**
	 * Returns true if the element is in the list.
	 * @param element element to search for
	 * @return true if element is found
	 */
	@Override
	public boolean contains(E element) {
		return contains(front, element);
	}
	
	
	private boolean contains(ListNode current, E element) {
		if (current == null) {
			return false;
		}
		if (current.data == element) {
			return true;
		}
		
		return contains(current.next, element);
	}

	/**
	 * Returns the element at the given index.
	 * @param idx index of the element to retrieve
	 * @return element at the given index
	 * @throws IndexOutOfBoundsException if the idx is out of bounds
	 * 		for the list
	 */
	
	@Override
	public E get(int idx) {
		checkIndex(idx);
		
		ListNode current = front;
		for(int i = 0; i < idx; i++) {
			current = current.next;
		}
		
		return current.data;
	}
	
}
