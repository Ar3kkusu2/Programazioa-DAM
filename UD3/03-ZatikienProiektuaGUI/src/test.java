
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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int z1,z2,i1,i2;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Z1: ");
        z1 = in.nextInt();
        System.out.print("I1: ");
        i1 = in.nextInt();
        System.out.print("Z2: ");
        z2 = in.nextInt();
        System.out.print("I2: ");
        i2 = in.nextInt();
        
        zatikia zat1 = new zatikia(z1,i1);
        zatikia zat2 = new zatikia(z2,i2);
        
        System.out.println(zat1.toString());
        System.out.println(zat2.toString());
        
        zatikia zat3 = new zatikia(1,1);
        zat3 = zatikia.kendu(zat1,zat2);
        
        System.out.println(zat3.toString());
        
        zat3.simplifikatu();
        
        System.out.println(zat3.toString());        
    }
}
