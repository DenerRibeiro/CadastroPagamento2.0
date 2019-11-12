package dao;

import factory.ConnectionFactory;
import gui.ContasGUI;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Contas;

public class ContasDAO {

    private Connection connection;

    public ContasDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //método que adiciona os valores na tabela tb_boleto
    public void Adiciona(Contas contas) {
        String sqlB = "INSERT INTO tb_boleto(boleto_valor,boleto_data_vencimento,"
                + "boleto_data_pagamento,boleto_descricao) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sqlB);

            stmt.setString(1, contas.getBoletoValor());
            stmt.setString(2, contas.getBoletoDataVencimento());
            stmt.setString(3, contas.getBoletoDataPagamento());
            stmt.setString(4, contas.getBoletoDescricao());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados!");
            throw new RuntimeException(u);
        }

    }

    //método que adiciona os valores na tabela tb_acrecimo
    public void AdicionaAcrecimo(Contas contas) {
        String sqlA = "INSERT INTO tb_acrecimo(acrecimo_multa,acrecimo_juros,"
                + "acrecimo_novo_valor,fk_boleto_cod) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmtA = this.connection.prepareStatement(sqlA);

            stmtA.setString(1, contas.getAcrecimoJuros());
            stmtA.setString(2, contas.getAcrecimoMulta());
            stmtA.setString(3, contas.getAcrecimoNovoValor());
            stmtA.setInt(4, LastQuery());
//            System.out.println();
            stmtA.execute();
            stmtA.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados!");
            throw new RuntimeException(u);
        }
    }

    //método que faz a consulta do código do boleto no banco de dados
    public ResultSet Consulta() throws SQLException {
        ResultSet rs = null;

        try {
//            ResultSet rs;
            Statement stmt;

            ConnectionFactory con = new ConnectionFactory();
            stmt = con.getConnection().createStatement();

            String sql = "select *  from tb_boleto,tb_acrecimo where boleto_cod=fk_boleto_cod";
            PreparedStatement stmtC = this.connection.prepareStatement(sql);
            
            stmtC.execute();

            rs = stmtC.executeQuery();
            stmt.close();

            return rs;
//            return find;

        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
               e.printStackTrace();
        }
//        return find;
        return rs;

    }

    public int LastQuery() throws SQLException {
//        boolean valido = true;
//         boolean find = true;
        int res = -1;
        try {
            ResultSet rs;
            Statement stmt;

            ConnectionFactory con = new ConnectionFactory();
            stmt = con.getConnection().createStatement();

            String sql = "select boleto_cod from tb_boleto";
            PreparedStatement stmtC = this.connection.prepareStatement(sql);

            stmtC.execute();

            rs = stmtC.executeQuery();
//            find = rs.first();
            while (rs.next()) {
                res = rs.getInt("boleto_cod");
            }
            stmt.close();
            

//            ContasGUI gui = new ContasGUI();
//            return find;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return res;
//        return find;

    }
}
