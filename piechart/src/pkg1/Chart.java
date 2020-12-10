/**
 * 
 */
package pkg1;

import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;


/**
 * @author MACH 08.12.2020 Chart class to setup and display a pieChart
 */

/****************************************
 * Author name: Object Refinery Limited
 * Date: n.d. 
 * Title: JFreeChart
 * Source: https://www.jfree.org/jfreechart/
 ****************************************/

/****************************************
 * Author name: tutorialspoint.com 
 * Date: n.d. 
 * Title: JFreeChart - File Interface
 * Source: https://www.tutorialspoint.com/jfreechart/jfreechart_pie_chart.htm
 ****************************************/
public class Chart extends ApplicationFrame {
	// Dataset to store all chart data
	private DefaultPieDataset myDataset = new DefaultPieDataset();
	private String myTitle;
	private JFreeChart chart;

	/**
	 * Constructor method for chart
	 * 
	 * @param title
	 */
	public Chart(String title) {
		super(title);
		// take over title also for chart title
		myTitle = title;
		setContentPane(createPanel());
	}

	/**
	 * Create a panel and a chart using myDataset for data
	 * 
	 * @return
	 */
	public JPanel createPanel() {
		// JFreeChart chart = createChart(createDataset());
		chart = createChart(myDataset);
		return new ChartPanel(chart);
	}

	/**
	 * Create the pie chart
	 * 
	 * @param dataset
	 * @return
	 */
	private JFreeChart createChart(PieDataset dataset) {
		JFreeChart chart = ChartFactory.createPieChart(myTitle, // chart title
				dataset, // data
				true, // include legend
				true, false);
        
		return chart;
	}

	/**
	 * add a new Dataset to chart data
	 * 
	 * @param myText
	 * @param myValue
	 */
	public void addDataset(String myText, int myValue) {
		myDataset.setValue(myText, myValue);
	}

	/**
	 * method to save the final chart as image
	 */
	public void saveAsImage(int myWidth, int myLenght) {

		/****************************************
		 * Author name: tutorialspoint.com 
		 * Date: n.d. 
		 * Title: JFreeChart - File Interface
		 * Source:
		 * https://www.tutorialspoint.com/jfreechart/jfreechart_file_interface.htm
		 ****************************************/
		File pieChart = new File("myProgress.jpeg");
		try {
			ChartUtilities.saveChartAsJPEG(pieChart, chart, myWidth, myLenght);
		} catch (IOException ex) {
			// handle exceptions here
			System.out.println("Error writing pieChart to file.");
			ex.printStackTrace();
		}

	}

}
