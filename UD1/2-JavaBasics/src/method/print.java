/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;

/**
 *
 * @author moreno.manuel
 */
public class print {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n;
        int[] number; 
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        n = in.nextInt();
        
        number = new int[n];
        
        for (int i = 0; i < number.length; ++i) {
            System.out.print("Enter a Number: ");
            number[i] = in.nextInt(); 
        }
        
        print(number);
    }
        
    
    public static void print(int[] number) {
        
        System.out.print("[");
        for (int i = 0; i < number.length-1; ++i) {
            System.out.print(number[i]+", ");
        }        
        System.out.println(number[number.length-1]+"]");
   }
}
