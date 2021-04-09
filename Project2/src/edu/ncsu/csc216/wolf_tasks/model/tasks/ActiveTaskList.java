/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

import edu.ncsu.csc216.wolf_tasks.model.util.SwapList;

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
	@Override
	public void addTask(Task task) {
		SwapList<Task> tasks = (SwapList<Task>) this.getTasks();
		if(task.isActive()) {
			tasks.add(task);
		}
		else {
			throw new IllegalArgumentException("Cannot add task to Active Tasks.");
		}
	}
	
	/**
	 * Sets the name of the tasklist
	 * @param taskListName name of tasklist
	 */
	@Override
	public void setTaskListName(String taskListName) {
		if (taskListName.equals(ACTIVE_TASKS_NAME)) {
			super.setTaskListName(taskListName);
		}
		else {
			throw new IllegalArgumentException("The Active Tasks list may not be edited.");
		}
	}
	
	/**
	 * Gets the tasks in the list as a 2D String array
	 * @return 2D string array of tasks
	 */
	public String[][] getTasksAsArray() {
		SwapList<Task> tasks = (SwapList<Task>) this.getTasks();
		String[][] taskArray = new String[tasks.size()][tasks.size()];
		for (int i = 0; i < tasks.size(); i++) {
			taskArray[i][0] = tasks.get(i).getTaskListName();
			taskArray[i][1] = tasks.get(i).getTaskName();
		}
		return taskArray;
	}
	
	/**
	 * Clears the tasks from the list
	 */
	public void clearTasks() {
		SwapList<Task> tasks = (SwapList<Task>) this.getTasks();
		for(int i = 0; i < tasks.size(); i++) {
			tasks.remove(i);
		}
		tasks.remove(0);
	}
}
