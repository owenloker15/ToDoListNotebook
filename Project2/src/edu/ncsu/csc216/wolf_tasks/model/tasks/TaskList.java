/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.tasks;

import edu.ncsu.csc216.wolf_tasks.model.util.SwapList;

/**
 * A TaskList object in the WolfTasks system. A list of task objects. Extends AbstractTaskList
 * @author owenloker
 * @author magolden
 */
public class TaskList extends AbstractTaskList {
	
	/**
	 * TaskList Constructor
	 * @param taskListName name of task list
	 * @param completedCount number of completed tasks
	 */
	public TaskList(String taskListName, int completedCount) {
		super(taskListName, completedCount);
	}
	
	/**
	 * Gets the tasklist's tasks as a 2D string array
	 * @return 2D array of tasks
	 */
	public String[][] getTasksAsArray() {
		SwapList<Task> tasks = (SwapList<Task>) this.getTasks();
		String[][] taskArray = new String[tasks.size()][tasks.size()];
		String iString;
		for (int i = 0; i < tasks.size(); i++) {
			for (int j = 1; j < tasks.size() + 1; i++) {
				taskArray[j][0] = tasks.get(i).getTaskName();
			}
		}
		return taskArray;
	}
	
	/**
	 * Comparable method uses to compare two TaskLists
	 * @param taskList taskList to be compared
	 * @return a integer corresponding to the comparison of tasklists
	 */
	public int compareTo(TaskList taskList) {
		return -1;
	}
}
