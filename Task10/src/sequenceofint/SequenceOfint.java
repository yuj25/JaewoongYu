package sequenceofint;


public class SequenceOfint {

    public static void main(String[] args) {
       // generate sub-string of maximum size
        System.out.println(SequenceOfint("123415167"));
    }
    
    public static String SequenceOfint ( String a){ 
     // generate position of array
     char[] characters = a.toCharArray();
        //variable initialized 
        int trial = 1;
        int x = 0;
        int y = 0;
        //store sub- string into 'z' 
        String z = "";
        // loops throught the size of a -1
        for (int i = 0; i < a.length() - 1; i++) {
            // if the trial is first then check the current position of array with next position of array
            if (trial == 1 && (int) characters[i] == (int) characters[i + 1] - 1) {
                // increment of 'x'
                x = x + 2;
                // if x is bigger than y
                if (y < x) {
                   // when y is equal to x 
                    y = x;
                    // store current element and next element 
                    z += String.valueOf(characters[i]) + String.valueOf(characters[i + 1]);
                }
                // increment 
                trial++;
            // if not first trial and checks the current position with the next position of element 
            } else if (trial != 1 && (int) characters[i] == (int) characters[i + 1] - 1) {
               // increment x
                x++;
                {
                   //if x is bigger than y
                    if (y < x) {
                      // when y is equal to x   
                        y = x;
                        //  store the next element of array
                        z += String.valueOf(characters[i + 1]);
                    }
                }
               
            } else {
                // when x is equial to '0'
                x = 0;
                //when trial is equial to 1
                trial = 1;
            }
        }
        //print out y
        System.out.println(y);
       
        return z;
}
}