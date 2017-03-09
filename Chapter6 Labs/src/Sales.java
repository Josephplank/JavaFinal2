import java.util.*;
import java.io.*;
import java.text.*;
public class Sales {

	public static void main(String[] args) throws IOException{
		
		Scanner keyboard = new Scanner(System.in);
		PrintWriter writer = new PrintWriter("WeeklySales.txt");
		
		double userInput = 0;
		double accum = 0;
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Please enter sales for day " + i);
			userInput = keyboard.nextDouble();
			writer.println("Sales " + i + " : " + userInput);
			
			
			if(userInput < 0)
			{
				System.out.println("This is an invalid entry, please try again ");
				System.out.println("Please enter sales for day " + i);
				userInput = keyboard.nextDouble();
				writer.println("Sales " + i + " : " + userInput);
				accum += userInput;
				
			}else{
				
				accum += userInput;
			}
			
		}
		
		
		writer.println("Total Sales: " + accum);

		
		writer.close();
	}

}
