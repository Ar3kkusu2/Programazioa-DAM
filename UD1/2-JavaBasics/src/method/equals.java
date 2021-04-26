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
public class equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n1;
        int n2;
        int[] array1;
        int[] array2;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array 1 Length: ");
        n1 = in.nextInt();
        
        array1 = new int[n1];
        
        for (int i = 0; i < array1.length; ++i) {
            System.out.print("Enter a Number: ");
            array1[i] = in.nextInt(); 
        }
        
        System.out.print("Enter Array 2 Length: ");
        n2 = in.nextInt();
        
        array2 = new int[n2];
        
        for (int i = 0; i < array2.length; ++i) {
            System.out.print("Enter a Number: ");
            array2[i] = in.nextInt(); 
        }
        
        equals(array1,array2);
    }
    
     public static void equals(int[] array1, int[] array2) {
         
         boolean e = true;
         
         if(array1.length == array2.length) {
             for ( int i = 0; i < array1.length; i++) {
                 if(array1[i]!=array2[i]){
                     e = false;
                 }
             }
         }
         
         if(e) {
            System.out.print("Equals");
        }else {
            System.out.print("Different");
        }
     }
}
