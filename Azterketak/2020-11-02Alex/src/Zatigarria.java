
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
public class Zatigarria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n1, n2;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu zatikizuna (zenbaki handia): ");
        n1 = in.nextInt();
        System.out.print("Sartu zatikizuna (zenbaki txikia): ");
        n2 = in.nextInt();
        
        if(zatigarriaDa(n1, n2)){
            System.out.print(n1+" zenbakia zatigarria da "+n2+" zenbakiarekin.");
        }else {
            System.out.print(n1+" zenbakia ez da zatigarria da "+n2+" zenbakiarekin.");
        }
    }
    
    public static boolean zatigarriaDa(int zatikizuna, int zatitzailea){
        
        boolean z = false;
        
        if ( zatikizuna % zatitzailea == 0) {
            z = true;
        }
        
        return z;
    }
}
