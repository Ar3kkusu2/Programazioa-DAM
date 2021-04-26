
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
public class LaukiBatSortu {
    public static void main(String args[]) {
        
        int z, a;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Sartu laukiaren zabalera: ");
        z = in.nextInt();
        System.out.print("Sartu laukiaren altuera: ");
        a = in.nextInt();
        
        Laukia lau1 = new Laukia(z,a);
        
        System.out.println("Lauki "+lau1.getMota()+" sortu duzu => "+lau1.toString());
        lau1.marraztuBeteta();
        System.out.println("Hona marrazkia beteta: \n");
        lau1.marraztuHutzik();
        System.out.println("Hona marrazkia beteta: \n");
    }
}
