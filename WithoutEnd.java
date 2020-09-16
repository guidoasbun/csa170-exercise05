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
        
        String inputString = input.nextLine();
        
        System.out.print(inputString.substring(1, (inputString.length()-1)));
      
    }
}