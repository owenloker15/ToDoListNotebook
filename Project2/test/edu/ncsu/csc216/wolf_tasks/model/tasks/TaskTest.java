package edu.ncsu.csc216.wolf_tasks.model.tasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Tests Task
 * @author magolden
 * @author owenloker
 */
public class TaskTest {
	
	/** Tests Task constructor
	 * 
	 */
	@Test
	public void testConstructor() {
		Task t = new Task("HW", "CSC", false, false);
		assertEquals("HW", t.getTaskName());
		assertEquals("CSC", t.getTaskDescription());
		assertEquals(false, t.isRecurring());
		assertEquals(false, t.isActive());
		
		try {
			t = new Task(null, "CSC", false, false);
		}
		catch (IllegalArgumentException e) {
			assertEquals("Incomplete task information.", e.getMessage());
		}
		
		try {
			t = new Task("HW", null, false, false);
		}
		catch (IllegalArgumentException e) {
			assertEquals("Incomplete task information.", e.getMessage());
		}
	}
	
	/** Tests getTaskListName method
	 * 
	 */
	@Test
	public void testGetTaskListName() {
		Task t = new Task("HW", "CSC", false, false);
		AbstractTaskList list = new TaskList("List", 0);
		t.addTaskList(list);
		assertEquals("List", t.getTaskListName());
	}
	
	/** Tests completeTask method
	 * 
	 */
	@Test
	public void testCompleteTask() {
		Task t = new Task("HW", "CSC", false, false);
		t.completeTask();
	}
}
