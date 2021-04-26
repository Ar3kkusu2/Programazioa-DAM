/*
 * Sum the odd numbers and the even numbers from a lowerbound to an upperbound
 */
public class PrintLeapYears {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      int lowerbound = 999, upperbound = 2010;// lowerbound and upperbound   // For accumulating even numbers, init to 0
      int count = 0;
      int year = lowerbound;
      while ( year <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { 
           ++count;
           System.out.println(year);
        }
       ++year;
      }
      // Print the result
      System.out.println("The leap years between " + lowerbound + " and " + upperbound + " is " + count);
   }
}
