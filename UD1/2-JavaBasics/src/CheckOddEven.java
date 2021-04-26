/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class CheckOddEven {   // Save as "CheckOddEven.java"
   public static void main(String[] args) {  // Program entry point
      int number = 48;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( number % 2 == 0 ) {
         System.out.println( "Even number" );   // even number
      } else {
         System.out.println( "Odd number" );   // odd number
      }
      System.out.println( "Bye!" );
   }
}
