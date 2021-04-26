
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
public class Lau {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        char c;
        int n;
        char aukera = 0;
        
        System.out.println("LAU PROGRAMA");
        System.out.println("============================\n\n");
        
        Scanner in = new Scanner(System.in);
        
        while(aukera != 101) {
            
            System.out.print("\nAukeratu karaktere bat: ");
            c = in.next().charAt(0);
        
            System.out.print("Zenbat aldiz inprimatu nahi duzu? ");
            n = in.nextInt();
        
            karaktereakInprimatu(c, n);
            
            System.out.print("\nJarraituko dugu(b/e)? ");
            aukera = in.next().charAt(0);
        }        
    }
    
    public static void karaktereakInprimatu(char c, int n) {
            
            for (int i = 0; i < n; i++) {
                System.out.print(c); 
            }
    }
}
