/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author moreno.manuel
 */
public abstract class Produktua {
    
    protected char[] kodea;
    protected String izena;
    protected double prezioa;

    public Produktua(char[] kodea, String izena, double prezioa) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return kodea;
    }

    public String getIzena() {
        return izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }
    
    public String getStrKodea() {
        String strKodea = "";
        for (char c : kodea) {
            strKodea = strKodea + c;
        }
        return strKodea;
    }
    
    public abstract boolean isArduratsua();
    
    public static Produktua getProduktua(ArrayList<Produktua> produktuenLista,String kodea){
        
        Produktua p = null;
        for (int i = 0; i < produktuenLista.size(); i++)
            if (produktuenLista.get(i).getStrKodea().equals(kodea)){
                p = produktuenLista.get(i);
            }
        
        return p;       
    }
}
