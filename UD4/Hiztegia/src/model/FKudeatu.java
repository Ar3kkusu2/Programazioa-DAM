/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moreno.manuel
 */
public class FKudeatu {

    public static void FSortu(String izena) {
        try {

            Terminoa T1 = new Terminoa("Sagarra", "Manzana");
            Terminoa T2 = new Terminoa("Ikatza", "Carbon");
            Terminoa T3 = new Terminoa("Andrea", "Mujer");
            Terminoa T4 = new Terminoa("Gizona", "Hombre");
            Terminoa T5 = new Terminoa("Kutxa", "Caja");

            FileOutputStream fout = new FileOutputStream(izena);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(T1);
            out.writeObject(T2);
            out.writeObject(T3);
            out.writeObject(T4);
            out.writeObject(T5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Terminoa tBilatu(String Hitza) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("Hiztegia.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa t;
            while (true) {
                t = (Terminoa) inStream.readObject(); //
                if (t.getHitzaEus().toLowerCase().equals(Hitza.toLowerCase()) || t.getHitzaEs().toLowerCase().equals(Hitza.toLowerCase())) {
                    return t;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {
            System.out.println("C'est fini");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                Logger.getLogger(Irakurri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public void tGehitu(Terminoa t) {
        try {

            FileOutputStream fout = new FileOutputStream("Hiztegia.dat",true);
            GehituHitza out = new GehituHitza(fout);
            out.writeObject(t);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
