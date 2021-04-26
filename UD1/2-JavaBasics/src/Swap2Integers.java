
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
public class Swap2Integers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       int number1, number2;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter first integer: ");
       number1 = in.nextInt(); 
       System.out.print("Enter second integer: ");
       number2 = in.nextInt();
       
       int temp = number1;
       number1 = number2;
       number2 = temp;
       
       System.out.println("Before Swap number1: "+number1+" and number2: "+number2);
       
    }
}
