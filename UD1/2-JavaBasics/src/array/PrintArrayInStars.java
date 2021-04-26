/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author moreno.manuel
 */
public class PrintArrayInStars {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n;
        int[] num; 
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number of Items: ");
        n = in.nextInt();
        
        num = new int[n];
        
        if (num.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < num.length; ++i) {
                num[i] = in.nextInt();
            }
        }
        
        for (int i = 0; i < num.length; i++) {  // row
            System.out.print(i + ": ");
         
            for (int iSt = 1; iSt <= num[i]; iSt++) {  // column
                System.out.print("*");
            }
        System.out.println("("+num[i]+")");
        }
    }
}
