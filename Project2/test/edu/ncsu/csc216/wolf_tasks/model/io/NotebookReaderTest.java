package edu.ncsu.csc216.wolf_tasks.model.io;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import edu.ncsu.csc216.wolf_tasks.model.notebook.Notebook;

/**
 * Tests NotebookReader
 * @author magolden
 * @author owenloker
 */
public class NotebookReaderTest {

	/**
	 * Tests NotebookReader
	 */
	@Test
	public void testNotebookReader() {
		File filename = new File("test-files/notebook1.txt");
		Notebook n = NotebookReader.readNodebookFile(filename);
		assertEquals("test-files/notebook1.txt", filename.getName());
	}
}
