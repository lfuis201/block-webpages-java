/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsaurioDAO implements CRUD{
    Connection acceso;
    Conexion con=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Usuario ValidarUsuario(String nombre ,String pass){
        Usuario user = new Usuario();
        String sql="select * from users where nom_user=? and pass_user=?";
        try {
            //conjectarnos a la base de datos
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            
            while(rs.next()){
                user.setNombre(rs.getString(2));
                user.setPass(rs.getString(3));
                
            }
        } catch (Exception e) {
            
        }
        return user;
    }
    
    
    

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into users(nom_user,pass_user,Estado,Email)values(?,?,?,?)";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
