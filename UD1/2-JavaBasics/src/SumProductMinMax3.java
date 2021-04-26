
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class SumProductMinMax3 {
    public static void main (String[] args) {
      int number1, number2, number3;  
      int sum, product, min, max;    
      Scanner in = new Scanner(System.in); 
      
      System.out.print("Enter 1st integer: ");  
      number1 = in.nextInt();                     
      System.out.print("Enter 2nd integer: ");  
      number2 = in.nextInt();
      System.out.print("Enter 3rd integer: ");  
      number3 = in.nextInt();
      
      sum = number1+number2+number3;
      product = number1*number2*number3;

      min = number1;        
      if (number2 < min) {  
         min = number2;     
      }
      if (number3 < min) {  
         min = number3;
      }
      
      max = number3;        
      if (number1 > max) {  
         max = number1;     
      }
      if (number2 > max) {  
         max = number2;
      }
      
      System.out.println("The Sum: "+sum); 
      System.out.println("The product: "+product); 
      System.out.println("The Min: "+min); 
      System.out.println("The Max: "+max); 
    }
}
