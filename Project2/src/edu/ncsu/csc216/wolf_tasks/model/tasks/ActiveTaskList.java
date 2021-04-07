/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

import edu.ncsu.csc216.wolf_tasks.model.util.ISwapList;

/**
 * Child class of AbstractTaskList. A TaskList of all tasks in the Notebook that are marked as Active
 * @author owenloker
 * @author magolden
 */
public class ActiveTaskList extends AbstractTaskList {
	
	/** Name of the Active Task List */
	public static final String ACTIVE_TASKS_NAME = "Active Tasks";
	
	/**
	 * ActiveTaskList Constructor
	 */
	public ActiveTaskList() {
		super(ACTIVE_TASKS_NAME, 0);
		
	}
	
	/**
	 * Adds a task to the Active TaskList
	 */
	public void addTask() {
		
	}
	
	/**
	 * Sets the name of the tasklist
	 * @param taskListName name of tasklist
	 */
	public void setTaskListName(String taskListName) {
		
	}
	
	/**
	 * Gets the tasks in the list as a 2D String array
	 * @return 2D string array of tasks
	 */
	public String[][] getTasksAsArray() {
		return null;
	}
	
	/**
	 * Clears the tasks from the list
	 */
	public void clearTasks() {
		
	}
}
