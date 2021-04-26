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
public class Masajista extends IntegranteSeleccion{
    
    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }    

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{id = "+super.id+", nombre = "+super.nombre+", apellidos = "+super.apellidos+", edad = "+super.edad+", aniosExperiencia =" + aniosExperiencia + '}';
    }
    
    public String darMasaje(){
        return id+"- "+nombre+" "+apellidos+" esta dando un masaje";
    }
    
    
    
}
