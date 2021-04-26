
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
public class Izenak {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String[] zerrenda = {"Jon","Jone","June","Julian","Julen"};
        String izena;
        int p = -1;
               
        Scanner in = new Scanner(System.in);
        
        System.out.print("Noren bila zabiltza? ");
        izena = in.next();
        
        for (int i = 0; i < zerrenda.length - 1; i++) {
            if ( izena.equals(zerrenda[i])) {
                p = i;
            }
        }
        
        if(p!=-1){
            System.out.print(izena+" zerrendako "+(p+1)+".a da.");
        }else {
            System.out.print(izena+" ez dago zerrendan.");
        } 
        
    }
}
