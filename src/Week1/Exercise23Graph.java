package Week1;

import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.xy.*;
import org.jfree.data.xy.*;

/** DO NOT MODIFY THIS FILE */

public class Exercise23Graph {

    private ChartFrame frame;
    private JFreeChart chart;
    private Plot plot;
    private XYDataset data;
    private XYSeries series;

    public Exercise23Graph(String nimi) {
        series = new XYSeries(nimi);
        series.add(0,0);
        data = new XYSeriesCollection(series);
        plot = new XYPlot(data, new NumberAxis("x"), new NumberAxis("y"), new SamplingXYLineRenderer());
        chart = new JFreeChart(plot);
        frame = new ChartFrame(nimi,chart);
        frame.pack();
        frame.setVisible(true);
    }

    public static Exercise23Graph instance;

    public static Exercise23Graph getInstance() {
        if (instance == null)
            instance = new Exercise23Graph("Graph");
        return instance;
    }

    public static void addNumber(double y) {
        getInstance().lisaaNumero_(y);
    }

    public void lisaaNumero_(double y) {
        double x = series.getMaxX()+1;
        series.add(x,y);
    }
}
