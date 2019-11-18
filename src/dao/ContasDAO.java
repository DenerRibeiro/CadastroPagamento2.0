package dao;

import factory.ConnectionFactory;
import gui.ContasGUI;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Contas;

public class ContasDAO {

    private Connection connection;

    //estabelce conexao com o banco
    public ContasDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //método que adiciona os valores na tabela tb_boleto
    //e retorna o código do boleto
    public int Adiciona(Contas contas) {
        String sqlB = "INSERT INTO tb_boleto(boleto_valor,boleto_data_vencimento,"
                + "boleto_data_pagamento,boleto_descricao,fk_usuario_usuario) VALUES(?,?,?,?,?)";
        int boleto_cod = -1;

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlB, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, contas.getBoletoValor());
            stmt.setString(2, contas.getBoletoDataVencimento());
            stmt.setString(3, contas.getBoletoDataPagamento());
            stmt.setString(4, contas.getBoletoDescricao());
            stmt.setString(5, contas.getUsuario());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                boleto_cod = rs.getInt(1);
            }

            stmt.close();

        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados!");
            throw new RuntimeException(u);
        }
        return boleto_cod;

    }

    //método que adiciona os valores na tabela tb_acrecimo
    public void AdicionaAcrecimo(Contas contas) {
        String sqlA = "INSERT INTO tb_acrecimo(acrecimo_multa,acrecimo_juros,"
                + "acrecimo_novo_valor,fk_boleto_cod) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmtA = this.connection.prepareStatement(sqlA);

            stmtA.setString(1, contas.getAcrecimoMulta());
            stmtA.setString(2, contas.getAcrecimoJuros());
            stmtA.setString(3, contas.getAcrecimoNovoValor());
            stmtA.setInt(4, contas.getBoletoCod());
            stmtA.execute();
            stmtA.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados!");
            throw new RuntimeException(u);
        }
    }
    
    //método que  adiciona usuario na tabela tb_usuario
    public void AdicionaUsuario(Contas contas) {
        String sql = "INSERT INTO tb_usuario(usuario_usuario, usuario_senha)"
                + "VALUES (?,?)";
        PreparedStatement stmt;
        try {
            stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, contas.getUsuario());
            stmt.setString(2, contas.getSenha());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //método que faz a consulta do código do boleto no banco de dados
    public ResultSet Consulta() throws SQLException {
        ResultSet rs = null;

        try {
            
            Statement stmt;

            ConnectionFactory con = new ConnectionFactory();
            stmt = con.getConnection().createStatement();

            String sql = "select *  from tb_boleto,tb_acrecimo where boleto_cod=fk_boleto_cod";
            PreparedStatement stmtC = this.connection.prepareStatement(sql);

            stmtC.execute();

            rs = stmtC.executeQuery();
            stmt.close();

            return rs;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;

    }
    
    //método que verifica se já existe o usuario digitado
    public boolean VerificaUsuario(String usuario) {
        String sql = "select usuario_usuario from tb_usuario";
        ResultSet rs;
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.execute();
            rs = stmt.executeQuery();

            while (rs.next()) {
                if (rs.getString("usuario_usuario").equals(usuario)) {
                    return true;
                }
            }
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //método que verifica no banco se existe o usário e senha digitados no login
    public boolean VerificaUsuarioESenha(String usuario, String senha) {
        String sql = "select * from tb_usuario";
        ResultSet rs;
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.execute();
            rs = stmt.executeQuery();

            while (rs.next()) {
                if (rs.getString("usuario_usuario").equals(usuario)
                        && rs.getString("usuario_senha").equals(senha)) {
                    return true;
                }
            }
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
