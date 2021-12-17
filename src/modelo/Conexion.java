/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bdblockapp";
    String user="root";
    String pass="";
    
    public  Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("no hay conexion");
        }
        return con;
    }
        
}
