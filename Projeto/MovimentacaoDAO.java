/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author 202304392651
 */
// MovimentacaoDAO.java

import Banco.Conexao;
import Modelo.Ferramenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovimentacaoDAO {
    public void movimentarEstoque(Ferramenta ferramenta, int quantidade, boolean adicionar) {
        try {
            Connection conn = Conexao.getConnection();
            String sql;

            if (adicionar) {
                sql = "UPDATE Ferramentas SET quantidade = quantidade + ? WHERE nome = ?";
            } else {
                sql = "UPDATE Ferramentas SET quantidade = quantidade - ? WHERE nome = ?";
            }

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setString(2, ferramenta.getNome());

            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

