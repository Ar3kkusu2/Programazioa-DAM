/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class ComputePI {   
   public static void main (String[] args) {
      double sum = 0.0;
      int maxDenominator = 1000;   
      for (double denominator = 1; denominator <= maxDenominator; denominator += 2) {
         if (denominator % 4 == 1) {
            sum += 1/denominator;
         } else if (denominator % 4 == 3) {
            sum -= 1/denominator;
         } else {
            System.out.println("Impossible!!!");
         }
      }
      System.out.println("PI = "+4*sum);
   }
}
