/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      //int sum = 0;          
      double average;       
      int lowerbound = 1;
      int upperbound = 100;
      //int count = 0;
      int sumOdd  = 0;   
      int sumEven = 0;   
      int absDiff;

      for (int number = lowerbound; number <= upperbound; ++number) {
          if (number % 2 == 0) {
            sumOdd += number;
          } else {
            sumEven += number;
         }
          //sum = sum + (number*number);  
          //++count;
      }
      
      if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven;
      } else {
         absDiff = sumEven - sumOdd;
      }
      
      absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven):(sumEven - sumOdd);
      
      System.out.println("The sumOdd is "+sumOdd);
      System.out.println("The sumEven is "+sumEven);
      System.out.println("The absDiff is "+absDiff);
     
      /*int number = lowerbound;
      /*while (number <= upperbound) {  
         sum += number;
         ++number;                   
      }
      
      do {
         sum += number;
         ++number;                     
      } while (number <= upperbound);*/
      
      //average = (double)sum/upperbound;
      //System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
      //System.out.println("The average is "+average);
      //System.out.println("The count is "+count);
   }
}
