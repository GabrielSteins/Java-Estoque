/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FerramentaDAO;
import Modelo.Ferramenta;
import View.FerramentaView;

/**
 *
 * @author 202304392651
 */
// FerramentaController.java
public class FerramentaController {
    private FerramentaView view;
    private FerramentaDAO dao;

    public FerramentaController(FerramentaView view) {
        this.view = view;
        this.dao = new FerramentaDAO();
    }

    public void cadastrarFerramenta(String nome, String descricao, int quantidade) {
        Ferramenta ferramenta = new Ferramenta(nome, descricao, quantidade);
        dao.cadastrarFerramenta(ferramenta);
    }


}
