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
public class EtxetresnaElektrikoa extends Produktua {
    
    public String efizientzia;

    public EtxetresnaElektrikoa(String kodea, String izena, double prezioa,String efizientzia) {
        
        super(kodea.toCharArray(), izena, prezioa);
        this.efizientzia = efizientzia;
    }   
    
    @Override
    public boolean isArduratsua() {
        if(efizientzia == "A+++"){
            return true;
        }else {
            return false;
        }//To change body of generated methods, choose Tools | Templates.
    }  
    
}
