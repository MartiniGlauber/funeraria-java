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
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import models.Defunto;

/**
 *
 * @author 182220008
 */
public class FormularioDefunto extends javax.swing.JFrame {
    private Defunto defunto;

    private final DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final Format formatoData = formatadorData.toFormat();

    /**
     * Creates new form CadastroDefunto
     */
    public FormularioDefunto() {
        initComponents();
        defineIcone();

    }
    public FormularioDefunto(Defunto def) {
        this.defunto = def;
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
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(defunto != null ? "Edição de defunto" : "Cadastro de defunto");

        LbCadDefunto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbCadDefunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCadDefunto.setText(defunto != null ? "Edição de defunto" : "Cadastro de defunto");

        LbNome.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbNome.setText("Nome");

        LbGenero.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbGenero.setText("Gênero");

        LbDataNascimento.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbDataNascimento.setText("Data nascimento");

        LbDataObito.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbDataObito.setText("Data óbito");

        FtfDataNascimento.setValue(defunto != null ? defunto.getDataNascimento() : null);

        FtfDataObito.setValue(defunto != null ? defunto.getDataObito() : null);

        TfNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TfNome.setText(defunto != null ? defunto.getNome() : "");

        TfGenero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TfGenero.setText(defunto != null ? defunto.getGenero() : "");

        btSalvar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(FtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbGenero)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LbDataObito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FtfDataObito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LbCadDefunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
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
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDataNascimento)
                    .addComponent(FtfDataObito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbDataObito))
                .addGap(35, 35, 35)
                .addComponent(btSalvar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Defunto def = criaDefunto();
            DefuntoDAO.cadastra(def);
            JOptionPane.showMessageDialog(this, "Defunto cadastrado com sucesso", getTitle(), JOptionPane.INFORMATION_MESSAGE);

            dispose();
        } catch(DateTimeParseException ex){
            JOptionPane.showMessageDialog(this, "Datas preenchidas incorretamente!", getTitle(), JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.format("Erro ao cadastrar defunto:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
            
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void defineIcone() {
        Image icone16 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/16.png"));
        Image icone32 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/32.png"));
        Image icone64 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/64.png"));
        Image icone128 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/128.png"));
        setIconImages(Arrays.asList(icone16, icone32, icone64, icone128));
    }

    public Defunto criaDefunto() {

        LocalDate dataNasc = LocalDate.parse(FtfDataNascimento.getText(), formatadorData);
        LocalDate dataObt = LocalDate.parse(FtfDataObito.getText(), formatadorData);

        String nome = (TfNome.getText());
        String genero = (TfGenero.getText());

        return new Defunto(nome, genero, dataNasc, dataObt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FtfDataNascimento;
    private javax.swing.JFormattedTextField FtfDataObito;
    private javax.swing.JLabel LbCadDefunto;
    private javax.swing.JLabel LbDataNascimento;
    private javax.swing.JLabel LbDataObito;
    private javax.swing.JLabel LbGenero;
    private javax.swing.JLabel LbNome;
    private javax.swing.JTextField TfGenero;
    private javax.swing.JTextField TfNome;
    private javax.swing.JButton btSalvar;
    // End of variables declaration//GEN-END:variables
}
