/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.util;

/**
 * @author owenloker
 *
 */
public class SortedList<E> implements ISortedList<E>{
	
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
	
	@Override
	public void add(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int idx) {
		// TODO Auto-generated method stub
		
	}
	
	private void checkIndex(int idx) {
		
	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
