/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tableproba;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Terminoa;

/**
 *
 * @author moreno.manuel
 */
public class HiztegiaTableModel extends AbstractTableModel{
    
    private String[] ColumnName = {"Euskera","Español"};
    private ArrayList<Terminoa> Datos = new ArrayList<>();
    
    public HiztegiaTableModel(){
        Datos.add(new Terminoa("Kutxa","Caja"));
        Datos.add(new Terminoa("Egurra","Madera"));
        Datos.add(new Terminoa("Ilargia","Luna"));
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
