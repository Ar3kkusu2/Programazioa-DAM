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
public class CheckHexStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String s;    
        int sLen;     
        char c;      
        boolean hex;  
      
        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a Hexadecimal: ");
        s = in.nextLine();
        sLen = s.length();
        hex = true;
        
        //System.out.println(s);
        //System.out.println(sLen);
        
        for (int i = 0; i < sLen ; i++) {
            
            c = s.charAt(i);
            
            //System.out.println(c);
            
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))) {
                hex = false;
                break;                      
            }
        }
        
        if (hex) {
            System.out.println("Es Valido");
        }else {
            System.out.println("Esto no vale chaval");
        }
    }
  }

