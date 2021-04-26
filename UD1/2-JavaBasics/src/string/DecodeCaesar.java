/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author moreno.manuel
 */
public class DecodeCaesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String s;        
        int sLen;        

        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a String: ");
        s = in.next().toLowerCase();   
        sLen = s.length();
   
        for (int i = 0; i <= sLen - 1; ++i) { 
            
            char c = s.charAt(i);
            
            if (c == 97) {
                System.out.print((char)120);
            }else if (c == 98){
                System.out.print((char)121);
            }else if (c == 99){
                System.out.print((char)122);
            }else {
                System.out.print((char)(c-3));
            }          
        }
    }
}
