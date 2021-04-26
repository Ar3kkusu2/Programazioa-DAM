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
public class PrintArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
        int n;
        int[] num;  
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number of Items: ");
        n = in.nextInt();
        
        num = new int[n];
        
        if (num.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < num.length; ++i) {
                num[i] = in.nextInt();
            }
        }

        System.out.print("The values are: [");
        for (int i = 0; i < num.length; ++i) {
            if (i == 0) {           
                System.out.print(num[0]);
            } else {
                System.out.print(", " + num[i]);
            }
        }
        
        System.out.println("]");
        in.close();
    }
}
