/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectMetodoak3;

/**
 *
 * @author moreno.manuel
 */
public class P1Klonatzen {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        NirePuntua p1;
        NirePuntua p2;
        
        p1 = new NirePuntua(1,1);
        p2 = (NirePuntua)p1.clone();
        
        System.out.println("HASIERAN ->");
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
        
        p2.x = 3;
        
        System.out.println("GERO->");
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
    }
}
