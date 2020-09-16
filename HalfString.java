/* 
*   Guido Asbun
*   CS A170 
*   15-September-2020     
* 
*   Exercise 05
*/ 

import java.util.Scanner;
public class HalfString{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an EVEN length string: ");
        
        String inputString = input.nextLine();
        int stringLength = inputString.length();
        int halfString = stringLength / 2;
        String newString = inputString.substring(0,(inputString.length()/2));
       
        System.out.println(newString);
      
    }
}