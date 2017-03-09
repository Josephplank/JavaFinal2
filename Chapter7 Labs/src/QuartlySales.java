
public class QuartlySales {

	
	private final int DIV = 6; //DIV constant
	private final int QTR = 4; //QTR constant
	private int count = 0; //count initialized to 0
	private double[] totalSales = new double[QTR]; // 
	private double avg; //average variable 
	
	//getter and setters for average and total sales
	public double[] getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales[count] += totalSales;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(int i) {
		this.avg = totalSales[i] / DIV;
	}

	public void count()
	{
		count++;
	}
	
	
	
}
