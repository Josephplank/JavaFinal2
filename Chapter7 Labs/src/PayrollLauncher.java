import java.util.*;
import java.text.*;

public class PayrollLauncher {

	public static void main(String[] args) {
		
		
		Payroll p1 = new Payroll(); //payroll object
		Scanner keyboard = new Scanner(System.in);
		
		//user input 
		for (int index = 0; index < 7; index++)
		{
			// Gets data
			System.out.println("\n=====EMPLOYEE " + p1.getEmployeeId(index) + "=====");
			
			do
			{
				System.out.print("Please enter hours worked: ");
				p1.setHours(index, keyboard.nextInt());
				
				if(!validHours(p1.getHours(index)))
				{
					System.out.println("Invaid input, Please only enter nonnegative numbers.");
				}
			} while(!validHours(p1.getHours(index)));
			
			do
			{
				System.out.print("Please enter pay rate: $");
				p1.setPayRate(index, keyboard.nextDouble());
				
				if(!validPayrate(p1.getPayrate(index)))
				{
					System.out.println("Invalid input! Please only enter numbers greater than six.");
				}
			} while (!validPayrate(p1.getPayrate(index)));
			
			// Calculates wages
			p1.calculateWages();
		}
		
		System.out.println();
		//iterates through employee info
		for(int index = 0; index < 7; index++)
		{
			// Displays the employee's information
			System.out.println("\n=====EMPLOYEE " + p1.getEmployeeId(index) + "=====");
			System.out.println("Gross wages: $" + p1.getWages(index));
		}
		
		keyboard.close();
	}


	
	
		

//validate hours
public static boolean validHours(int input)
{
	if(input > 0)
	{
		return true;
	}
	
	else
	{
		return false;
	}
}

//validate payrate
public static boolean validPayrate(double input)
{
	if(input >= 6)
	{
		return true;
	}
	
	else
	{
		return false;
	}
}
}
