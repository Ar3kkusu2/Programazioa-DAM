/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class Ordutegia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String[][] Horario = {
            {"Programacion","Programacion","Sistemas","Lenguaje Marcas","Lenguaje Marcas","Ingles"},
            {"Sistemas","Sistemas","Programacion","Programacion","FOL","FOL"},
            {"Programacion","Programacion","Base Datos","Base Datos","Lenguaje Marcas","Lenguaje Marcas"},
            {"Sistemas","Sistemas","Base Datos","Base Datos","FOL","Entornos"},
            {"Programacion","Programacion","Base Datos","Base Datos","Entornos","Entornos"}
        };
        
        for (int d = 0;d < 5; d++) {
            for (int h = 0; h < 6; h++) {
                System.out.println(Horario[d][h]);
            }
            System.out.println();
        }
    }
}
