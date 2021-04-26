/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class zatikia {
    
    private int zenbakitzailea;
    private int izendatzailea;
    
    public zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }
    
    public int getZenbakitzailea() {
        return zenbakitzailea;
    }
    
    public int getIzendatzailea(){
        return izendatzailea;
    }
    
    public void setZenbakitzailea(int zenba) {
        zenbakitzailea = zenba;
    }
    
    public void setIzendatzailea(int izenda) {        
        izendatzailea = izenda;
    }
    
    public String toString() {
        return getClass().getName() + "[" + zenbakitzailea + "/" + izendatzailea + "]";
    }
     
     
    
    public static zatikia biderkatu(zatikia zat1, zatikia zat2) {
        int z, i;
        int z1 = zat1.getZenbakitzailea();
        int z2 = zat2.getZenbakitzailea();
        int i1 = zat1.getIzendatzailea();
        int i2 = zat2.getIzendatzailea();
        
        z = z1*z2;
        i = i1*i2;
        
        zatikia zat3 = new zatikia(z,i);
        
        return zat3;
    }
    
    public static zatikia batu(zatikia zat1,zatikia zat2) {
        int z,i,hcf = 0,lcm;
        int z1 = zat1.getZenbakitzailea();
        int z2 = zat2.getZenbakitzailea();
        int i1 = zat1.getIzendatzailea();
        int i2 = zat2.getIzendatzailea();
        
        for(int c = 1; c <= i1 && c <= i2; c++) {
   		
		if( i1%c == 0 && i2%c == 0 ) {
			hcf = c;
		}   	
	}
        
        lcm = (i1 * i2) / hcf;	
	i = lcm;	
	z = z1*(lcm/i1)+z2*(lcm/i2);
        
        zatikia zat3 = new zatikia(z,i);
        
        return zat3;
    }
    
    public static zatikia kendu(zatikia zat1,zatikia zat2){
        int z,i,hcf = 0,lcm;
        int z1 = zat1.getZenbakitzailea();
        int z2 = zat2.getZenbakitzailea();
        int i1 = zat1.getIzendatzailea();
        int i2 = zat2.getIzendatzailea();
        
        for(int c = 1; c <= i1 && c <= i2; c++) {
   		
		if( i1%c == 0 && i2%c == 0 ) {
			hcf = c;
		}   	
	}
        
        lcm = (i1 * i2) / hcf;	
	i = lcm;	
	z = z1*(lcm/i1)-z2*(lcm/i2);
        
        zatikia zat3 = new zatikia(z,i);
        
        return zat3;
        
    }
    
    public static zatikia zati(zatikia zat1,zatikia zat2){
        
        int z,i;
        int z1 = zat1.getZenbakitzailea();
        int z2 = zat2.getZenbakitzailea();
        int i1 = zat1.getIzendatzailea();
        int i2 = zat2.getIzendatzailea();
        
        z = z1*i2;
        i = z2*i1;
        
        zatikia zat3 = new zatikia(z,i);
        
        return zat3;
    }
    
    public void simplifikatu(){
        
        int zs = zenbakitzailea, is = izendatzailea;
        if(zenbakitzailea<=0){
            zenbakitzailea = 0;
            izendatzailea = 0;
        }else {
            
           for(int c = 2; c <= zs && c <= is; c++) {
   		
                if( zenbakitzailea%c == 0 && izendatzailea%c == 0 ) {
		zenbakitzailea/=c;
		izendatzailea/=c;
		c = 1;
                }   	
            } 
        }
        
    }
}
