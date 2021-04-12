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
	public void testGetActiveTaskList() { //need to figure out of we use book or task/list to add a task or tasklist
		Notebook book = new Notebook("Book");
		TaskList list = new TaskList("List", 0);
		
		Task task = new Task("CSC", "HW", false, true);
		book.addTaskList(list);
		book.addTask(task); 
		assertEquals("List", task.getTaskListName());
		assertEquals(1, list.getTasks().size());
		
		Task task1 = new Task("Math", "Studying", true, true);
		book.addTaskList(list);
		book.addTask(task1);
		assertEquals(2, list.getTasks().size());
		
		Task task2 = new Task("English", "Tutoring", false, true);
		book.addTaskList(list);
		book.addTask(task2);
		assertEquals(3, list.getTasks().size());
		
		Task task3 = new Task("Science", "Lab", false, false);
		book.addTaskList(list);
		book.addTask(task3);
		assertEquals(4, list.getTasks().size());
		
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
