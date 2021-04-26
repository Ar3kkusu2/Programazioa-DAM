/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectMetodoak2;

import ObjectMetodoak1.*;

/**
 *
 * @author moreno.manuel
 */
public class p1p2p3 {
    
    public static void main(String[] args) {
        
        NirePuntua p1;
        NirePuntua p2;
        NirePuntua p3;
        
        p1 = new NirePuntua(1,1);
        p2 = p1;
        p3 = new NirePuntua(1,1);
        
        System.out.println("HASIERAN ->");
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
        System.out.println("P3: "+p3);
        System.out.println("P1 == P2: "+(p1 == p2));
        System.out.println("P1 == P3: "+(p1 == p3));
        System.out.println("P1 equals P2: "+(p1.equals(p2)));
        System.out.println("P1 equals P3: "+(p1.equals(p3)));
        
        
    }
}
