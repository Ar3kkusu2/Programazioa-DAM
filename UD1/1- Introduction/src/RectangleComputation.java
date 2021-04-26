/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 /*
 * Print the area and circumference of a circle, given its radius.
 */
public class RectangleComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {

      double lenght, width, area, perimeter;
      lenght = 4;
      width = 8;
      
      area = lenght * width;
      perimeter = (lenght + width)*2;
     
      // Print results
      System.out.print("The lenght is ");  // Print description
      System.out.println(lenght);          // Print the value stored in the variable
      System.out.print("The width is ");
      System.out.println(width);
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
}
