
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
public class SumOfDigitsInt {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        int inNumber;
        int inDigit;
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        inNumber = in.nextInt();
        
        while(inNumber > 0) {
            inDigit = inNumber % 10;
            sum += inDigit;
            inNumber /= 10;
        }
        System.out.println("The sum is: "+sum);
    }
}
