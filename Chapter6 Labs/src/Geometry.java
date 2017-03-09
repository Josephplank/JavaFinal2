import java.util.*;
import java.text.*;
public class Geometry {
	
	private int userInput; //user input variable
	private double radius, length, width, height, base;//radius, length, width, height and base variables
	
	//gets and sets the radius
	public double getRadius() {return radius;}
	public void setRadius(double radius) {this.radius = radius;}
	//gets and sets the length
	public double getLength() {return length;}
	public void setLength(double length) {this.length = length;}
	//gets and sets the width
	public double getWidth() {return width;}
	public void setWidth(double width) {this.width = width;}
	//gets and sets the height
	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}
	//gets and sets the base
	public double getBase() {return base;}
	public void setBase(double base) {this.base = base;}
	//gets and sets the user input
	public int getUserInput() {return userInput;}
	public void setUserInput(int userInput) {this.userInput = userInput;}
	
	public Geometry() {
		
	}
	
	//menu options method
	public static int getMenu() {

		int userChoice;

		// keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Display the menu.
		System.out.println("\nGeometry Calculator\n");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit\n");
		System.out.print("Enter your choice (1-4) : ");

		// get input from user
		userChoice = keyboard.nextInt();

		// validate input
		while (userChoice < 1 || userChoice > 4) {
			System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
			userChoice = keyboard.nextInt();
		}

		return userChoice;
	}

	
	//calculates the area of a circle
	public static void calculateCircleArea() {

		DecimalFormat fmt = new DecimalFormat("0.00");
		double radius;

		// Get input from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the circle's radius? ");
		radius = keyboard.nextDouble();

		// Display output
		System.out.println("The circle's area is "
				+ fmt.format(Geometry.circle(radius)));
	}
	//calculates area of a rectangle 
	public static void calculateRectangleArea() {
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		double length;
		double width;

		// Get input from user
		Scanner keyboard = new Scanner(System.in);

		// Get length
		System.out.print("Enter length? ");
		length = keyboard.nextDouble();

		// Get width
		System.out.print("Enter width? ");
		width = keyboard.nextDouble();

		// Display output
		System.out.println("The rectangle's area is "
				+ fmt.format(Geometry.rectangle(length, width)));
	}
	//calculates area of a triangle
	public static void calculateTriangleArea() {

		DecimalFormat fmt = new DecimalFormat("0.00");
		double base;
		double height;

		// Get input from user
		Scanner keyboard = new Scanner(System.in);

		// Get the base
		System.out.print("Enter length of the triangle's base? ");
		base = keyboard.nextDouble();

		// Get the height
		System.out.print("Enter triangle's height? ");
		height = keyboard.nextDouble();

		// Display the triangle's area.
		System.out.println("The triangle's area is "
				+ fmt.format(Geometry.triangle(base, height)));
	}
	
	//area calculations
		public static double circle(double radius) {
		 return Math.PI * Math.pow(radius, 2);
		}
		
		public static double rectangle(double length, double width)
		{
			
			return length * width;
		}
		
		public static double triangle(double base, double height)
		{
			return base * height * 0.5;
		}
}
