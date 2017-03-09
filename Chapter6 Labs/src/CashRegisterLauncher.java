import java.util.*;
import java.io.*;
import java.text.*;
public class CashRegisterLauncher {

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		
		double quantity = 0;
		
		DecimalFormat format = new DecimalFormat("#,##0.00");
		
		RetailItem item = new RetailItem("Candy Bar", 17789, 0.75, 10);
		
		System.out.println("Please enter quantity of item: ");
		quantity = keyboard.nextDouble();
		
		CashRegister c1 = new CashRegister(item, quantity);
		
		PrintWriter writer = new PrintWriter("Register.txt");
		
		writer.print(c1.toString());
		
		writer.close();
		
		keyboard.close();
		
		
	}

}
