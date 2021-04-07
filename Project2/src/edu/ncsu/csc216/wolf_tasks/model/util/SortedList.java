/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.util;

/**
 * Sorted Linked List of TaskLists
 * @author owenloker
 * @author magolden
 */
public class SortedList<E> implements ISortedList {
	
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
			
		}
	}
	
	/**
	 * SortedList Constructor
	 */
	public SortedList() {
		
	}
	
	//MIGHT NEED THE @OVERRIDE TAG (NOT SURE) DELETED EARLIER BC OF ERROR
	/**
	 * Adds the element to the list in sorted order.
	 * @param element element to add
	 * @throws NullPointerException if element is null
	 * @throws IllegalArgumentException if element cannot be added 
	 */
	public void add(E element) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Checks to see if the item at the specified index is null?
	 * @param idx index to check
	 */
	private void checkIndex(int idx) {
		
	}

	/**
	 * Returns the number of elements in the list.
	 * @return number of elements in the list
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
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
	public Comparable<E> remove(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns true if the element is in the list.
	 * @param element element to search for
	 * @return true if element is found
	 */
	@Override
	public boolean contains(Comparable element) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Returns the element at the given index.
	 * @param idx index of the element to retrieve
	 * @return element at the given index
	 * @throws IndexOutOfBoundsException if the idx is out of bounds
	 * 		for the list
	 */
	@Override
	public Comparable<E> get(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Adds the element to the list in sorted order.
	 * @param element element to add
	 * @throws NullPointerException if element is null
	 * @throws IllegalArgumentException if element cannot be added 
	 */
	@Override
	public void add(Comparable element) {
		// TODO Auto-generated method stub
	}
	
}
