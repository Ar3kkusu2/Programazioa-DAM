/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Author;
import model.Book;

/**
 *
 * @author moreno.manuel
 */
public class Komikia extends Book{
    
    private boolean kolorea;

    public Komikia(boolean kolorea, String name, Author author, double price, int pages) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }  
    
    public boolean isKolorea(){
        return kolorea;
    }
    
    @Override
    public String toString() {
        return "[Komikia] "+super.toString();  
    }
    
    public String getNolakoa(){
        if (kolorea){
            return "Kolorea";
        }else {
            return "Zuri-Beltza";
        }
    }
    
    
}
