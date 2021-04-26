/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author moreno.manuel
 */
public class Futbolista extends IntegranteSeleccion{
    
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{id = "+super.id+", nombre = "+super.nombre+", apellidos = "+super.apellidos+", edad = "+super.edad+", dorsal = "+dorsal+", demarcacion = "+demarcacion+'}';
    }     
    
    public String entrenar(){
        return id+"- "+nombre+" "+apellidos+" esta entrenando";
    }
    
    public String partido(){
        return id+"- "+nombre+" "+apellidos+" esta jugando";
    }
}
