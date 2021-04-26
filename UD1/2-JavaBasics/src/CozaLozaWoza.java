/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"
   public static void main(String[] args) {
      int lowerbound = 1, upperbound = 110;
      for (int number = lowerbound; number <= upperbound; ++number) {
            // number = lowerbound+1, lowerbound+2, ..., upperbound
         // Print "Coza" if number is divisible by 3
         if ( number % 3 == 0 ) {
            System.out.print("Treh");
         }
         // Print "Loza" if number is divisible by 5
         else if ( number % 5 == 0 ) {
            System.out.print("Chinco");
         }
         // Print "Woza" if number is divisible by 7
         else if ( number % 7 == 0) {
            System.out.print("Sete");
         }
         else if ( number % 11 == 0 ) {
            System.out.print(" "+number);
            System.out.println();
         } else {
            System.out.print(" "+number+" ");  // print a space
         }
      }
   }
}
