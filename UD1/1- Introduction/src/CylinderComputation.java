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
public class CylinderComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {

      double radius,height, surfaceArea, baseArea, volume ;
      radius = 3;
      height = 2;
      
      final double pi = 3.14159265;
      surfaceArea = radius * 2 * pi * height;
      baseArea = radius * radius * pi;
      volume = baseArea * height;
      
     
      // Print results
      System.out.print("The Surface Area is ");  // Print description
      System.out.println(surfaceArea);          // Print the value stored in the variable
      System.out.print("The Base Area is ");
      System.out.println(baseArea);
      System.out.print("The Volume is ");
      System.out.println(volume);
   }
}
