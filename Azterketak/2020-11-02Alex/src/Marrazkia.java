/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class Marrazkia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        marraztu(5,5,'1',true,true);
        marraztu(6,3,'2',true,true);
        marraztu(3,5,'3',true,true);
        marraztu(4,6,'4',true,true);
        marraztu(7,3,'5',false,true);
        marraztu(8,3,'6',true,false);
        marraztu(3,5,'7',false,false);
        marraztu(6,3,'8',true,false);
        marraztu(3,4,'9',false,false);
    }
    
    public static void marraztu(int alde1, int alde2, char pintzela, boolean tente, boolean betea){
        
        if(tente) {
            if (alde2 > alde1){
                int temp = alde1;
                alde1 = alde2;
                alde2 = temp;  
            }            
        }else if (alde2 < alde1) {
                int temp = alde1;
                alde1 = alde2;
                alde2 = temp; 
        }
        
        for (int row = 1; row <= alde1; row++) {  
            for (int col = 1; col <= alde2; col++) {  
                if (row == 1 || row == alde1 || col == 1 || col == alde2) {         
                    System.out.print(pintzela+" ");                                     
                } else if (!betea){                                                        
                    System.out.print("  ");                                    
                } else {
                    System.out.print(pintzela+" ");
                }                                                              
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
    }
}
