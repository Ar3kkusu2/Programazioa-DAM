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
public class Entrenador extends IntegranteSeleccion{
    
    private String idFederacion;

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }    

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{id = "+super.id+", nombre = "+super.nombre+", apellidos = "+super.apellidos+", edad = "+super.edad+", idFederacion = "+idFederacion+'}';
    }      
    
    public String dirigirEntrenamiento(){
        return id+"- "+nombre+" "+apellidos+" esta dirigiendo un entrenamiento";
    }
    
    public String dirigirPartido(){
        return id+"- "+nombre+" "+apellidos+" esta dirigiendo un partido";
    }
}
