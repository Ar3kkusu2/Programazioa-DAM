/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class Laukia {
   private int zabalera;
   private int altuera;

  
   public Laukia() {                   
      zabalera = 5;
      altuera = 5;
   }
   
   public Laukia(int zab, int alt) {           
      zabalera = zab;
      altuera = alt;
   }
   
   public int getZabalera() {  
      return zabalera;
   }
   
   public int getAltuera() {  
      return altuera;
   }
   
   public int getPerimetroa() {
      return (altuera+zabalera)*2;
   }
   
   public int getAzalera() {
      return altuera*zabalera;
   }
   
   public String getMota() {
      if (altuera == zabalera) {
          return "karratua";
      }else if (altuera > zabalera){
          return "bertikala";
      }else {
          return "horizontala";
      }
   }
   
   public String toString() {
      return "Laukia["+zabalera+"x"+altuera+"]";
   }
   
   public void marraztuBeteta() {
        for (int row = 1; row <= zabalera; row++) {  
            for (int col = 1; col <= altuera; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   }
   
   public void marraztuHutzik() {
        for (int row = 1; row <= zabalera; row++) {  
            for (int col = 1; col <= altuera; col++) {
                if (row == 1 || row == zabalera || col == 1 || col == altuera) {         
                    System.out.print("* ");                                     
                } else {                                                        
                    System.out.print("  ");                                    
                } 
            }
            System.out.println();
        }
   }
   
   public boolean isBiggerThan(Laukia l) {
       if (getAzalera() > l.getAzalera()){
           return true;
       }else {
           return false;
       }
   }

    public static Laukia getTheBiggest(Laukia[] lk) {
        Laukia l = new Laukia(0, 0);
        for (Laukia lk1 : lk) {
            if (lk1 != null && (lk1.getAzalera() > l.getAzalera())) {
                l = lk1;
            }
        }
        return l;
    }
    
    public static Laukia[] ordenatu(Laukia[] lk) {

        for (int i = 0; i < lk.length - 1; i++) {
            for (int j = i + 1; j < lk.length; j++) {
                if (lk[i].getAzalera() > lk[j].getAzalera()) {
                    Laukia temp = lk[i];
                    lk[i] = lk[j];
                    lk[j] = temp;
                }
            }
        }
        return lk;
    }
}
