/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

/** Programa honetan Euskal Selekzioko datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  
 * 
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
    
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     *   
     */
    public static void main(String[] args) {
        
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(){
        
        Futbolista f1 = new Futbolista(1, "DEL", azkenId++, "Asier", "Villalibre", 23);
        System.out.println(f1.toString());   

    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(){
        
        Entrenador e1 = new Entrenador("1000A", azkenId++, "Javier", "Clemente", 70);
        System.out.println(e1.toString());
        Masajista m1 = new Masajista("Fisioterapeuta", 15, azkenId++, "Iñaki", "Sertxiberrieta", 45);
        System.out.println(m1.toString());
        IntegranteSeleccion a1 = new IntegranteSeleccion(azkenId++,"Ander","Etxeburu",35);
        System.out.println(a1.toString());
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
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
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        
        boolean y = true;
        for(int i = 0; i < selekzioa.size(); i++){
           //IntegranteSeleccion  index = selekzioa.get(i);
            if(selekzioa.get(i).getId() == id){
                selekzioa.remove(i);
                y = true;
            }else
                y = false;
        }
        
        return y;
    }
}

