
import java.util.Scanner;


public class RandomArray2 {

   
    public static void main(String[] args) {
        /* ask users input*/
        Scanner keyboard = new Scanner (System.in);
        /*  constructed array list which stores number in stirng format*/
        String[] NumberOflist ={"4","3","8","6","1","9","2","7"};
        /* loops number of array list  */
        for (int i = 0; i < NumberOflist.length; i++){
            /* generated random number */
            int index = (int)(Math.random() * NumberOflist.length);
            /* swapping number from fisrt element with generated random number position of element*/
            String temp = NumberOflist[i];
            NumberOflist[i] = NumberOflist[index];
            NumberOflist[index] = temp;
    } 
        for (int j = 0; j < NumberOflist.length; j ++){
            /*print out all the swapped numbers of element within the array */
            System.out.println(NumberOflist[j]);

        }
    }
    
}
