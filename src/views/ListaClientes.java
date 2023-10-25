/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Cliente;

/**
 *
 * @author Glauber
 */
public class ListaClientes extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form EdicaoCliente
     */
    public ListaClientes() {
        initComponents();
    }

    private void preencheTabela(){
        List<Cliente> listaClientes = ClienteDAO.buscaTodos();
        model.getDataVector().clear();
        listaClientes.forEach(c -> model.addRow(new Object[]{c.getId(), c.getNome(),c.getCpf(),c.getTelefone(),c.getEmail(),c.getEndereco(),c.getCidade()}));
        
    }
    private Cliente selecionaCliente(){
        int linhaSelecionada = jtTabelaCliente.getSelectedRow();
        if (linhaSelecionada < 0 || linhaSelecionada > jtTabelaCliente.getRowCount())
            throw new RuntimeException("Um cliente deve ser selecionado.");
        int id = (int) model.getValueAt(linhaSelecionada, 0);
        return ClienteDAO.buscaPorId(id);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        String[] colunas = {"Id","Nome","CPF","Telefone","E-mail","Endereço","Cidade"};
        model = new DefaultTableModel(colunas,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtTabelaCliente = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funerária um irmão - Lista de clientes");

        jtTabelaCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jtTabelaCliente.setModel(model);
        TableColumn colunaId = jtTabelaCliente.getColumnModel().getColumn(0);
        colunaId.setPreferredWidth(20);
        preencheTabela();
        jScrollPane1.setViewportView(jtTabelaCliente);

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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funerária um irmão - Lista de clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(104, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        try{
            Cliente clienteSelecionado = selecionaCliente();
            FormularioCliente fc = new FormularioCliente(clienteSelecionado);
            fc.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao tentar editar cliente\n"+e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try{
            Cliente clienteSelecionado = selecionaCliente();
            String[] opcoes = {"sim","não"};
            int opcao = JOptionPane.showOptionDialog(this,String.format("Está certo de que deseja excluir o cliente %s?\nNão é possível desfazer esta ação",clienteSelecionado.getNome()),
                    getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
            if(opcao!=0){
                return;
            }
            ClienteDAO.excluiCliente(clienteSelecionado);
            preencheTabela();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao tentar excluir cliente\n"+e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabelaCliente;
    // End of variables declaration//GEN-END:variables
}
