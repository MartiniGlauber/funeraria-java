
package views;

import dao.AutomovelDAO;
import dao.CemiterioCapelaDAO;
import dao.ClienteDAO;
import dao.DefuntoDAO;
import dao.FornecedorFloresDAO;
import dao.ServicoDAO;
import dao.TipoServicoDAO;
import dao.UrnaFunerariaDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Automovel;
import models.CemiterioCapela;
import models.Cliente;
import models.Defunto;
import models.FornecedorFlores;
import models.Servico;
import models.TipoServico;
import models.UrnaFuneraria;


/**
 *
 * @author 182220008
 */
public class VendaServico extends javax.swing.JFrame {

    /**
     * Creates new form VendaServico
     */
    public VendaServico() {
        initComponents();
        defineIcone();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCliente1 = new javax.swing.JLabel();
        LbServico = new javax.swing.JLabel();
        CbCliente = new javax.swing.JComboBox<>();
        CemiterioCapela[] listaCc = CemiterioCapelaDAO.buscaTodos().toArray(CemiterioCapela[]::new);
        DefaultComboBoxModel<CemiterioCapela> comboCcModel = new DefaultComboBoxModel<>(listaCc);
        CbxCapela = new javax.swing.JComboBox<>();
        TipoServico[] listaTs = TipoServicoDAO.buscaTodos().toArray(TipoServico[]::new);
        DefaultComboBoxModel<TipoServico> comboTsModel = new DefaultComboBoxModel<>(listaTs);
        CbxServico = new javax.swing.JComboBox<>();
        Defunto[] listaDefuntos = DefuntoDAO.buscaTodos().toArray(Defunto[]::new);
        DefaultComboBoxModel<Defunto> comboDefuntoModel = new DefaultComboBoxModel<>(listaDefuntos);
        CbDefunto = new javax.swing.JComboBox<>();
        FornecedorFlores[] listaFf = FornecedorFloresDAO.buscaTodos().toArray(FornecedorFlores[]::new);
        DefaultComboBoxModel<FornecedorFlores> comboFfModel = new DefaultComboBoxModel<>(listaFf);
        CbxFornFlores = new javax.swing.JComboBox<>();
        Automovel[] listaAut = AutomovelDAO.buscaTodos().toArray(Automovel[]::new);
        DefaultComboBoxModel<Automovel> comboAutModel = new DefaultComboBoxModel<>(listaAut);
        CbxAutomovel = new javax.swing.JComboBox<>();
        LbPreco = new javax.swing.JLabel();
        BtCadServico = new javax.swing.JButton();
        lbSubtotal = new javax.swing.JLabel();
        UrnaFuneraria[] listaUf = UrnaFunerariaDAO.buscaTodos().toArray(UrnaFuneraria[]::new);
        DefaultComboBoxModel<UrnaFuneraria> comboUfModel = new DefaultComboBoxModel<>(listaUf);
        CbxUrnaFuneraria = new javax.swing.JComboBox<>();
        lbCliente = new javax.swing.JLabel();
        lbDefunto = new javax.swing.JLabel();
        lbCemiterioCapela = new javax.swing.JLabel();
        lbFornecedorFlores = new javax.swing.JLabel();
        lbServico1 = new javax.swing.JLabel();
        lbAutomovel = new javax.swing.JLabel();
        lbUrnaFuneraria = new javax.swing.JLabel();
        btSubtotal = new javax.swing.JButton();

        lbCliente1.setText("Cliente");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serviço");

        LbServico.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbServico.setText("Serviço/Venda");

        Cliente[] listaClientes = ClienteDAO.buscaTodos().toArray(Cliente[]::new);
        DefaultComboBoxModel<Cliente> comboClienteModel = new DefaultComboBoxModel<>(listaClientes);
        CbCliente.setMaximumRowCount(10);
        CbCliente.setModel(comboClienteModel);

        CbxCapela.setModel(comboCcModel);

        CbxServico.setModel(comboTsModel);

        CbDefunto.setModel(comboDefuntoModel);

        CbxFornFlores.setModel(comboFfModel);

        CbxAutomovel.setModel(comboAutModel);

        LbPreco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LbPreco.setText("Subtotal R$");

        BtCadServico.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtCadServico.setText("Cadastro do serviço");
        BtCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadServicoActionPerformed(evt);
            }
        });

        lbSubtotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        CbxUrnaFuneraria.setModel(comboUfModel);

        lbCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbCliente.setText("Cliente");

        lbDefunto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbDefunto.setText("Defunto");

        lbCemiterioCapela.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbCemiterioCapela.setText("Cemitério/Capela");

        lbFornecedorFlores.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbFornecedorFlores.setText("Fornecedor de flores");

        lbServico1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbServico1.setText("Serviço");

        lbAutomovel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbAutomovel.setText("Automóvel");

        lbUrnaFuneraria.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbUrnaFuneraria.setText("Urna Funerária");

        btSubtotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btSubtotal.setText("Calcula Subtotal");
        btSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUrnaFuneraria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCemiterioCapela, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbxCapela, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CbCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, 88, Short.MAX_VALUE)
                                .addComponent(lbCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbServico1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CbxServico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CbxUrnaFuneraria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btSubtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LbPreco)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(CbxFornFlores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BtCadServico)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbDefunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbFornecedorFlores, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CbxAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CbDefunto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(LbServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbCliente)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(LbServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDefunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbDefunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFornecedorFlores)
                    .addComponent(lbServico1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxFornFlores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCemiterioCapela)
                    .addComponent(lbAutomovel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxCapela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbUrnaFuneraria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbxUrnaFuneraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbPreco))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadServico)
                    .addComponent(btSubtotal))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadServicoActionPerformed
try{
        Servico serv = criaServico();
        ServicoDAO.cadastra(serv);
        JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso", getTitle(), JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, String.format("Erro ao cadastrar cliente:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtCadServicoActionPerformed
    private void defineIcone(){
        Image icone16= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/16.png"));
        Image icone32= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/32.png"));
        Image icone64= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/64.png"));
        Image icone128= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/128.png"));
        setIconImages(Arrays.asList(icone16,icone32, icone64, icone128));
    }
    private void btSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtotalActionPerformed
        Servico serv = criaServico();
        float valor = serv.getValor();
        lbSubtotal.setText(String.format("%.2f", valor));
        
    }//GEN-LAST:event_btSubtotalActionPerformed

   
    
    public Servico criaServico(){
        Cliente cli = CbCliente.getItemAt(CbCliente.getSelectedIndex());
        Defunto def = CbDefunto.getItemAt(CbDefunto.getSelectedIndex());
        TipoServico ts = CbxServico.getItemAt(CbxServico.getSelectedIndex());
        FornecedorFlores ff = CbxFornFlores.getItemAt(CbxFornFlores.getSelectedIndex());
        CemiterioCapela cc = CbxCapela.getItemAt(CbxCapela.getSelectedIndex());
        Automovel aut = CbxAutomovel.getItemAt(CbxAutomovel.getSelectedIndex());
        UrnaFuneraria uf = CbxUrnaFuneraria.getItemAt(CbxUrnaFuneraria.getSelectedIndex());
        
        float valor = (uf.getValor()+ ts.getValor());
        
        
        Servico serv = new Servico(ts, valor, aut, ff, cc, uf, cli, def);
        
        return serv;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadServico;
    private javax.swing.JComboBox<Cliente> CbCliente;
    private javax.swing.JComboBox<Defunto> CbDefunto;
    private javax.swing.JComboBox<Automovel> CbxAutomovel;
    private javax.swing.JComboBox<CemiterioCapela> CbxCapela;
    private javax.swing.JComboBox<FornecedorFlores> CbxFornFlores;
    private javax.swing.JComboBox<TipoServico> CbxServico;
    private javax.swing.JComboBox<UrnaFuneraria> CbxUrnaFuneraria;
    private javax.swing.JLabel LbPreco;
    private javax.swing.JLabel LbServico;
    private javax.swing.JButton btSubtotal;
    private javax.swing.JLabel lbAutomovel;
    private javax.swing.JLabel lbCemiterioCapela;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCliente1;
    private javax.swing.JLabel lbDefunto;
    private javax.swing.JLabel lbFornecedorFlores;
    private javax.swing.JLabel lbServico1;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbUrnaFuneraria;
    // End of variables declaration//GEN-END:variables
}
