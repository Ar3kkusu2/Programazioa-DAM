/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author imadariaga
 */
public class Izena {
    int id;
    String izena;

    public Izena(int id, String izena) {
        this.id = id;
        this.izena = izena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    @Override
    public String toString() {
        return "Izena{" + "id=" + id + ", izena=" + izena + '}';
    }
    
}
