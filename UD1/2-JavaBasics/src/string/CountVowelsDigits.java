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
public class CountVowelsDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String inStr;        
        int inStrLen;
        int cVowels = 0;
        int cDigits = 0;

        Scanner in = new Scanner(System.in);        
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();   
        inStrLen = inStr.length();
   
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
           
            char c = inStr.charAt(charIdx);
            int cInt = c;
            //System.out.println(c);
            //System.out.println(cInt);
            if (cInt >= 48 && cInt <= 57){
                cDigits++;
            }
            if (c == 'a' || c == 'e' || c == 'i'|| c == 'o'||c == 'u'){
                cVowels++;
            }
        }
               
        int cDPorcentaje = cDigits*100/inStrLen;
        int cVPorcentaje = cVowels*100/inStrLen;
        
        System.out.println("String: "+inStr);
        System.out.println("Vowels: "+cVowels+"("+cVPorcentaje+"%)");
        System.out.println("Digits: "+cDigits+"("+cDPorcentaje+"%)");
    }
}
