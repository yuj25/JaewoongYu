package removevowelss;

import java.util.Scanner;

public class Removevowelss {

    public static void main(String[] args) {
    
       // ask users input 
        Scanner input = new Scanner(System.in);
       // prints out sentence 
        System.out.println("Please input...");
       //  aks users input next sentence
        String someString = input.nextLine();
        // variable initialized
        int n = 0;
        // Sends the user input and position of char array as 0 to the method 'vowelString.
        System.out.println(VowelString(someString, n));
    }

    public static String VowelString(String s, int n) {
        // makes characters samll letter
        s = s.toLowerCase();
        // generate posiion of array
        char[] letters = s.toCharArray();
        // if array is equal to 'n'
        if (letters.length == n) {
            // return string
            return "";
            
        } else {
           //if the element of an array is not equal to 'a' or 'e' or 'i' or 'o' or 'u'
            if (letters[n] != 'a' && letters[n] != 'e' && letters[n] != 'i' && letters[n] != 'o' && letters[n] != 'u') {
                //prints out letters and calls the fucntion again with increamented n and user input
                return letters[n] + VowelString(s, n + 1);
                
            } else {
               // calls the fucntion again with increamented 
                return VowelString(s, n + 1);
            }
        }
    }
}
