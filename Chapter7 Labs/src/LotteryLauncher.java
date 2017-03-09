import java.util.*;
public class LotteryLauncher {

	public static void main(String[] args) {
		// Instantiate scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		
		// Instantiate new array to hold users lottery numbers
		int[] myPicks = new int[5];
		
		// Prompt user for lottery numbers and store them sequentially
		// within each element of the array 'myPicks'
		System.out.println("Let's play the lotto!");
		for(int i = 0; i < myPicks.length; i++){
			System.out.print("Enter lotto number " + (i+1) +  ": ");
			myPicks[i] = keyboard.nextInt();
		}
		
		// Instantiate lotteryApp object and use control structures to
		// compare and match numbers in the myPicks array with the randomly
		// generated integers in the 'lotteryNumbers' array.
		Lottery numbers = new Lottery();
		if(numbers.userPicks(myPicks) == 5)
			System.out.println("Jackpot! You are the grand prize winner!");
		else
			System.out.println("Sorry, you only got " + numbers.userPicks(myPicks) +
					" number(s) correct!");
		

	}


}
