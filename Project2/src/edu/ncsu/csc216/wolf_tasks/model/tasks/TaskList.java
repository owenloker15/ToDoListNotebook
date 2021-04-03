/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

/**
 * @author owenloker
 *
 */
public class TaskList extends AbstractTaskList {
	
	public TaskList(String taskListName, int completedCount) {
		super(taskListName, completedCount);
	}
	
	public String[][] getTasksAsArray() {
		return null;
	}
	
	public int compareTo(TaskList taskList) {
		return -1;
	}
}
