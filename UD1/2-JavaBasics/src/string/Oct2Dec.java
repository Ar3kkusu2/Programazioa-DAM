/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

public class Oct2Dec {
    
    
    public static void main(String[] args) {
     
      String s;   
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Octal string: ");
      s = in.next();

      int num = Integer.parseInt(s, 8);		
      System.out.println("Decimal: "+num);
   }
}
