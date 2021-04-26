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
public class CheckBinStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String s;    
        int sLen;     
        char c;      
        boolean binary;  
      
        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a Binary: ");
        s = in.next();
        sLen = s.length();
        binary = true;  
        
        for (int i = 0; i < sLen ; i++) {
            
            c = s.charAt(i);
            
            if (!(c == '0' || c == '1')) {
                binary = false;
                break;                      
            }
        }
        
        if (binary) {
            System.out.println("Es Valido");
        }else {
            System.out.println("Esto no vale chaval");
        }
    }
}
