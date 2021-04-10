/**
 * 
 */
package edu.ncsu.csc216.wolf_tasks.model.io;

import java.io.File;

import edu.ncsu.csc216.wolf_tasks.model.tasks.TaskList;
import edu.ncsu.csc216.wolf_tasks.model.util.ISortedList;
import edu.ncsu.csc216.wolf_tasks.model.util.SortedList;

/**
 * Handles file output for the WolfTasks system. Creates a string representation of a notebook and writes it to a file.
 * @author owenloker
 * @author magolden
 */
public class NotebookWriter {
	
	/**
	 * NotebookWriter Constructor
	 */
	public NotebookWriter() {
		
	}
	
	/**
	 * Writes a notebook to a text file
	 * @param fileName name of file to be created
	 * @param notebookName name of notebook being converted to text
	 * @param taskList SortedList of TasksLists in the Notebook
	 */
	public static void writeNotebookFile(File fileName, String notebookName, ISortedList<TaskList> taskList) { //may need to be AbstractTaskList
		
	}
}
