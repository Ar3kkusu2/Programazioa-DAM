/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;

/**
 *
 * @author moreno.manuel
 */
public class isOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int n;
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      n = in.nextInt();
            
      if (isOdd(n)){
          System.out.println( "Odd number" );
      }else {
          System.out.println( "Even number" );
      }
   }

   
   public static boolean isOdd(int n) {      
      
      if ( n % 2 == 0 ) {
         return false;   
      }else {
         return true;
      }      
   }
}
