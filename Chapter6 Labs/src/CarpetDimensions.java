
public class CarpetDimensions {

	private double length;
	private double width;
	
	public CarpetDimensions(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calcArea()
	{
		return length * width;
	}

	public String toString()
	{
		String str = "Length: " + length + "\nWidth: " + width + "\nArea: " + calcArea();
		return str;
	}
	
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
