
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner Input
        Scanner input = new Scanner(System.in);

        int[] myNums = new int[10];

        // Ask the user for the two numbers
        System.out.println("Enter ten marks");
        myNums[0] = input.nextInt();
        myNums[1] = input.nextInt();
        myNums[2] = input.nextInt();
        myNums[3] = input.nextInt();
        myNums[4] = input.nextInt();
        myNums[5] = input.nextInt();
        myNums[6] = input.nextInt();
        myNums[7] = input.nextInt();
        myNums[8] = input.nextInt();
        myNums[9] = input.nextInt();



        // create loop to arrange the numbers in the array from lowest to greatest
        for (int x = 0; x <= 8; x++) {
            for (int y = x + 1; y <= 9; y++) {
                // if the x value is greater or equal to y, swap position x and y
                if (myNums[x] >= myNums[y]) {
                    int higherNum = myNums[x];
                    int lowerNum = myNums[y];
                    myNums[x] = lowerNum;
                    myNums[y] = higherNum;
                }
                // if x is less than y, dont swap positions
                if (myNums[x] < myNums[y]) {
                    int higherNum = myNums[y];
                    int lowerNum = myNums[x];
                    myNums[x] = lowerNum;
                    myNums[y] = higherNum;
                }
            }
        }
        // print out the marks from lowest to highest
        System.out.println("The marks from lowest to highest are:");

        // make for loop to print out all the marks
        for (int z = 0; z < myNums.length; z++) {
            System.out.println(myNums[z]);
        }
    }
}
