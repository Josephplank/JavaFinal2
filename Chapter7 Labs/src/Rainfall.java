import java.util.*;
public class Rainfall {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		final int SIZE = 12;
		double[] monthlyRain = new double[SIZE];
		RainfallLauncher r1 = new RainfallLauncher();
		
		
		System.out.println("Enter the monthly rain fall amount: ");
		int i = 0;
		
		// Added input validation with 'Do-While Loop'
		for(i = 0; i < SIZE; i++){
			
			do{
				System.out.print("Month " + (i+1) + ": ");
				monthlyRain[i] = keyboard.nextDouble();
				
			}
			while(monthlyRain[i] < 0);
			
		}		
	
		
		System.out.println("The annual sum of rain: " + r1.sumRain(monthlyRain));
		System.out.println("The average sum of rain: " + r1.averageRain(monthlyRain));
		System.out.println("The most amount of rain fall: " + r1.mostRain(monthlyRain));
		System.out.println("The least amount of rain fall: " + r1.leastRain(monthlyRain));
		

	}

}
