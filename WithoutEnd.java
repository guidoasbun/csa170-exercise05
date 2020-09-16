/* 
*   Guido Asbun
*   CS A170 
*   15-September-2020     
* 
*   Exercise 05
*/ 

import java.util.Scanner;
public class WithoutEnd{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        
        String inputStr = input.next();
        
        System.out.print(inputStr.substring(1, (inputStr.length()-1)));
      
    }
}