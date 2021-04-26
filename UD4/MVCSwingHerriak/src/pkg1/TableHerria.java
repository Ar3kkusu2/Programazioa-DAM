/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author gallastegui.maitane
 */
public class TableHerria extends AbstractTableModel{
    
    private ArrayList<Herria> datos =new ArrayList<>();
    private final String[] ColumnName={"Herria","Probintzia","Hondartza","Oharra"};
    
    public TableHerria() {
        String sql = "SELECT * FROM herriak";
        
        try (Connection conn = Model.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            
            // loop through the result set
            while (rs.next()) {
                datos.add(new Herria(rs.getString("Herria"),rs.getString("Probintzia"),rs.getBoolean("Hondartza"),rs.getString("Oharrak")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    /**
     * 
     * @param c zutabe kopurua
     * @return boolean, String edo int den bueltatzen du.
     */
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0,c).getClass();
    }
    
    @Override
    public int getColumnCount(){
        return ColumnName.length;
    } 
    
    @Override
    public String getColumnName(int col){
        return ColumnName[col];
    }
    
    @Override
    public int getRowCount(){
        return datos.size();
    }
    
    @Override
    public Object getValueAt(int row, int col){
        if(col==0){
             return datos.get(row).getHerria();
        }else if (col==1){
           return datos.get(row).getProbintzia();
        }else if (col==2){
           return datos.get(row).isHondartza();
        }else if (col==3){
           return datos.get(row).getOharra();
        }else{
            return null;
        }
        
    }
}
