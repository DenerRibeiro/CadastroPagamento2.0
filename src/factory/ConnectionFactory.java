package factory;

import java.sql.*;
public class ConnectionFactory {
    //faz a conexão com o banco de dados
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost/cadastro_pagamento";
        String uid = "root";
        String pass = "password";
        
        try{
            return DriverManager.getConnection(url, uid, pass);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
}
