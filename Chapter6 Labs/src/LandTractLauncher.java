import java.util.*;
public class LandTractLauncher {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		double length, width;
		
		//asks user for length and width of track 1 
		System.out.println("Please enter length for track 1: ");
		length = keyboard.nextDouble();
		System.out.println("Please enter width for track 1: ");
		width = keyboard.nextDouble();
		
		//t1 object
		LandTract t1 = new LandTract(length, width);
		//asks user for tract 2 length and width
		System.out.println("Please enter length for track 2: ");
		length = keyboard.nextDouble();
		System.out.println("Please enter width for track 2: ");
		width = keyboard.nextDouble();
		//t2 object
		LandTract t2 = new LandTract(length, width);
		//toString outputs
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		//compares t1 and t2 
		if(t1.equals(t2))
		{
			System.out.println("The areas are the same");
		}else {
			System.out.println("The areas are different");
		}
	}

}
