/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;
import static method.print.print;

/**
 *
 * @author moreno.manuel
 */
public class toString {

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
        
        toString(number);
    }
    
    public static void toString(int[] number) {
        
        String s = "[";
       
        for (int i = 0; i < number.length-1; ++i) {
            s = s + number[i]+", ";
        }        
        s = s +number[number.length-1]+"]";
        
        System.out.print(s);
   }
}
