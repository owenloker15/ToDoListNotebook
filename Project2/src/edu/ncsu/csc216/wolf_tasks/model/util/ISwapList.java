/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.util;

/**
 * @author owenloker
 *
 */
public interface ISwapList<E> {
	
	void add(E element);
	
	remove(int idx);
	
	void moveUp(int idx);
	
	void moveDown(int idx);
	
	void moveToFront(int idx);
	
	void moveToBack(int idx);
	
	get(int idx);
	
	int size();
}
