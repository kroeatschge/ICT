/**
 * 
 */
package pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/****************************************
 * Date: 08.12.2020
 * Title: FileData class to handle file input
 * @author MACH 
 * @version 1.0
 ****************************************/
public class FileData {
	/**
	 * method to read a File line by line into an ArrayList
	 * @param file name of file to read. Eg. mydata.txt
	 * @return ArryList containing the read lines
	 * @throws IOException for handling file access errors
	 */
	public ArrayList<String> readFile(String file) throws IOException {
		// ArrayList to store lines
		ArrayList<String> myLines = new ArrayList<String>();

		// get a reader object
		FileReader reader = new FileReader(file);
		// Buffered reader to read by lines
		BufferedReader buffer = new BufferedReader(reader);

		/****************************************
		 * Author name: javaTpoint 
		 * Date: n.d. 
		 * Title: How to read file line by line in
		 * Java Source: https://www.javatpoint.com/how-to-read-file-line-by-line-in-java
		 ****************************************/
		// read from StringBuffer until nothing is left
		String line;
		while ((line = buffer.readLine()) != null) {
			myLines.add(line);
		}

		// close the buffer, reader, ...
		buffer.close();

		return myLines;
	}
}
