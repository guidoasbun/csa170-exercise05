/* 
*   Guido Asbun
*   CS A170 
*   15-September-2020     
* 
*   Exercise 05
*/ 

import java.util.Scanner;
public class RotateLeft{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        
        String inputStr = input.next();
        int strLength = inputStr.length();
        String strFirst = inputStr.substring(2, strLength);
        String strSecond = inputStr.substring(0, 2);
        String newStr = strFirst.concat(strSecond);
        
        System.out.print(newStr);
    }
}