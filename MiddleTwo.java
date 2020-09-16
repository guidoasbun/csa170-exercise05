/* 
*   Guido Asbun
*   CS A170 
*   15-September-2020     
* 
*   Exercise 05
*/ 

import java.util.Scanner;
public class MiddleTwo{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String inputStr = input.next();
        int strLength = inputStr.length();
        String newStr = inputStr.substring(strLength/2-1,strLength/2+1);
        
        System.out.print(newStr);
        
    }
}