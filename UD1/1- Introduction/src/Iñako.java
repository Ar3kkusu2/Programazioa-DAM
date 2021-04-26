/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class Iñako {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String symbol = "+";
        int i = 0;
        while(i < 5)
        {
           System.out.println(symbol);
           symbol = symbol+"+";
           i=i+1;
        }        
    }
}
