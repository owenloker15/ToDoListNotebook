/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.notebook;

import java.io.File;

import edu.ncsu.csc216.wolf_tasks.model.io.NotebookWriter;
import edu.ncsu.csc216.wolf_tasks.model.tasks.AbstractTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.ActiveTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.Task;
import edu.ncsu.csc216.wolf_tasks.model.tasks.TaskList;
import edu.ncsu.csc216.wolf_tasks.model.util.ISortedList;
import edu.ncsu.csc216.wolf_tasks.model.util.SortedList;

/**
 * Represents a Notebook object in the WolfTasks system.
 * A Notebook is a collection of TaskLists
 * @author owenloker
 * @author magolden
 */
public class Notebook {
	
	/** SortedList of all TaskLists in the Notebook */
<<<<<<< HEAD
	private ISortedList<TaskList> taskLists;
=======
	private ISortedList<TaskList> taskLists; //may need to be AbstractTaskList
>>>>>>> branch 'main' of https://github.ncsu.edu/engr-csc216-spring2021/csc216-P2-T-44.git
	
	/** List of all tasks marked as active */
	private ActiveTaskList activeTaskList;
	
	/** The current TaskList */
	private AbstractTaskList currentTaskList;
	
	/** Name of Notebook */
	private String notebookName;
	
	/** Holds a boolean value for whether or not this notebook has been altered */
	private boolean isChanged;
	
	/**
	 * Notebook Constructor
	 * @param notebookName name of Notebook
	 */
	public Notebook(String notebookName) {
		setNotebookName(notebookName);
		this.taskLists = new SortedList<TaskList>();
		this.activeTaskList = new ActiveTaskList();
		this.currentTaskList = activeTaskList;
		setChanged(true);
	}
	
	/**
	 * Utilizes NotebookWriter to save a notebook to a given file
	 * @param notebookFile name of file to save to
	 */
	public void saveNotebook(File notebookFile) {
		if(this.currentTaskList == null || this.currentTaskList.getTasks().size() == 0) {
			throw new IllegalArgumentException("Unable to save to file.");
		}
		NotebookWriter.writeNotebookFile(notebookFile, getNotebookName(), this.taskLists);
		setChanged(false);
	}

	/**
	 * Gets the current TaskList
	 * @return the currentTaskList
	 */
	public AbstractTaskList getCurrentTaskList() {
		return this.currentTaskList;
	}

	/**
	 * Sets the current TaskList
	 * @param taskListName name of the currentTaskList to set
	 */
	public void setCurrentTaskList(String taskListName) {
		for (int i = 0; i < this.taskLists.size(); i++) {
			TaskList list = (TaskList) this.taskLists.get(i);
			if (taskListName.equals(list.getTaskListName())) {
				this.currentTaskList = list;
			}
		}
	}

	/**
	 * Gets the Notebook name
	 * @return the notebookName
	 */
	public String getNotebookName() {
		return this.notebookName;
	}

	/**
	 * Sets the Notebook name
	 * @param notebookName the notebookName to set
	 */
	private void setNotebookName(String notebookName) {
		if (notebookName == null || "".equals(notebookName) || "Active Tasks".equals(notebookName)) {
			throw new IllegalArgumentException("Invalid name.");
		}
		this.notebookName = notebookName;
	}

	/**
	 * Gets the current value of isChanged
	 * @return the isChanged
	 */
	public boolean isChanged() {
		return this.isChanged;
	}

	/**
	 * @param isChanged the isChanged to set
	 */
	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}

	/**
	 * Gets the ActiveTaskList
	 * @return the activeTaskList
	 */
	private void getActiveTaskList() {
		this.activeTaskList = null;
		
		for (int i = 0; i < this.taskLists.size(); i++) {
			TaskList list = (TaskList) this.taskLists.get(i);
			for (int j = 0; j < list.getTasks().size(); j++) {
				if(list.getTasks().get(j).isActive()) {
					this.activeTaskList.addTask(list.getTasks().get(j));
				}
			}
		}
	}
	
	/**
	 * Adds a TaskList to the Notebook
	 * @param taskList to be added
	 */
	public void addTaskList(TaskList taskList) {
		if (taskList.getTaskListName().equals(ActiveTaskList.ACTIVE_TASKS_NAME)) {
			throw new IllegalArgumentException("Invalid name.");
		}
		this.taskLists.add(taskList);
		setCurrentTaskList(taskList.getTaskListName());
		setChanged(true);
	}
	
	/**
	 * Gets the names of all the TaskLists as a String array
	 * @return String array of TaskList names
	 */
	public String[] getTaskListsNames() {
		String[] names = new String[this.taskLists.size()];
		for(int i = 0; i < this.taskLists.size(); i++) {
			names[i] = this.taskLists.get(i).getTaskListName();
		}
	}
	
	/**
	 * Changes the name of a TaskList.
	 * @param taskListName new name of TaskList
	 */
	public void editTaskList(String taskListName) {
		if(getCurrentTaskList() == this.activeTaskList) {
			throw new IllegalArgumentException();
		}
		if(getCurrentTaskList().getTaskListName().equals(ActiveTaskList.ACTIVE_TASKS_NAME)) {
			throw new IllegalArgumentException();
		}
		for(int i = 0; i < this.taskLists.size(); i++) {
			if(taskListName.equals(this.taskLists.get(i).getTaskListName())) {
				throw new IllegalArgumentException();
			}
		}
		if(getCurrentTaskList().getTaskListName().equals(taskListName)) {
			throw new IllegalArgumentException();
		}
		
		TaskList temp = new TaskList(taskListName, getCurrentTaskList().getCompletedCount()); //changes current task list name; temporary task list with completed count of the current task list, just with new name
		for(int i = 0; i < this.taskLists.size(); i++) { //removes the current task list to keep order
			if(this.taskLists.get(i).getTaskListName().equals(getCurrentTaskList().getTaskListName())) {
				removeTaskList();
			}
		}
		this.taskLists.add(temp); //adds the temp task list with new name to keep order
		setCurrentTaskList(temp.getTaskListName());
		setChanged(true);
	}
	
	/**
	 * Removes a TaskList form the Notebook
	 */
	public void removeTaskList() {
		
	}
	
	/**
	 * Adds a Task to a TaskList
	 * @param task to be added
	 */
	public void addTask(Task task) {
		
	}
	
	/**
	 * Edits a task
	 * @param idx Unique index of the task that will be edited
	 * @param taskName name of task
	 * @param taskDescription task description
	 * @param recurring boolean value true if the task is recurring
	 * @param active boolean value true if the task is active
	 */
	public void editTask(int idx, String taskName, String taskDescription, boolean recurring, boolean active) {
		
	}
}
