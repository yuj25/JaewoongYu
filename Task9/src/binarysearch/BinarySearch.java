package binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        /*ask user input*/
        Scanner reader = new Scanner(System.in);
        /* varaible initialized*/
        int low;
        int high;
        boolean status = false;
        /*print out sentence*/
        System.out.println("Please enter two numbers from low to high");
        /* received interger input from the user */
        low = reader.nextInt();
        high = reader.nextInt();

        /* constructed int list which stores number in int format*/
        int[] j = {2, 3, 5, 7, 9, 13};
        int mid = j.length / 2;
        // if low is lower than high
        if(high < low) {
            // prints out return value
            System.out.println("Error.. high is lower than low");
        }
        // if position mid is equal to low or position mid is equal to high
        else if (j[mid] == low || j[mid] == high) {
            
            status = true;
        // if position mid is lower than high
        } else if (j[mid] > high) {
            // loops through array until the value of mid.
            for (int i = 0; i < mid; i++) {
               // if the element in j is equal or bigger than low or it is equal or lower than high.
               
               
               //if the element in j array is equal or bigger than low or it is equal or lower than high.
                if (j[i] >= low && j[i] <= high) {
                    
                    status = true;
               
                }
           
            }
          // if the mid element in j array is lower than low.
        } else if (j[mid] < low) {
            // loops from the mid elemnt till the end of j array.
            for (int a = mid; a < j.length; a++) {
                // if the element in j is equal or bigger than low or it is equal or lower than high
                if(j[a] >= low && j[a] <= high) {
                   //status becomes true
                    status = true;
                }
            }
        
        } else {
            // status becomes false
            status = false;
        }
        //prints out return valuse
        System.out.println("The answer is: " + status);
    }
}
