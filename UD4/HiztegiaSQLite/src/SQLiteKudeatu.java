/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author moreno.manuel
 */
public class SQLiteKudeatu {
         /**
     * Connect to a sample database
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlitehiztegia.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return conn;
    }
    
    
    public void terminoakInprimatu(){
        
        String sql = "SELECT id, euskaraz, gazteleraz FROM terminoak";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("ID") +  "\t" + 
                                   rs.getString("Eus") + "\t" +
                                   rs.getString("Es"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int tGehitu(Terminoa t){
        
        String sql = "insert into Terminoak(euskaraz,gastelaniaz) values ('",?)";
        
        try (Connection conn = this.connect();
            Statement stmt  = conn.Statement(sql)){            
            return stmt.executeUpdate();
                       }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }