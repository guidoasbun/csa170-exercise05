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
        
        String inputStr = input.next();
        int strLength = inputStr.length();
        int halfStr = strLength / 2;
        String newStr = inputStr.substring(0,(inputStr.length()/2));
       
        System.out.println(newStr);
      
    }
}