
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create Scanner Input
        Scanner input = new Scanner(System.in);
        
        // ask the user how many marks need to be inputted
        System.out.println("How many marks are there?");
        int numMarks = input.nextInt();

        int[] myNums = new int[numMarks];

        // Ask the user for the numbers
        for(int a = 0; a < myNums.length; a++){
            System.out.println("Enter the mark");
            myNums[a] = input.nextInt();
        }



        // create loop to arrange the numbers in the array from lowest to greatest
        for (int x = 0; x < myNums.length - 1; x++) {
            for (int y = x + 1; y < myNums.length; y++) {
                // if the x value is greater or equal to y, swap position x and y
                if (myNums[x] >= myNums[y]) {                                      
                    int higherNum = myNums[x];
                    int lowerNum = myNums[y];
                    myNums[x] = lowerNum;
                    myNums[y] = higherNum;
                }
                // if x is less than y, dont swap positions
                if(myNums[x] < myNums[y]){
                    int higherNum = myNums[y];
                    int lowerNum = myNums[x];
                    myNums[x] = lowerNum;
                    myNums[y] = higherNum;                   
                }     
            }
        }
        // print out the marks from lowest to highest
        System.out.println("The marks from lowest to highest are:");
        
        // create for loop to print all the nums from lowest to greatest
        for(int z = 0; z < myNums.length; z++){
            System.out.println(myNums[z]);         
        }
        // if the remainder is equal to zero after dividing by two
        if(numMarks %2 == 0){
            int mediaOne = numMarks / 2;
            int mediaTwo = (numMarks / 2) - 1;  
            int media = (myNums[mediaOne] + myNums[mediaTwo]) / 2;
            // output the media
            System.out.println("The average media is " + media);
        }else{ 
            // other wise print out the the median of the marks 
            int half = numMarks / 2;
            int median = myNums[half];
            System.out.println("The median is " + median);          
        }     
    }
}
    

