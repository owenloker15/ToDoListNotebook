/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.notebook;

import java.io.File;

import edu.ncsu.csc216.wolf_tasks.model.tasks.AbstractTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.ActiveTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.Task;
import edu.ncsu.csc216.wolf_tasks.model.tasks.TaskList;
import edu.ncsu.csc216.wolf_tasks.model.util.ISortedList;
import edu.ncsu.csc216.wolf_tasks.model.util.SortedList;

/**
 * @author owenloker
 *
 */
public class Notebook {
	
	private SortedList<TaskList> taskLists; //may need to be AbstractTaskList
	
	private ActiveTaskList activeTaskList;
	
	private AbstractTaskList currentTaskList;
	
	private String notebookName;
	
	private boolean isChanged;
	
	public Notebook(String notebookName) {
		
	}
	
	public void saveNotebook(File notebookFile) {
		
	}

	/**
	 * @return the currentTaskList
	 */
	public AbstractTaskList getCurrentTaskList() {
		return currentTaskList;
	}

	/**
	 * @param currentTaskList the currentTaskList to set
	 */
	public void setCurrentTaskList(String taskListName) {
//		this.taskListName = taskListName;
	}

	/**
	 * @return the notebookName
	 */
	public String getNotebookName() {
		return notebookName;
	}

	/**
	 * @param notebookName the notebookName to set
	 */
	private void setNotebookName(String notebookName) {
		this.notebookName = notebookName;
	}

	/**
	 * @return the isChanged
	 */
	public boolean isChanged() {
		return isChanged;
	}

	/**
	 * @param isChanged the isChanged to set
	 */
	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}

	/**
	 * @return the activeTaskList
	 */
	private void getActiveTaskList() {
		
	}
	
	public void addTaskList(TaskList taskList) {
		
	}
	
	public String[] getTaskListsNames() {
		return null;
	}
	
	public void editTaskList(String taskListName) {
		
	}
	
	public void removeTaskList() {
		
	}
	
	public void addTask(Task task) {
		
	}
	
	public void editTask(int idx, String taskName, String taskDescription, boolean recurring, boolean active) {
		
	}
}
