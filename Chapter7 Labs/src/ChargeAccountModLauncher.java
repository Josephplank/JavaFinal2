import java.util.Scanner;
import java.text.*;
import java.io.*;

public class ChargeAccountModLauncher {

	public static void main(String[] args) throws IOException {
		
		ChargeAccountMod c1 = new ChargeAccountMod();
		Scanner keyboard = new Scanner(System.in);
		final int SIZE = 18;
		int[] account =  new int[SIZE];
		int input;
		int index = 0;
		
		File file = new File("charge.txt");
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext() && index < account.length)
		{
			account[index] = inputFile.nextInt();
			index++;
		}
		inputFile.close();
		
		
		do{
		System.out.println("Please enter charge account number: ");
		input = keyboard.nextInt();
		
		if(c1.sequentialSearch(account, input) == -1)
		{
			System.out.println("This account was not found, please try again.");
		}else{
			System.out.println("This is a valid account");
		}
		}while(input != -99);
		
	}

}
