import java.util.*;
public class LargerThanLauncher {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		int[] numbers = {561,52,54,84,645,19,564,36,2,4,76};
		LargerThan l1 = new LargerThan();
		int input;
		
		System.out.println("Please enter any number: ");
		input = keyboard.nextInt();
		
		l1.largerNums(numbers, input);
		
		

	}

}
