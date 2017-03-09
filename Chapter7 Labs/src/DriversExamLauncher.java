import java.util.*;
import java.text.*;
public class DriversExamLauncher {

	public static void main(String[] args) {
	
		Scanner k = new Scanner(System.in);
		String[] userAnswers = new String[20];
		
	
		for(int i = 0; i < userAnswers.length;i++){
			System.out.println("Enter the correct letter for the answer: ");
			System.out.println("A");
			System.out.println("B");
			System.out.println("C");
			System.out.println("D");
			userAnswers[i] = k.nextLine().toUpperCase();
		}
		
		DriversExam d1 = new DriversExam(userAnswers);
		
		if(d1.Pass() == true){
			System.out.println("You have passed the test.");
		}else{
			System.out.println("You're a loser and failed.");
		}
		
		System.out.println("Total correct: " + d1.getTotalCorrect());
		System.out.println("Total incorrect: " + d1.getTotalIncorrect());
		System.out.println("Missed Questions: " + d1.getMissed());
	}
		
		
		
	}


