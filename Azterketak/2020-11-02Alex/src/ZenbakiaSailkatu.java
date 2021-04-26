
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
public class ZenbakiaSailkatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n = 0;
        
        Scanner in = new Scanner(System.in);
        
        while(n <= 0){
            System.out.print("Sartu zenbaki oso positibo bat: ");
            n = in.nextInt();
            if (n <= 0){
                System.out.println("Zenbaki ezegokia.");
            }
        }
        
        if(n > 100){
            if (n % 2 == 0) {
                System.out.print("Sartu duzun zenbaki handia bikoitia da.");
            }else {
                System.out.print("Sartu duzun zenbaki handia bakoitia da.");
            }
        }else if (n % 2 == 0) {
                System.out.print("Sartu duzun zenbaki txikia bikoitia da.");
            }else {
                System.out.print("Sartu duzun zenbaki txikia bakoitia da.");
            }
    }
}
