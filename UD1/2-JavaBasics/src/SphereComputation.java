
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
public class SphereComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        double radius, surfaceArea, volume;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (4 /3) * Math.PI * radius * radius * radius; 

        System.out.printf("Radius is: %.2f%n", radius);
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
        
    }
}
