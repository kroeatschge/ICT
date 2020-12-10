/**
 * 
 */
package pkg1;

/**
 * @author MACH 08.12.2020 Data class to collect data objects
 */
public class Data {
	private String text;
	private int value;

	/**
	 * primary Constructor for Data Object
	 * 
	 * @param myText
	 * @param myValue
	 */
	Data(String myText, int myValue) {
		text = myText;
		value = myValue;
	}

	/**
	 * Second Constructor to work directly with String lines containing "text;value"
	 * 
	 * @param myLine
	 */
	Data(String myLine) {
		String myString[];

		int myValue;
		// split String at ;
		/****************************************
		 * Author name: javaTpoint 
		 * Date: n.d. 
		 * Title: Java String split() 
		 * Source: https://www.javatpoint.com/java-string-split
		 ****************************************/
		myString = myLine.split(";", 0);
		text = myString[0];

		// fix trailing spaces that might be in the line after the number
		/****************************************
		 * Author name: javaTpoint 
		 * Date: n.d. 
		 * Title: How do you remove all white spaces from a string in java?
		 * https://www.javatpoint.com/java-program-to-remove-all-white-spaces-from-a-string
		 ****************************************/
		myString[1] = myString[1].replaceAll("\\s", "");

		// convert String to integer value
		/****************************************
		 * Author name: javaTpoint 
		 * Date: n.d. 
		 * Title: Java Convert String to int Source:
		 * https://www.javatpoint.com/java-string-to-int
		 ****************************************/
		myValue = Integer.parseInt(myString[1]);

		value = myValue;
	}

	/**
	 * getter method for text
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * getter method for value
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}

}
