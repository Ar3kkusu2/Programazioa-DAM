package string;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String inStr;        
        int inStrLen;        

        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a String: ");
        inStr = in.next();   
        inStrLen = inStr.length();
   
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
