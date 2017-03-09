import java.util.Scanner;
import java.io.*;

public class GradeBookTest {

    public static void main(String[] args) throws IOException {

    	GradeBook[] students = new GradeBook[5];

        getStudentData(students);
        
       

    }

    public static double getStudentData(GradeBook[] array) {
        Scanner scan = new Scanner(System.in);
        String[] student = new String[5];//student array
        double[] test = new double[4];//test array
        
        //iterates though user input
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the name of the student : ");
            student[i] = scan.nextLine();
            for (int j = 0; j < test.length; j++) {
                System.out.println("Enter score " + (j + 1) + " for the student");
                test[j] = scan.nextDouble();
                scan.nextLine();
            }
            array[i] = new GradeBook(student[i], test);
            
        }
        //output
        for(GradeBook val : array)
        {
            System.out.println(val);
        }
        
        return 0;

    }
}