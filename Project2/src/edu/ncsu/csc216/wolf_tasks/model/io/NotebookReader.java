/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.io;

import java.io.File;

import edu.ncsu.csc216.wolf_tasks.model.notebook.Notebook;
import edu.ncsu.csc216.wolf_tasks.model.tasks.AbstractTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.Task;
import edu.ncsu.csc216.wolf_tasks.model.tasks.TaskList;

/**
 * Handles File input for the WolfTasks system. Processes a string representation of a Notebook
 * and uses it to create a Notebook object
 * @author owenloker
 * @author magolden
 */
public class NotebookReader {
	
	/**
	 * NotebookReader Constructor
	 */
	public NotebookReader() {
		
	}
	
	/**
	 * Processes a Notebook from a text file
	 * NOTE: Notebook is spelled wrong in the method signature as per Dr. Heckman on Piazza
	 * @param fileName name of file to be processed
	 * @return A notebook object
	 */
	public static Notebook readNodebookFile(File fileName) {
		return null;
	}
	
	/**
	 * Processes a string representation of a TaskList and uses it to create a TaskList object
	 * @param taskList string representation of a TaskList
	 * @return TaskList object
	 */
	private static TaskList processTaskList(String taskList) {
		return null;
	}
	
	/**
	 * Processes a string representation of a Task and uses it to create a Task object
	 * @param taskList lists of tasks that the current task will be associated with
	 * @param task string representation of a Task
	 * @return Task object
	 */
	private static Task processTask(AbstractTaskList taskList, String task) {
		return null;
	}
}
