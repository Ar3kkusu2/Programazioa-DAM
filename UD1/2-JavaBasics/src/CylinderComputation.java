
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
public class CylinderComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        double radius, height, baseArea, surfaceArea, volume;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        System.out.print("Enter the height: ");
        height = in.nextDouble();
        
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("Radius is: %.2f%n", radius);
        System.out.printf("Height is: %.2f%n", height);
        System.out.printf("baseArea is: %.2f%n", baseArea);
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
        
    }
}
