package primenumber00;

import java.util.Scanner;

public class PrimeNumber00 {

    public static void main(String[] args) {
        //ask users input
        Scanner input = new Scanner(System.in);
        //prints out sentence
        System.out.println("Please insert an input");
        //  aks users input next sentence
        String number = input.nextLine();
        //variable initialized
        int i = 2;
        //if the number is equal to zero
        if (Integer.parseInt(number) == 0) {
            // prints out return value
            System.out.println("The number " + number + " is not a prime number");
            
        } else {
            // if the return value is true
            if (isFounded(Integer.parseInt(number), i)) {
                // prints out return value 
                System.out.println("The number " + number + " is a prime number");
                
            } else {
                //prints out return value
                System.out.println("The number " + number + " is not a prime number");
            }
        }
    }

    public static boolean isFounded(int number, int i) {
        // boolean is declared with a true value.
        boolean status = true;
        // if i is equal to number
        if (i == number) {
            //status becomes true.
            status = true;
        // if number is not divisible by 0 and it is not equals to 0
        } else if (number % i != 0) {
            //calls the method 'isFounded' with the number input and incremented i.
            isFounded(number, i + 1);
        // if else
        } else {
           //  status becomes false
            status = false;
        }
        return status;
    }
}
