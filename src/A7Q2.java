
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // ask how many people's height are being measured
        System.out.println("How many people's height are being measured?");
        int numPeople = input.nextInt();

        // create an array 
        double[] peopleHeights = new double[numPeople];


        // set total to 0
        double total = 0;

        // ask user to enter the heights
        System.out.println("Enter the heights");

        // create for loop to ddetermine total value of heights
        for (int i = 0; i < peopleHeights.length; i++) {
            double heights = input.nextDouble();
            peopleHeights[i] = heights;
            total = total + heights;


        }

        // determine average by dividing the toal value of heights by the number of people
        double avg = total / peopleHeights.length;
        avg = Math.round(avg * 100) / 100.0;
        // print the average
        System.out.println("The average height of the people are " + avg);

        // print the heights that are above average
        for (int i = 0; i < peopleHeights.length; i++) {
            if (peopleHeights[i] > avg) {
                // print the above average height
                System.out.println("The above average height is " + peopleHeights[i]);
            }

        }

    }
}
