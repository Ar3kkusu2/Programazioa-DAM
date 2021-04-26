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
public class search {

    /**
     * @param args the command line arguments
     */
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
        
        contains(number,key);
        
    }
    
    public static void contains(int[] number, int key) {
        
        boolean c = false;
        int n = 0;
       
        for (int i = 0; i < number.length; ++i) {
            if(key == number[i]){
                c = true;
                n = i;
            }
        }        
             
        if(c) {
            System.out.print(key+" is on the array at position "+n);
        }else {
            System.out.print(key+" is missing");
        }
   }
}
