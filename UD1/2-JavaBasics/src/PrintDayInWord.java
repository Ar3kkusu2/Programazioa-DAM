/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Trying nested-if and switch-case statements.
 */
public class PrintDayInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int dayNumber = 2;  // Set the value of "number" here!
 
      // Using nested-if
      if (dayNumber == 0) {   // Use == for comparison
         System.out.println( "Sunday" );
      } else if ( dayNumber == 1 ) {
         System.out.println( "Monday" );
      } else if ( dayNumber == 2 ) {
         System.out.println( "Tuesday" );
      } else if ( dayNumber == 3 ) {
         System.out.println( "Wednesday" );
      } else if ( dayNumber == 4 ) {
         System.out.println( "Thursday" );
      } else if ( dayNumber == 5 ) {
         System.out.println( "Fryday" );
      } else if ( dayNumber == 6 ) {
         System.out.println( "Saturday" );
      } else {
         System.out.println( "Not a valid day" );
      }
 
      // Using switch-case-default
      switch(dayNumber) {
         case 0: 
            System.out.println( "Sunday" ); break;  // Don't forget the "break" after each case!
         case 1: 
            System.out.println( "Monday" ); break;
         case 2: 
            System.out.println( "Tuesday" ); break;
         case 3: 
            System.out.println( "Wednesday" ); break;
         case 4: 
            System.out.println( "Thursday" ); break;
         case 5: 
            System.out.println( "Fryday" ); break;
         case 6: 
            System.out.println( "Saturday" ); break;
         default: System.out.println( "Not a valid day" ); 
      }
   }
}
