/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

import edu.ncsu.csc216.wolf_tasks.model.util.ISwapList;
import edu.ncsu.csc216.wolf_tasks.model.util.SwapList;

/**
 * @author owenloker
 *
 */
public class Task implements Cloneable{
	
	private ISwapList<AbstractTaskList> taskLists;
	
	private String taskName;
	
	private String taskDescription;
	
	private boolean recurring;
	
	private boolean active;
	
	public Task(String taskName, String taskDescription, boolean recurring, boolean active) {
		setTaskName(taskName);
		setTaskDescription(taskDescription);
		setRecurring(recurring);
		setActive(active);
		this.taskLists = new SwapList<AbstractTaskList>();
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		if(taskName == null) {
			throw new IllegalArgumentException("Incomplete task information.");
		}
		this.taskName = taskName;
	}

	/**
	 * @return the taskDescpription
	 */
	public String getTaskDescription() {
		return taskDescription;
	}

	/**
	 * @param taskDescpription the taskDescpription to set
	 */
	public void setTaskDescription(String taskDescription) {
		if(taskDescription == null) {
			throw new IllegalArgumentException("Incomplete task information.");
		}
		this.taskDescription = taskDescription;
	}

	/**
	 * @return the recurring
	 */
	public boolean isRecurring() {
		return recurring;
	}

	/**
	 * @param recurring the recurring to set
	 */
	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String getTaskListName() {
		return null;
	}
	
	public void addTaskList(AbstractTaskList taskList) {
		
	}
	
	public void completeTask() {
		
	}
	
	public Object clone() {
		return null;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", taskDescpription=" + taskDescription + ", recurring=" + recurring
				+ ", active=" + active + "]";
	}
	
	
}
