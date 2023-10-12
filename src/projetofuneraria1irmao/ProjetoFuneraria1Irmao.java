/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuneraria1irmao;

import dao.ServicoDAO;
import views.CadastroCliente;

/**
 *
 * @author 182220008
 */
public class ProjetoFuneraria1Irmao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastroCliente vs = new CadastroCliente();
        vs.setVisible(true);
        
        ServicoDAO.buscaTodos().forEach(s -> {
            System.out.println(s.getId());
            System.out.println(s.getCli());
            System.out.println(s.getDef());
            System.out.println(s.getCemiterioCapela());
            System.out.println(s.getFornecedorFlores());
            System.out.println(s.getAutomovel());
            System.out.println(s.getUrnaFuneraria());
            System.out.println(s.getTipoServico());
            System.out.println(String.format("R$ %.2f", s.getValor()));
        });
        
    }
    
}
