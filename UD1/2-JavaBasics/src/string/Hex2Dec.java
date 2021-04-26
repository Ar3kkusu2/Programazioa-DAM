/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

public class Hex2Dec {
    
    
    public static void main(String[] args) {
     
      String hS;   
      int hSlen;   
      int d = 0;  
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string: ");
      hS = in.next();
      hSlen = hS.length();

      for (int i = 0; i < hSlen; i++) {
          
         char c = hS.charAt(i);
         
         int expFactor = (int)Math.pow(16, hSlen - 1 - i);

         if (c == '0') {
            
         } else if (c >= '1' && c <= '9') {
            d += (c - '0') * expFactor;   
         } else if (c >= 'a' && c <= 'f') {
            d += (c - 'a' + 10) * expFactor;  
         } else if (c >= 'A' && c <= 'F') {
            d += (c - 'A' + 10) * expFactor;  
         } else {
            System.out.println("error: invalid hex string \"" + hS + "\"");
            return;
         }
      }
      System.out.println("The equivalent decimal for \"" + hS + "\" is " + d);
      in.close();
   }
}
