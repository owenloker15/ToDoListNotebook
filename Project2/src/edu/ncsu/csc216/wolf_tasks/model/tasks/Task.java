/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

import edu.ncsu.csc216.wolf_tasks.model.util.ISwapList;

/**
 * @author owenloker
 *
 */
public class Task {
	
	private ISwapList<TaskList> taskLists;
	
	private String taskName;
	
	private String taskDescpription;
	
	private boolean recurring;
	
	private boolean active;
	
	public Task(String taskName, String taskDesciption, boolean recurring, boolean active) {
		
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
		this.taskName = taskName;
	}

	/**
	 * @return the taskDescpription
	 */
	public String getTaskDescpription() {
		return taskDescpription;
	}

	/**
	 * @param taskDescpription the taskDescpription to set
	 */
	public void setTaskDescpription(String taskDescpription) {
		this.taskDescpription = taskDescpription;
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
		return "Task [taskName=" + taskName + ", taskDescpription=" + taskDescpription + ", recurring=" + recurring
				+ ", active=" + active + "]";
	}
	
	
}
