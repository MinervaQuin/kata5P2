/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata5p2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minerva
 */
public class MailListReaderBD {
    
    private Connection connect() {
       String url = "jdbc:sqlite:Kata5BD.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    
    public List<String> read(String nombre_archivo){
        List<String> correos = new ArrayList();
        String sql = "SELECT * FROM email";
        
        try (Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            // Bucle sobre el conjunto de registros.
            while (rs.next()) {
                correos.add(rs.getString("direccion"));
            }
        } catch (SQLException e) {
        System.out.println(e.getMessage());
        }
        return correos;
    }
    

     
    
}
