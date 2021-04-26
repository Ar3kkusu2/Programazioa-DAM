/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Idatzi {

    /** Hainbat pertsona objetu sortu eta output stream-ean idatzi.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Creating the object    
            Laguna l1 = new Laguna(1,"Bevi");
            Laguna l2 = new Laguna(2,"Zevin");
            Laguna l3 = new Laguna(3,"Cheto");
            Laguna l4 = new Laguna(4,"Carras");
            Laguna l5 = new Laguna(5,"Pimpi");
            Laguna l6 = new Laguna(6,"Lucy");
            Laguna l7 = new Laguna(7,"Pol");
            
            
            //Creating stream and writing the object    
            FileOutputStream fout = new FileOutputStream("EzAlexenLagunak.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(l1);
            out.writeObject(l2);
            out.writeObject(l3);
            out.writeObject(l4);
            out.writeObject(l5);
            out.writeObject(l6);
            out.writeObject(l7);
            
            //closing the stream    
            //out.close();
            //System.out.println("Datuak fitxategian idatzi dira.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
