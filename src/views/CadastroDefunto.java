/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import dao.DefuntoDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import models.Defunto;


/**
 *
 * @author 182220008
 */
public class CadastroDefunto extends javax.swing.JFrame {
    private final DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final Format formatoData = formatadorData.toFormat();

    /**
     * Creates new form CadastroDefunto
     */
    public CadastroDefunto() {
        initComponents();
        defineIcone();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbCadDefunto = new javax.swing.JLabel();
        LbNome = new javax.swing.JLabel();
        LbGenero = new javax.swing.JLabel();
        LbDataNascimento = new javax.swing.JLabel();
        LbDataObito = new javax.swing.JLabel();
        FtfDataNascimento = new JFormattedTextField(formatoData);
        FtfDataObito = new JFormattedTextField(formatoData);
        TfNome = new javax.swing.JTextField();
        TfGenero = new javax.swing.JTextField();
        BtCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro defunto");

        LbCadDefunto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbCadDefunto.setText("Cadastro de defunto");

        LbNome.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbNome.setText("Nome");

        LbGenero.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbGenero.setText("Gênero");

        LbDataNascimento.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbDataNascimento.setText("Data nascimento");

        LbDataObito.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbDataObito.setText("Data óbito");

        TfNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        TfGenero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        BtCadastrar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TfNome)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbGenero)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LbDataObito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LbCadDefunto)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TfGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(FtfDataObito))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(BtCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LbCadDefunto)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(LbGenero)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDataNascimento)
                    .addComponent(FtfDataObito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbDataObito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(BtCadastrar)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
      try{
          Defunto def = criaDefunto();
          DefuntoDAO.cadastra(def);
          JOptionPane.showMessageDialog(this, "Defunto cadastrado com sucesso", getTitle(), JOptionPane.INFORMATION_MESSAGE);
          
        dispose();
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, String.format("Erro ao cadastrar defunto:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
        
      }
      
      
    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void defineIcone(){
        Image icone16= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/16.png"));
        Image icone32= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/32.png"));
        Image icone64= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/64.png"));
        Image icone128= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/128.png"));
        setIconImages(Arrays.asList(icone16,icone32, icone64, icone128));
    }
    
    public Defunto criaDefunto(){
        Defunto def = new Defunto();
        
        LocalDate dataNasc = LocalDate.parse(FtfDataNascimento.getText(), formatadorData);
        LocalDate dataObt = LocalDate.parse(FtfDataObito.getText(), formatadorData);
        
        def.setNome(TfNome.getText());
        def.setGenero(TfGenero.getText());
        def.setDataNascimento(dataNasc);
        def.setDataObito(dataObt);
        
       return def; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JFormattedTextField FtfDataNascimento;
    private javax.swing.JFormattedTextField FtfDataObito;
    private javax.swing.JLabel LbCadDefunto;
    private javax.swing.JLabel LbDataNascimento;
    private javax.swing.JLabel LbDataObito;
    private javax.swing.JLabel LbGenero;
    private javax.swing.JLabel LbNome;
    private javax.swing.JTextField TfGenero;
    private javax.swing.JTextField TfNome;
    // End of variables declaration//GEN-END:variables
}
