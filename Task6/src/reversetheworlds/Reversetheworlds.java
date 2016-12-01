package reversetheworlds ;


public class Reversetheworlds {


    public static void main(String[] args) {
      
        // sentence created in String 
        String str = "This is awesome";                                                         
       
        String str1 = "\n";                                                                                  
        // The sentence is splited into array
         String a[] = str.split(" ");                                                                    
        
        // Prints out all the elements in the array from 0 to the end of the array.
        for (int i=0; i<a.length; i++)                                                              
        {
            
           
           System.out.print(a[i]+" ");                                                             
            
        }
        
        System.out.println("");                                                                       
        
        
        // Prints out all the elements in the array backward.
        
        for(int i=a.length-1; i>=0; i--)                                                            
        {
           // stores the elments of array one by one
            str1 = str1 + a[i] + " ";                                                                    
        }
        System.out.println(str1);                                                                    
        
    }
    
        
    }
