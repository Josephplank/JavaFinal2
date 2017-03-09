import java.util.*;
public class MonthLauncher{

	public static void main(String[] args) {

				Scanner keyboard = new Scanner(System.in);
				
				
				Month p1 = new Month(0);
				Month p2 = new Month("Bill");
				Month p3 = new Month(32);
				Month p4 = new Month(6);
				Month p5 = new Month("October");
				Month p6 = new Month(12);
				
				
				
				System.out.println("For the value 0, it will print out " + p1.toString());
				System.out.println("For the value Bill, it will print out " + p2.toString());
				System.out.println("For the value 40, it will print out " + p3.toString());
				System.out.println("For the value 6, it will print out " + p4.toString());
				System.out.println("For the value October, it will print out " + p5.toString());
				System.out.println("For the value 12, it will print out " + p6.toString());
				
				System.out.println("Is June Greater that December " + p5.greaterThan(p6));
				System.out.println("Is June less that December " + p1.lessThan(p4));
				
			}

	}


