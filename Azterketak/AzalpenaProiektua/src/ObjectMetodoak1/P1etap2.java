/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectMetodoak1;

/**
 *
 * @author moreno.manuel
 */
public class P1etap2 {
    
    public static void main(String[] args) {
        
        NirePuntua p1;
        NirePuntua p2;
        
        p1 = new NirePuntua(1,1);
        p2 = p1;
        
        System.out.println("HASIERAN ->");
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
        
        p2.x = 26;
        
        System.out.println("GERO->");
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
        
        p1.x = 8;
        
        System.out.println("GERO->");
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
    }
}
