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
public class contains {

   
    public static void main(String args[]) {
        int n;
        int[] number; 
        int key;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        n = in.nextInt();
        
        number = new int[n];
        
        for (int i = 0; i < number.length; ++i) {
            System.out.print("Enter a Number: ");
            number[i] = in.nextInt(); 
        }
        
        System.out.print("Enter number to Search: ");
        key = in.nextInt();
        
        System.out.println();
        
        if(contains(number,key)){            
            System.out.print(key+" is on the Array");
        }else {
            System.out.print(key+" is missing");
        };
    }
    
    public static boolean contains(int[] number, int key) {
        
        boolean c = false;
       
        for (int i = 0; i < number.length; ++i) {
            if(key == number[i]){
                c = true;
            }
        }        
             
        return c;
   }
}

