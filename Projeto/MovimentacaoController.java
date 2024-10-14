/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author 202304392651
 */
// MovimentacaoController.java

import DAO.MovimentacaoDAO;
import Modelo.Ferramenta;

public class MovimentacaoController {
    private MovimentacaoDAO movimentacaoDAO;

    public MovimentacaoController() {
        this.movimentacaoDAO = new MovimentacaoDAO();
    }

    public void movimentarEstoque(Ferramenta ferramenta, int quantidade, boolean adicionar) {
        movimentacaoDAO.movimentarEstoque(ferramenta, quantidade, adicionar);
    }
}

