/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

import edu.ncsu.csc216.wolf_tasks.model.util.ISwapList;

/**
 * @author owenloker
 *
 */
public abstract class AbstractTaskList {
	
	private ISwapList<Task> tasks;
	
	private String taskListName;
	
	private int completeCount;
	
	public AbstractTaskList(String taskListName, int completedCount) {
		
	}

	/**
	 * @return the taskListName
	 */
	public String getTaskListName() {
		return taskListName;
	}

	/**
	 * @param taskListName the taskListName to set
	 */
	public void setTaskListName(String taskListName) {
		this.taskListName = taskListName;
	}

	/**
	 * @return the tasks
	 */
	public ISwapList<Task> getTasks() {
		return tasks;
	}

	/**
	 * @return the completeCount
	 */
	public int getCompleteCount() {
		return completeCount;
	}
	
	public void addTask(Task task) {
		
	}
	
	public Task removeTask(int idx) {
		return null;
	}
	
	public Task getTask(int idx) {
		return null;
	}
	
	public void completeTask(Task task) {
		
	}
	
	public abstract String[][] getTasksAsArray();
}
