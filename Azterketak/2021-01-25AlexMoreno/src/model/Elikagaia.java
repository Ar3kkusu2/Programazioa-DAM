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
public class Elikagaia extends Produktua {

    public boolean ekologikoa;

    public Elikagaia(String kodea, String izena, double prezioa,boolean ekologikoa) {
        super(kodea.toCharArray(), izena, prezioa);
        this.ekologikoa = ekologikoa;
    }    
    
    @Override
    public boolean isArduratsua() {
        return ekologikoa;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
