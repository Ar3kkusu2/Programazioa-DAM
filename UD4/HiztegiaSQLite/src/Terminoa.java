/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author moreno.manuel
 */
public class Terminoa implements Serializable {

    private String HitzaEus;
    private String HitzaEs;

    public Terminoa(String HitzaEus, String HitzaEs) {
        this.HitzaEus = HitzaEus;
        this.HitzaEs = HitzaEs;
    }

    public String getHitzaEus() {
        return HitzaEus;
    }

    public void setHitzaEus(String HitzaEus) {
        this.HitzaEus = HitzaEus;
    }

    public String getHitzaEs() {
        return HitzaEs;
    }

    public void setHitzaEs(String HitzaEs) {
        this.HitzaEs = HitzaEs;
    }

    

    
    
    
}
