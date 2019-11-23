package factory;

import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionFactory {
    //faz a conexão com o banco de dados
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost/cadastro_pagamento";
        String uid = "user";
        String pass = "123";
        
        try{
            return DriverManager.getConnection(url, uid, pass);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException(e);
        }
        
    }
}
