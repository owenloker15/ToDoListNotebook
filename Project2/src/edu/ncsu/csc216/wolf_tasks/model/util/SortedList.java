/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.util;

/**
 * @author owenloker
 *
 */
public class SortedList<E> implements ISortedList {
	
	private ListNode front;
	
	private int size;
	
	private class ListNode {
		
		private ListNode next;
		
		public E data;
		
		public ListNode(E element, ListNode node) {
			
		}
	}
	
	public SortedList() {
		
	}
	
	//MIGHT NEED THE @OVERRIDE TAG (NOT SURE) DELETED EARLIER BC OF ERROR
	public void add(E element) {
		// TODO Auto-generated method stub
	}
	
	private void checkIndex(int idx) {
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(Comparable element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comparable remove(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Comparable element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable get(int idx) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
