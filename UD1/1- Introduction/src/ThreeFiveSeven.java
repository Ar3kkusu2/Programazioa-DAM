/*
 * Sum the odd numbers and the even numbers from a lowerbound to an upperbound
 */
public class ThreeFiveSeven {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      int lowerbound = 1, upperbound = 1000;  // lowerbound and upperbound
      int sum = 0;    // For accumulating even numbers, init to 0
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         if ((number % 3 == 0)||(number % 5 == 0)||(number % 7 == 0)) { 
            if (!((number % 15 == 0)||(number % 21 == 0)||(number % 35 == 0)||(number % 105 == 0)))// Even
            sum += number;   // Same as sumEven = sumEven + number
         }
         ++number;  // Next number
      } 
      // Print the result
      System.out.println("The sum numbers from " + lowerbound + " to " + upperbound + " is " + sum);
   }
}
