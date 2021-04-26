/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class HiruLaukiSortu {
    public static void main(String args[]) {
        
        Laukia lau1 = new Laukia(5,1);
        Laukia lau2 = new Laukia(6,2);
        Laukia lau3 = new Laukia(2,2);
        
        System.out.println("Hiru lauki sortu dituzu:");
        System.out.println(lau1.toString());
        System.out.println(lau2.toString());
        System.out.println(lau3.toString());
    }
}
