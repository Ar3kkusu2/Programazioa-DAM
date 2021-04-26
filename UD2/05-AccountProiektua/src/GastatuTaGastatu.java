/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zimo
 */
public class GastatuTaGastatu {
    
    public static void main(String[] args) {
        
        Account a1 = new Account("2096-01", "Pepe", 1000);
        a1.toString();
        int c = 0;
        
        do{
            
            a1.debit(150);
            c++;
            
        }while(a1.getBalance()>150);
        
        a1.toString();
        System.out.println("Triste nago; 150 euro atera dut "+c+" aldiz eta orain "+a1.getBalance()+" euro besterik ez zait geratzen kontuan. :-(");
        
    }
}
