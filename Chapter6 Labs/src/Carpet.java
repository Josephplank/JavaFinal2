import java.text.DecimalFormat;
import java.util.*;

public class Carpet {

	private CarpetDimensions size;
	private double cost;
	
	public Carpet(CarpetDimensions dim, double cost) {
		
		this.size = new CarpetDimensions(dim.getLength(), dim.getWidth());
		this.cost = cost;
	}
	
	public double getCost() {
		return cost * size.calcArea();
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat();
		
		String str = "Room Dimensions: \n" + size + "\nCost: $" + dollar.format(getCost());
		return str;
	}

	

}
