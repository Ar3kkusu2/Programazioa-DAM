/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class Product1ToN {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      long product = 1;      
      int lowerbound = 1;
      int upperbound = 13;
      
       for (int i = lowerbound; i <= upperbound; i++) { //6227020800
           product = product * i;
       }
       
      System.out.println("Factorial of "+upperbound+" is "+product);
   }
}
