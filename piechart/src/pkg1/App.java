/**
 * 
 */
package pkg1;

import java.io.IOException;
import java.util.ArrayList;
import org.jfree.ui.RefineryUtilities;

/**
 * @author MACH 08.12.2020 Display a chart about my ICT50718 progress
 * @version 1.0
 */
public class App {
	/**
	 * working method of the App
	 */
	public void go() {
		// get FileData object
		FileData myFile = new FileData();
		// store lines read from file
		ArrayList<String> myLines = new ArrayList<String>();
		// store data converted from file
		ArrayList<Data> myData = new ArrayList<Data>();
		String myFileName = "myData.txt";

		// get input data from file
		try {
			myLines = myFile.readFile(myFileName);

			// push line content into Data
			for (String myString : myLines) {
				myData.add(new Data(myString));
				// System.out.println(myString);
			}

			// create new reference to chart
			/****************************************
			 * Author name: tutorialspoint.com 
			 * Date: n.d. 
			 * Title: JFreeChart - Pie Chart
			 * Source: https://www.tutorialspoint.com/jfreechart/jfreechart_pie_chart.htm
			 ****************************************/
			Chart myChart = new Chart("my ICT50718 progress");

			// add data to chart as datasets
			for (Data data : myData) {
				myChart.addDataset(data.getText(), data.getValue());
			}

			// set chart size
			myChart.setSize(1000, 800);

			// save a copy of the chart as image
			myChart.saveAsImage(600, 400);

			// show chart on screen
			myChart.setVisible(true);

			// centre chart on screen
			RefineryUtilities.centerFrameOnScreen(myChart);

		} catch (IOException ex) {
			// handle exceptions here
			System.err.println(ex);
		}

	}

	/**
	 * Startup of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// start the app
		App myApp = new App();
		myApp.go();
	}
}
