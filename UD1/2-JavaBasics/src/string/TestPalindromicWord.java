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
public class TestPalindromicWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String s;
        int sLen;
        
        
        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a String: ");
        s = in.nextLine().toLowerCase();   
              
        s=s.replace(" ", "");
        s=s.replace(",", "");
        s=s.replace(".", "");
        s=s.replace("!", "");
        s=s.replace("?", "");
        
        sLen = s.length();
        System.out.print(s+"\n");
        
        int fIdx = 0, bIdx = sLen - 1;
        boolean kapikua = true;
        
        while (fIdx < bIdx) {
           
           char c1 = s.charAt(fIdx);
           char c2 = s.charAt(bIdx);
           if (c1 != c2) {
               kapikua = false;
           }
        ++fIdx;
        --bIdx;
        }
        
        if(kapikua){
            System.out.print("Palindromo");
        }else{
            System.out.print("No no no");
        }            
    }
}
