/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

import java.util.ArrayList;
import model.Masajista;
import static test.EuskalSelekzioa.selekzioOsoaSortu;

/** Programa honetan Euskal Selekzioaren datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  Programa hau selekzioko partaideen datuak kargatzen hasiko da. 
 *  Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina 
 *  oraindik hori ez dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * 
 *  Gero, horrelako menu bat agertuko zaigu:
 * 
 *  **********************************************************
 *  *    EUSKAL SELEKZIOA
 *  *  ----------------------------------
 *  *  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)
 *  *  2. Partaideen datuak ikusi taldekatuta
 *  *  3. Futbolariak alfabetikoki inprimatu
 *  *  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)
 *  *  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)
 *  *  z. Irten
 * 
 *  *  Aukeratu zenbaki bat:
 * 
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    
       
    public static void main(String[] args) {
              
        selekzioOsoaSortu();
        int o = 0;
        
        while(o != 6){
            System.out.println("**********************************************************");
            System.out.println("* \tEUSKAL SELEKZIOA");
            System.out.println("*  ----------------------------------");
            System.out.println("1. Partaideen datuak ikusi");
            System.out.println("2. Partaideen datuak ikusi taldekatuta");
            System.out.println("3. Futbolariak alfabetikoki inprimatu");
            System.out.println("4. Aldaketa");
            System.out.println("5. Bilatu abizenetik");
            System.out.println("6. Irten");
        }
        
    }   

public static void selekzioOsoaSortu(){       
        
        
        selekzioa.add(new Futbolista(1, "POR", azkenId++, "Aitor", "Fernandez", 29));
        selekzioa.add(new Futbolista(2, "DEF", azkenId++, "Unai", "Bustinza", 28));
        selekzioa.add(new Futbolista(3, "DEF", azkenId++, "Mikel", "Balenziaga", 32));
        selekzioa.add(new Futbolista(4, "MED", azkenId++, "Asier", "Illarramendi", 30));
        selekzioa.add(new Futbolista(5, "DEF", azkenId++, "Iñigo", "Martinez", 29));
        selekzioa.add(new Futbolista(6, "MED", azkenId++, "Mikel", "San Jose", 31));
        selekzioa.add(new Futbolista(7, "DEF", azkenId++, "Gaizka", "Larrazabal", 23));
        selekzioa.add(new Futbolista(8, "MED", azkenId++, "Manu", "Garcia", 34));
        selekzioa.add(new Futbolista(9, "DEL", azkenId++, "Aritz", "Aduriz", 39));
        selekzioa.add(new Futbolista(10, "MED", azkenId++, "Javier", "Eraso", 30));
        selekzioa.add(new Futbolista(11, "DEL", azkenId++, "Asier", "Villalibre", 23));
        selekzioa.add(new Futbolista(12, "DEF", azkenId++, "Aihen", "Muñoz", 23));
        selekzioa.add(new Futbolista(13, "POR", azkenId++, "Iago", "Herrerin", 32));
        selekzioa.add(new Futbolista(14, "DEF", azkenId++, "Aritz", "Elustondo", 26));
        selekzioa.add(new Futbolista(15, "DEF", azkenId++, "Jesus", "Areso", 21));
        selekzioa.add(new Futbolista(16, "DEL", azkenId++, "Iñigo", "Vicente", 23));
        selekzioa.add(new Futbolista(17, "DEF", azkenId++, "Daniel", "Vivian", 21));
        
        selekzioa.add(new Entrenador("1000A", azkenId++, "Javier", "Clemente", 70));
        selekzioa.add(new Entrenador("2000B", azkenId++, "Joseba", "Nuñez", 40));
        selekzioa.add(new Entrenador("3000C", azkenId++, "Markel", "Lautadahandi", 31));
        
        selekzioa.add(new Masajista("Fisioterapeuta", 15, azkenId++, "Iñaki", "Sertxiberrieta", 45));
        
        selekzioa.add(new IntegranteSeleccion(azkenId++,"Ander","Etxeburu",35));
    }
}
