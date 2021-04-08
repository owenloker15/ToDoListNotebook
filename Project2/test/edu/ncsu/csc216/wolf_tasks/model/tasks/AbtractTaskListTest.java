package edu.ncsu.csc216.wolf_tasks.model.tasks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests AbstractTaskList
 * @author magolden
 * @author owenloker
 */
public class AbtractTaskListTest {
	
	//Most of Abstract Test Coverage is tested in other tests like Task
	
	/** Tests AbstractTaskListConstructor
	 * 
	 */
	@Test
	public void testConstructor() {
		AbstractTaskList list;
		
		try {
			list = new TaskList("Name", -1);
		}
		catch(IllegalArgumentException e) {
			assertEquals("Invalid completed count.", e.getMessage());
		}
		
		list = new TaskList("Name", 0);
		list.setTaskListName("New Name");
		assertEquals(0, list.getCompletedCount());
		assertEquals("New Name", list.getTaskListName());
	}
}
