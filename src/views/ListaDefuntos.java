/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.DefuntoDAO;
import errors.ErroSql;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Defunto;

/**
 *
 * @author Glauber
 */
public class ListaDefuntos extends javax.swing.JFrame {
    private DefaultTableModel model;
    private final DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    /**
     * Creates new form ListaDefuntos
     */
    public ListaDefuntos() {
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
        List<Defunto> listadefuntos = DefuntoDAO.buscaTodos();
        model.getDataVector().clear();
        listadefuntos.forEach(d -> model.addRow(new Object[]{d.getId(), d.getNome(),d.getGenero(),formatadorData.format(d.getDataNascimento()),formatadorData.format(d.getDataObito())}));
        }
    
    private Defunto selecionaDefunto(){
        int linhaSelecionada = jtTabelaDefuntos.getSelectedRow();
        if (linhaSelecionada < 0 || linhaSelecionada > jtTabelaDefuntos.getRowCount())
            throw new RuntimeException("Um defunto deve ser selecionado.");
        int id = (int) model.getValueAt(linhaSelecionada, 0);
        return DefuntoDAO.buscaPorId(id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        String[] colunas = {"Id","Nome","Gênero","Data de nascimento","Data de óbito"};
        model = new DefaultTableModel(colunas,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtTabelaDefuntos = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funerária um irmão - Lista de defuntos");

        jtTabelaDefuntos.setModel(model);
        TableColumn colunaId = jtTabelaDefuntos.getColumnModel().getColumn(0);
        colunaId.setPreferredWidth(20);
        preencheTabela();
        jScrollPane1.setViewportView(jtTabelaDefuntos);

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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funerária um irmão - Lista de defuntos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        try{
            Defunto defuntoSelecionado = selecionaDefunto();
            FormularioDefunto fd = new FormularioDefunto(defuntoSelecionado);
            fd.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao tentar editar defunto\n"+e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try{
            Defunto defuntoSelecionado = selecionaDefunto();
            String[] opcoes = {"sim","não"};
            int opcao = JOptionPane.showOptionDialog(this,String.format("Está certo de que deseja excluir o defunto %s?\nNão é possível desfazer esta ação",defuntoSelecionado.getNome()),
                    getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
            if(opcao!=0){
                return;
            }
            DefuntoDAO.excluiDefunto(defuntoSelecionado);
            preencheTabela();
        } catch (ErroSql er){
            JOptionPane.showMessageDialog(this, er.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao tentar excluir defunto\n"+e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaDefuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDefuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDefuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDefuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDefuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabelaDefuntos;
    // End of variables declaration//GEN-END:variables
}
