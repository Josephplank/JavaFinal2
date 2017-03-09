import java.util.*;
public class AreaLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String input; //user input
		
		//asks user to pick option
		System.out.println("Please enter number for area\n1 - Circle\n2 - Rectangle\n3 - Cylinder");
		input = keyboard.nextLine();
		//switch statement for user option
		switch(input)
		{
			case "1":
			{
				//asks user for radius of circle
				System.out.println("Area for a circle.\nPlease enter radius:");
				double radius = keyboard.nextDouble();
				System.out.println(Area.area(radius));
				break;
				
			}
			case "2":
			{
				//asks user for length and width for area of rectangle 
				System.out.println("Area for a Rectangle.\nPlease enter a length:");
				double length = keyboard.nextDouble();
				System.out.println("Area for a Rectangle.\nPlease enter a width:");
				double width = keyboard.nextDouble();
				System.out.println(Area.area(length, width));
				break;
			}
			case "3":
			{
				//asks user for radius and height for area of a cylinder
				System.out.println("Area for a cylinder.\nPlease enter a radius:");
				double radius = keyboard.nextDouble();
				System.out.println("Area for a cylinder.\nPlease enter a height:");
				double height = keyboard.nextDouble();
				System.out.println(Area.area(radius, height, ""));
				break;
			}
			default: 
			{
				System.out.println("This is not a valid entry, please try again.");
			}
			
				
			
		}

	}

}
