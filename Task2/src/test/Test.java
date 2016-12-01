package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /* variable initialized */
        int num, factorial = 1;    
        char[] factorialreal;
        int counter = 0;
        int a;
        
        /* ask users input */
        Scanner reader = new Scanner(System.in);
        /* print out sentence*/
        System.out.println("To get Factorial Output number");
        System.out.println("Enter a number: ");
        /* received interger input from the user */
        num = reader.nextInt();
        /*  using for loop factorial is multipliyed by i*/
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        /* This factorialreal interger is distributed into a CharArray*/ 
        factorialreal = Integer.toString(factorial).toCharArray();
        /* a is assigned to the value of factorialreal length */
        a = factorialreal.length;
        /* looping throught the number of factorialreal length  */
        for (int j = 0; j < factorialreal.length; j++) {
            /* if the last element of factorialreal letter equals to 0 it is accepted  */
            if (factorialreal[a-1] == '0') {
               /* it counts number of  0 in the array  */
                if (factorialreal[j] == '0') {
                    
                    counter++;
                }
            } else {
                break;
            }
        }
       /*print out sentence */
        System.out.println("Output:" + factorial);
        System.out.println("Output:" + counter);
    }
}
