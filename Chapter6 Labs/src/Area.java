
public class Area {

	//static method for area of a circle
	public static double area(double radius) {
	 return Math.PI * Math.pow(radius, 2);
	}
	//static method for area of a rectangle
	public static double area(double length, double width)
	{
		return length * width;
	}
	//static method for area of a cylinder
	public static double area(double radius, double height, String s)
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	

}
