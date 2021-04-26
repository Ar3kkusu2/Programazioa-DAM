/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author moreno.manuel
 */
public class Model {
    
    //private static String db = "db/HerrienDBa.db";

    /*public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            //String url = "jdbc:sqlite:" + db;
            String url = "jdbc:mariadb://localhost:3306/herriak";
            // create a connection to the database
            conn = DriverManager.getConnection(url,"root","");

            // System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }*/
    
    public static Connection connect() {
        Connection conn = null;
        try {
            //conn = DriverManager.getConnection("jdbc:mariadb://172.16.0.135/euskalherria", "bigarrenfila", "");
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/herriak", "root","");
            //conn = DriverManager.getConnection("jdbc:sqlite:db/HerrienDBa.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static ArrayList<Herria> irakurri() {
        ArrayList<Herria> alHerriak = new ArrayList<>();
        String taula = "herriak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Herria iz = new Herria(rs.getString("Herria"),rs.getString("Probintzia"),rs.getBoolean("Hondartza"),rs.getString("Oharrak"));
                alHerriak.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return alHerriak;
    }
    
       
    public void gehitu(Herria i) {
              
        int val = (i.isHondartza()) ? 1 : 0;        
      
        String sql = "INSERT INTO herriak VALUES ('"+ i.getHerria() +"', '"+ i.getProbintzia() +"', "+ val +", '"+ i.getOharra()+"')";
        //System.out.println(sql);
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
    }
    
    public void ezabatu(Herria i) {
        
        String sql = "DELETE FROM herriak WHERE Herria = '"+i.getHerria()+"'";
        System.out.println(sql);
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
        } catch (SQLException e) {
        }
        
    }
}
