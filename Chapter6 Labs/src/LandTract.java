
public class LandTract {

	private double length, width, area;//variables for length, width and area
	
	public LandTract(double length, double width) {
		this.length = length;
		this.width = width;
	}
	//calculates area
	public double calcArea()
	{
		area = length * width;
		return area;
	}
	//to string output
	public String toString()
	{
		return "Area: " + calcArea(); 
	}


	public boolean equals(LandTract t2) {
	       return this.area == t2.area;
	   }
	//gets length
	public double getLength() {
		return length;
	}
	//sets length
	public void setLength(double length) {
		this.length = length;
	}
	//gets width
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	
}
