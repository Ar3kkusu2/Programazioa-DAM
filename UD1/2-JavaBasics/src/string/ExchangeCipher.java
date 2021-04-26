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
public class ExchangeCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String s;        
        int sLen;        

        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a String: ");
        s = in.next().toUpperCase();   
        sLen = s.length();
        
        for (int i = 0; i <= sLen - 1; ++i) { 
            
            char p = s.charAt(i);
            char c = (char)(s.charAt(i)+26); //cipherTextChar = 'A' + 'Z' - plainTextChar
            System.out.print(c-p);
            
        }
    }
}
