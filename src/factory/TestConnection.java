
package factory;

import java.sql.Connection;
import java.sql.SQLException;
public class TestConnection {
    public static void main(String[] args) throws SQLException{
        //faz teste de conexão com o banco de dados
        Connection connection  = new ConnectionFactory().getConnection(); 
        System.out.println("Conexão aberta!");
        connection.close();
    }
}
