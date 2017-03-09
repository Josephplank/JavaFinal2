import java.util.*;
public class GeometryLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int userInput = 0;//user area calculations
		
		Geometry g1 = new Geometry();
		
		//do while loop for options menu
		do {
			// Get the user's menu choice.
			userInput = g1.getMenu();

			if (userInput == 1) {
				g1.calculateCircleArea();
			} else if (userInput == 2) {
				g1.calculateRectangleArea();
			} else if (userInput == 3) {
				g1.calculateTriangleArea();
			} else if (userInput == 4) {
				System.out.println("Thanks for calculating!");
			}

		} while (userInput != 4);
	}

		
		
		
		

	}


