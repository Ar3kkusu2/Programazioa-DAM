
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
public class CircleComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        double radius, diameter, circumference, area;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Radius is: %.2f%n %.2f", radius, diameter);
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Diameter is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
        
    }
}
