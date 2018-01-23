/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sofia Gomez
 */
public class conexion {

    static String url = "jdbc:mysql://localhost:3306/combustible";
    static String usuario = "root";
    static String pass = "12345";

    public static Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conex = DriverManager.getConnection(url,usuario,pass);
            return conex;
           
        } catch (Exception ex) {
            return null;
        }
    }
}
