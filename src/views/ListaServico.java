/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import dao.ServicoDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Servico;

/**
 *
 * @author 182220008
 */
public class ListaServico extends javax.swing.JFrame {

    private DefaultTableModel model;
    
    public ListaServico() {
        initComponents();
        defineIcone();
    }
    
    private void defineIcone() {
        Image icone16 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/16.png"));
        Image icone32 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/32.png"));
        Image icone64 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/64.png"));
        Image icone128 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/128.png"));
        setIconImages(Arrays.asList(icone16, icone32, icone64, icone128));
    }

    private void preencheTabela(){
        List<Servico> listaServ = ServicoDAO.buscaTodos();
        model.getDataVector().clear();
        listaServ.forEach(s-> model.addRow(new Object[]{s.getId(),s.getCli(),s.getDef(),s.getTipoServico().getNome(),s.getValor(),s.getAutomovel(),s.getFornecedorFlores(),s.getCemiterioCapela(),s.getUrnaFuneraria().getCategoria()}));
    }
    private Servico selecionaServico(){
        int linhaSelecionada = jTabServico.getSelectedRow();
        if(linhaSelecionada < 0|| linhaSelecionada > jTabServico.getRowCount())
            throw new RuntimeException("Um serviço deve ser selecionado");
        int id = (int) model.getValueAt(linhaSelecionada, 0);
        return ServicoDAO.buscaPorId(id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbListServ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        String[] colunas = {"Id","Cliente","Defunto","Tipo de serviço","valor","Automóvel","Fornecedor de flores","Cemitério/capela","Urna funerária"};
        model = new DefaultTableModel(colunas,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTabServico = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbListServ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbListServ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListServ.setText("Funerária um irmão - Lista de serviços");

        jTabServico.setModel(model);
        preencheTabela();
        jScrollPane1.setViewportView(jTabServico);

        btEditar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(lbListServ, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbListServ)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        try{
            Servico servicoSelecionado = selecionaServico();
            FormularioVendaServico fv = new FormularioVendaServico(servicoSelecionado);
            fv.setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Erro ao tentar editar serviço"+e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try{
            Servico servicoSelecionado = selecionaServico();
            String[] opcoes = {"sim","não"};
            int opcao = JOptionPane.showOptionDialog(this,String.format("Tem certeza que deseja excluir o serviço %s para o defunto %s?\nNão é possível desfazer esta ação.", servicoSelecionado.getTipoServico().getNome(),servicoSelecionado.getDef()),
                    getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
            if (opcao!=0){
                return;
            }
            ServicoDAO.excluiServico(servicoSelecionado);
            preencheTabela();
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao tentar excluir Serviço\n"+e.getMessage(),getTitle(),JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabServico;
    private javax.swing.JLabel lbListServ;
    // End of variables declaration//GEN-END:variables

}
