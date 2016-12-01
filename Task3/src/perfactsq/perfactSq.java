package perfactSq;

import static java.lang.Math.sqrt;

public class perfactSq {

    public static void main(String[] args) {
        // prints out the return value by calling the ‘perfectSquare’ function.
        System.out.println(perfectSquare(256));
    }

    public static Double perfectSquare(int a) {
        // temporary variable in double format is initialized

        double temp;
        // loops through the size of array ‘a’ in backwards

        for (int i = a; i > 0; i--) {
            // temp variable stores calculated value of square root of ‘I’.
            temp = (double) sqrt(i);
             // new String is initialized to store the double format of temp in a String format
            
            String numberString = Double.toString(temp);
             //Last letter of array is stored in the variable called ‘LastLetterChar’
            char LastLetterChar = numberString.charAt(numberString.length() - 1);
             
            //if the value stored in the ‘LastLetterChar’ is 0, return temp. /
            if (LastLetterChar == '0') {
                return temp;
            }
        }
        return null;
    }
}
