/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Futbolista;
import model.IntegranteSeleccion;

/**
 *
 * @author moreno.manuel
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        IntegranteSeleccion a1 = new IntegranteSeleccion(1,"Gaizka","Aretxabaleta",30);
        System.out.println(a1.toString());
        
        Futbolista f1 = new Futbolista(2, "Delantero", 2, "Gorka", "Zubiri", 32);
        System.out.println(f1.toString());
        System.out.println(f1.concentrarse());
    }

    
}
