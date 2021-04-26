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
public class IntegranteSeleccion {
    
    int id;
    String nombre;
    String apellidos;
    int edad;
    
    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
      this.id = id;
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;
   }
    
   public void setIntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
      this.id = id;
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;
   }
   
   public void setId(int id) {
       this.id = id;
   }
   
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   
   public void setApellidos(String apellidos) {
       this.apellidos = apellidos;
   }
   
   public void setEdad(int edad) {
       this.edad = edad;
   }
   
   public int getId() {
       return this.id;
   }
   
   public String getNombre() {
       return this.nombre;
   }
   
   public String getApellidos() {
       return this.apellidos;
   }
   
   public int getEdad() {
       return this.edad;
   }

    @Override
    public String toString() {
        return "IntegranteSeleccion{" + "id = " + id + ", nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad + '}';
    }   
    
    public String concentrarse(){
        return id+"- "+nombre+" "+apellidos+" esta concentrandose";
    }
    
    public String viajar(){
        return id+"- "+nombre+" "+apellidos+" esta viajando";
    }
   
}
