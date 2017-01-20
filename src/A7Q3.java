
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner Input
        Scanner input = new Scanner(System.in);

        // create an array for two spots
        int[] myNums = new int[2];

        // Ask the user for the two numbers
        System.out.println("Enter two integers");
        myNums[0] = input.nextInt();
        myNums[1] = input.nextInt();



        // if myNums 0 is greater than myNums 1
        if (myNums[0] > myNums[1]) {
            // swap position 0 and position 1
            int firstNum = myNums[1];
            int secondNum = myNums[0];
            myNums[1] = firstNum;
            myNums[0] = secondNum;
            // print out in ascending order
            System.out.println("The integers in ascending orders are " + myNums[1] + ", " + myNums[0]);
        } else {
            // otherwise if myNums 1 is greater than myNums 0
            int firstNum = myNums[0];
            int secondNum = myNums[1];
            myNums[0] = firstNum;
            myNums[1] = secondNum;
            // print out in ascending order
            System.out.println("The integers in ascending orders are " + myNums[0] + ", " + myNums[1]);
        }










    }
}
