/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author moreno.manuel
 */
public class Model {
    
    private static String db = "db/IzenenDBa.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:" + db;
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            //  System.out.println("Connection to SQLite has been established.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    public static ArrayList<Izena> irakurri() {
        ArrayList<Izena> alIzenak = new ArrayList<>();
        String taula = "Izenak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Izena iz = new Izena(rs.getString("izena"));
                alIzenak.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return alIzenak;
    }
    
    public static int gehitu(Izena i) {

        String sql = "INSERT INTO Izenak(izena) VALUES(?)";

        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,i.getIzena());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }
}
