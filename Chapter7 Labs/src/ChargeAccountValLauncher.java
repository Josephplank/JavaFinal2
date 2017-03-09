import java.util.*;

public class ChargeAccountValLauncher {

	public static void main(String[] args) {
		
		ChargeAccountVal c1 = new ChargeAccountVal(); //charge account object
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		//user input 
		do{
		System.out.println("Please enter charge account number: ");
		input = keyboard.nextInt();
		
		if(c1.sequentialSearch(input) == -1)
		{
			System.out.println("This account was not found, please try again.");
		}else{
			System.out.println("This is a valid account");
		}
		}while(input != -99);
		

	}

}
