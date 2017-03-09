import java.util.*;
import java.text.*;

public class QuartlySalesLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("$#,##0.00");
		
		final int DIV = 6;
		final int QTR = 4;
		double[][] array = new double[QTR][DIV];
		
		
		QuartlySales q1 = new QuartlySales();
		
		//user input for values
		System.out.println("Please enter sales data: ");
		for(int i = 0; i < QTR; i++)
		{
			for(int x = 0; x < DIV ; x++)
			{
				System.out.printf("Quarter %d, Division %d: $", (i +1), (x + 1));
				array[i][x] = keyboard.nextInt();
				q1.setTotalSales(array[i][x]);
				
				
			}
			q1.count();
			System.out.println();
		}
		
		//output of values
		System.out.println("Values entered: ");
		for(int j = 0; j < QTR; j++)
		{
			for(int k = 0; k < DIV ; k++)
			{
				System.out.printf("Quarter %d, Division %d sales are: $", (j +1), (k + 1));
				System.out.println(array[j][k]);
				
				
			}
			q1.setAvg(j);
			System.out.printf("Total Sales: %,.2f\n", q1.getTotalSales()[j]);
			System.out.println("AVG for QRT: " + q1.getAvg());
			
			
				double highest = array[j][0];
				int team = 1;
				double r = 0;
				
				for(int x =0; x < DIV; x++)
				{
					if(array[j][x] > highest)
					{
						highest = array[j][x];
						team = x +1;
					}
				}
				
				if(r == 0)
				{
					System.out.println("The highest sale for the division is: " + team + "\n");
					r++;
				}
				
			}
						
		for(int i = 0; i< DIV; i++)
		{
			for(int j = 0; j < QTR; j++)
			{
				if(j > 0)
				{
					double total = array[j][i] - array[j - 1][i];
					System.out.println("For division " + (i + 1) + " quarter " + (j + 1) + " there was a " + total + " change");
				}
				
			}
	
		}
		
		for(int i = 0; i< QTR; i++)
		{
			if(i != 0)
				{
					double company = q1.getTotalSales()[i] - q1.getTotalSales()[i -1];
					System.out.println("The companies change for the quarter " + (i + 1) + " " + company);
				}
			
	}
}
}
