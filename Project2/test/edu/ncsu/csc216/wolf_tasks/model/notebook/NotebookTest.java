package edu.ncsu.csc216.wolf_tasks.model.notebook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//
import org.junit.Test;

import edu.ncsu.csc216.wolf_tasks.model.tasks.AbstractTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.ActiveTaskList;
import edu.ncsu.csc216.wolf_tasks.model.tasks.Task;
import edu.ncsu.csc216.wolf_tasks.model.tasks.TaskList;

/**
 * Tests Notebook
 * @author magolden
 * @author owenloker
 */
public class NotebookTest {
	
	/** Tests Notebook Constructor
	 * 
	 */
	@Test
	public void testNotebookConstructor() {
		Notebook book = new Notebook("Book");
		assertEquals("Book", book.getNotebookName());
		assertEquals("Active Tasks", book.getCurrentTaskList().getTaskListName());
		assertTrue(book.isChanged());
		
		try {
			book = new Notebook(null);
		}
		catch(IllegalArgumentException e) {
			assertEquals("Invalid name.", e.getMessage());
		}
		
		try {
			book = new Notebook("");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Invalid name.", e.getMessage());
		}
		
		try {
			book = new Notebook("Active Tasks");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Invalid name.", e.getMessage());
		}
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetActiveTaskList() {
		Notebook book = new Notebook("Book");
		AbstractTaskList list = new TaskList("List", 0);
		
		Task task = new Task("CSC", "HW", false, true);
		task.addTaskList(list);
		list.addTask(task);
		assertEquals("List", task.getTaskListName());
		assertEquals(1, list.getTasks().size());
		
		task = new Task("Math", "Studying", true, true);
		task.addTaskList(list);
		list.addTask(task);
		assertEquals(2, list.getTasks().size());
		
		task = new Task("English", "Tutoring", false, true);
		task.addTaskList(list);
		list.addTask(task);
		assertEquals(3, list.getTasks().size());
		
		task = new Task("Science", "Lab", false, false);
		task.addTaskList(list);
		list.addTask(task);
		assertEquals(4, list.getTasks().size());
		
		book.get
//		book.addTask(new Task("CSC", "HW", false, true));
//		assertEquals(1, book.getCurrentTaskList().getTasks().size());
//		
//		book.addTask(new Task("Math", "Studying", true, true));
//		assertEquals(2, book.getCurrentTaskList().getTasks().size());
//		
//		book.addTask(new Task("English", "Tutoring", false, true));
//		assertEquals(3, book.getCurrentTaskList().getTasks().size());
	}
}
