
import static java.lang.Math.random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class Menu {
    public static void main(String args[]) {
        
        int e = 0, s = 0;
        Laukia[] lau = new Laukia[10];
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("LAUKIA\n ===========================================");
        
        System.out.println("1.- Lauki berria sortu");
        System.out.println("2.- Laukien taula ikusi");
        System.out.println("3.- Lauki bat marraztu");       
        System.out.println("4.- Lauki handiena bilatu");                
        System.out.println("5.- Irten");
        System.out.println("6.- Lauki Guztiak sortu");
        
        while(e != 5) {              
            
            System.out.print("\nAukeratu zenbaki bat: ");
            e = in.nextInt();
            
            switch(e) {
                case 1:
                    if(s==10){
                       System.out.println("\nEzin dituzu lauki gehiago sortu. ");
                       break;                        
                    }else {
                       sortu(lau,s);
                       s++;
                       break;
                    }             
                    
                case 2:
                    inprimatu(lau,s);
                    break;
                case 3:
                    marraztu(lau);
                    break;
                case 4:
                    handiena(lau);
                    break;
                case 6:
                    arrayaBete();
                default:
                    break;
            }
        }
        
        System.out.println("\n\nEskerrik asko programa hau erabiltzeagatik.");
    }
    
    public static void sortu(Laukia[] lau, int s){
        
        int z, a;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("LAUKI BAT SORTZEN.... \n");
        System.out.print("Sartu Zabalera: ");
        z = in.nextInt();
        System.out.print("Sartu Altuera: ");
        a = in.nextInt();
        
        lau[s]= new Laukia(z,a);
            
    }
    
    public static void inprimatu(Laukia[] lau, int sortu){
       
        System.out.println("\n\n Laukia   Zabalera   Altuera   Azalera  Perimetroa    Mota");
        System.out.println("================================================================");
               
        for (int c = 0; c < sortu; c++){
            System.out.printf("%5d%10d%10d%10d%10d%18s\n",c+1,lau[c].getZabalera(),lau[c].getAltuera(),lau[c].getAzalera(),lau[c].getPerimetroa(),lau[c].getMota());
        }
    }
    
    public static void marraztu(Laukia[] lau){
        
        int n;
        char m = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Zenbatgarren laukia nahi duzu marraztu? ");
        n = in.nextInt();
        
        while (m != 'B' && m != 'b' && m != 'H' && m != 'h' ) {
            System.out.print("Beteta ala hutsik (B/H)? ");
            m = in.next().charAt(0);
        }
        
        if(m == 'B' || m == 'b'){
            lau[n-1].marraztuBeteta();
        }else {
            lau[n-1].marraztuHutzik();
        }
        
    }
    
    public static void handiena(Laukia[] lau){
       
        System.out.println("Lauki handiena : " + Laukia.getTheBiggest(lau).toString());
    }
    
    public static void arrayaBete() {
        
        Laukia[] lau2 = new Laukia[10];
        int s = 0;
        
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            lau2[i]= new Laukia((int)((Math.random() * (15 - 1)) + 1) + 1,(int) ((Math.random() * (15 - 1)) + 1));
            s++;
        }
        
        Laukia.ordenatu(lau2);
        
        System.out.println("\n\n Laukia   Zabalera   Altuera   Azalera  Perimetroa    Mota");
        System.out.println("================================================================");
               
        for (int c = 0; c < s; c++){
            System.out.printf("%5d%10d%10d%10d%10d%18s\n",c+1,lau2[c].getZabalera(),lau2[c].getAltuera(),lau2[c].getAzalera(),lau2[c].getPerimetroa(),lau2[c].getMota());
        }
                
    }    
    
}
