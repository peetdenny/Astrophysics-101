package com.jarden.astro.ui;

import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.contour.ContourDataset;
import org.jfree.data.contour.DefaultContourDataset;
import org.jfree.data.general.Dataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import com.jarden.astro.LorentzTransform;

public class LorentzTransformDemo extends ApplicationFrame{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



		{
	        // set a theme using the new shadow generator feature available in
	        // 1.0.14 - for backwards compatibility it is not enabled by default
	        ChartFactory.setChartTheme(new StandardChartTheme("JFree/Shadow",true));
	    }


	
	public LorentzTransformDemo(String title) {
		super(title);
		 CategoryDataset dataset = createDataset();
	        JFreeChart chart = createChart(dataset);
	        ChartPanel chartPanel = new ChartPanel(chart);
	        chartPanel.setFillZoomRectangle(true);
	        chartPanel.setMouseWheelEnabled(true);
	        chartPanel.setPreferredSize(new Dimension(500, 270));
	        setContentPane(chartPanel);
	}
	
	

	private JFreeChart createChart(CategoryDataset dataset) {
		// TODO Auto-generated method stub
		return null;
	}



	private CategoryDataset createDataset() {
		  // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        double x=0;
        double t=0;
        double v=300000;
        for(int i=0;i<100;i++){
        	//double xPrime = LorentzTransform.findXPrime(x, v, t);
        	//double tPrime = LorentzTransform.findTPrime(x, v, t);
        	//System.out.printf("(%s,%s) (%s,%s)\n",x,t,xPrime,tPrime);
        	double y = Math.sin(x);
        	dataset.addValue(value, rowKey, columnKey)
        	x++;
        }

       return dataset;
	}



	public static void main(String[] args) {
		LorentzTransformDemo ui = new LorentzTransformDemo("Lorentz Transform");
		ui.pack();
		RefineryUtilities.centerFrameOnScreen(ui);
		ui.setVisible(true);
	}

}
