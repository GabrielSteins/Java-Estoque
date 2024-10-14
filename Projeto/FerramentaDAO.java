/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author 202304392651
 */
// LoginDAO.java
import Banco.Conexao;
import Modelo.Ferramenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// FerramentaDAO.java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO{
  public void cadastrarFerramenta(Ferramenta ferramenta){
  try{
      Connection conn = Conexao.getConnection();
      String sql = "INSERT INTO Ferramentas (nome, descricao, quantidade) VALUES (?,?,?)";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, ferramenta.getNome());
      stmt.setString(2, ferramenta.getDescricao());
      stmt.setInt(3, ferramenta.getQuantidade());
      
      stmt.executeUpdate();
      stmt.close();
      conn.close();
  }catch (SQLException e){
      e.printStackTrace();
  }
  }
}
