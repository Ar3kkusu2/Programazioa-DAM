/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Irakurri;
import model.Terminoa;

/**
 *
 * @author moreno.manuel
 */
public class HiztegiaTable extends AbstractTableModel{
    
    private String[] ColumnName = {"Euskera","Español"};
    private ArrayList<Terminoa> Datos = new ArrayList<>();
    
    public HiztegiaTable(){
        
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("Hiztegia.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa t;
            while (true) {
                t = (Terminoa) inStream.readObject(); //
                Datos.add(t);
                
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
    }

    @Override
    public String getColumnName(int col){
        return ColumnName[col];
    }
    
    @Override
    public int getRowCount() {
        return Datos.size();
    }

    @Override
    public int getColumnCount() {
        return ColumnName.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (col == 0){
            return Datos.get(row).getHitzaEus();
        }else if (col == 1){
            return Datos.get(row).getHitzaEs();
        }else {
            return null;
        }
    }
    
    
}
