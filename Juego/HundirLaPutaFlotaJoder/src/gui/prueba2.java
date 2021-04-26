/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author moreno.manuel
 */
public class prueba2 {

    private static prueba ventana1 = new prueba();
    private static prueba ventana2 = new prueba();
    private static prueba ventana3 = new prueba();
    
    public static void main(String args[]) {
        
        ventana1.setTitle("TankeJuego");
        ventana1.setBounds(470,250,400,400);
        ventana2.setTitle("Jugador 2");
        ventana2.setBounds(700,60,350,150);
        ventana3.setTitle("Jugador 1");
        ventana3.setBounds(270,60,350,150);
        
    }
}
