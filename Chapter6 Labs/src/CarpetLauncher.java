import java.util.*;
public class CarpetLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		final double CARPET_PRICE = 8.0;
		
		System.out.println("Please enter the length of the room: ");
		double length = keyboard.nextDouble();
		System.out.println("Please enter the width of the room: ");
		double width = keyboard.nextDouble();
	
		CarpetDimensions dimensions = new CarpetDimensions(length, width);
		Carpet room = new Carpet(dimensions, CARPET_PRICE);
		
		System.out.println(room);
	}

}
