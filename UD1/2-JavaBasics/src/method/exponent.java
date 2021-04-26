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
 * Enter the base: 3
   Enter the exponent: 4
   3 raises to the power of 4 is: 81
 */
public class exponent {
   public static void main(String[] args) {
      
      int exp;    
      int base;   
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the base: ");
      base = in.nextInt();
      System.out.print("Enter the exponent: ");
      exp = in.nextInt();
      
      System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
   }

   
   public static int exponent(int base, int exp) {
      int product = 1;  
      
      for (int i = 0; i<exp; i++) {
         product *= base;
      }

      return product;
   }
}
