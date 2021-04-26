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
public class CaesarCode {
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
            
            if (c == 120) {
                System.out.print((char)97);
            }else if (c == 121){
                System.out.print((char)98);
            }else if (c == 122){
                System.out.print((char)99);
            }else {
                System.out.print((char)(c+3));
            }          
        }
    }
}
