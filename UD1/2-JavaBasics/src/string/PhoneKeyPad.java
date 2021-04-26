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
public class PhoneKeyPad {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        char x; 
        char PhoneArray[] = new char[10];
        
        for (int i = 0; i < 9; i++) {
            Scanner in = new Scanner(System.in);        
            System.out.print("Enter a number(letter): ");
            x = in.next().charAt(0);
            
                if (x == 97||x == 98||x == 99) {
                    PhoneArray[i] = 2;
                }else if(x == 100||x == 101||x == 102){
                    PhoneArray[i] = 3;
                }else if(x == 103||x == 104||x == 105){
                    PhoneArray[i] = 4;
                }else if(x == 106||x == 107||x == 108){
                    PhoneArray[i] = 5;
                }else if(x == 109||x == 110||x == 111){
                    PhoneArray[i] = 6;
                }else if(x == 112||x == 113||x == 114||x == 115){
                    PhoneArray[i] = 7;
                }else if(x == 116||x == 117||x == 118){
                    PhoneArray[i] = 8;
                }else if(x == 119||x == 120||x == 121||x == 122){
                    PhoneArray[i] = 9;
                }else if(x == 49){                
                    PhoneArray[i] = 1;
                }else{
                    PhoneArray[i] = 0;    
                        }
        }
        System.out.print(PhoneArray);
    }
 }

