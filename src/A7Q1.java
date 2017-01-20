
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user how many students their are
        System.out.println("How many students in the class?");
        int numStudents = input.nextInt();
        
        // create an array for the number of students in the class
        double[] classMarks = new double[numStudents];
        
        // set total to 0
        double total = 0;
        
        // ask user to enter marks
        System.out.println("Enter the marks");
        
        // determine the total value of all marks when added together
        for(int i=0; i < classMarks.length; i++){
            double marks = input.nextDouble();
            total = total + marks;         
        }
        // determine the average of the marks and print it out
        double avg = total / classMarks.length;
        avg = Math.round(avg * 100) / 100.0;
        System.out.println(avg);
        
        
        
        
    }
}
