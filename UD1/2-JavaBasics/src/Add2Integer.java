/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 import java.util.Scanner;   

public class Add2Integer {  
   public static void main (String[] args) {
      // Declare variables
      int number1, number2, sum;
      Scanner in = new Scanner(System.in); 
      System.out.print("Enter first integer: ");  
      number1 = in.nextInt();                     
      System.out.print("Enter second integer: ");  
      number2 = in.nextInt();

      // Compute sum
      sum = number1 + number2;

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
      in.close();  // Close Scanner
   }
}
