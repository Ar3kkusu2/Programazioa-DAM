/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class HarmonicSum {  
   public static void main (String[] args) {
      
      double maxDenominator = 50000; 
      double sumL2R = 0.0;        
      double sumR2L = 0.0;      
      double absDiff;   
      double denominator = 1;
   
      while (denominator <= maxDenominator) {
          sumL2R = sumL2R + 1/denominator;
          ++denominator;
      }
      
      denominator = 1;
      while (maxDenominator >= denominator) {
          sumR2L = sumR2L + 1/maxDenominator;
          --maxDenominator;
      }
      
      System.out.println("The sum from left-to-right is: " + sumL2R);
      System.out.println("The sum from right-to-left is: " + sumR2L);
      
      if (sumL2R > sumR2L) {
         absDiff = sumL2R - sumR2L;
      } else {
         absDiff = sumR2L - sumL2R;
      }
      
      System.out.println("The absDiff is: " + absDiff);
   }
}
