package edu.ncsu.csc216.wolf_tasks.model.io;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import edu.ncsu.csc216.wolf_tasks.model.notebook.Notebook;
import edu.ncsu.csc216.wolf_tasks.model.tasks.Task;
import edu.ncsu.csc216.wolf_tasks.model.tasks.TaskList;
import edu.ncsu.csc216.wolf_tasks.model.util.ISortedList;

/**
 * Tests NotebookWriter
 * @author magolden
 * @author owenloker
 */
public class NotebookWriterTest {
	
	/**
	 * Test NotebookWriter
	 */
	@Test
	public void testNotebookWriter() {
		Notebook n = new Notebook("Test Notebook");
		
		TaskList tl1 = new TaskList("Test TaskList 1", 0);
		TaskList tl2 = new TaskList("Test TaskList 2", 0);
		
		Task t1 = new Task("Test Task 1", "Test description\nwith new line", false, true);
		Task t2 = new Task("Test Task 2", "Test description", true, true);
		
		n.addTaskList(tl1);
		n.addTask(t1);
		
		n.addTaskList(tl2);
		n.addTask(t2);
		
		ISortedList<TaskList> tasklists = n.getTaskLists();
		
		File filename = new File("test-files/test_output1.txt");
		NotebookWriter.writeNotebookFile(filename, n.getNotebookName(), tasklists);
	}
}
