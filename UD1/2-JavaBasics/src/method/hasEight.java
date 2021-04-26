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
public class hasEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        final int SENTINEL = -1;  
        int number;
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {  // Repeat until input is -1
            
             if(hasEight(number)){
                 sum += number;
             }
                       
             System.out.print("Enter a positive integer (or -1 to end): ");
             number = in.nextInt();
        }
        
        System.out.print(sum);
           
    }
    
    public static boolean hasEight(int number) {
        
        boolean magic = false;
        while (number > 0) {
            
            int d = number%10;  
            
            if (d == 8) {
            magic = true;
            break;  
            }
            
            number /= 10;   
        }
        return magic;            
    }
}


