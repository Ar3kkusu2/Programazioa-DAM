
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
public class LaukiAskoSortu {
    public static void main(String args[]) {
        
        int n, z, a;
        Laukia[] lau;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        n = in.nextInt();
        
        lau = new Laukia[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("\n"+i+". LAUKIAREN DATUAK:");
            
            System.out.print("\n\t Zabalera: ");
            z = in.nextInt();
            System.out.print("\n\t Altuera: ");
            a = in.nextInt();
            
            lau[i] = new Laukia(z,a);
            
            
        }
        
        System.out.println("\n\n Laukia    Zabalera    Altuera    Azalera    Perimetroa    Mota");
        System.out.println("===============================================================================");
               
        for (int c = 0; c < lau.length; c++){
            System.out.println("   "+c+"          "+lau[c].getZabalera()+"           "+lau[c].getAltuera()+"         "+lau[c].getAzalera()+"           "+lau[c].getPerimetroa()+"        "+lau[c].getMota());
        }
    }
}
