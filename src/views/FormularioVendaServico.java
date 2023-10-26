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
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
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
public class FormularioVendaServico extends javax.swing.JFrame {

    private Servico servico;

    /**
     * Creates new form VendaServico
     */
    public FormularioVendaServico() {
        initComponents();
        defineIcone();
    }

    public FormularioVendaServico(Servico servico) {
        this.servico = servico;
        initComponents();
        defineIcone();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCliente1 = new javax.swing.JLabel();
        LbServico = new javax.swing.JLabel();
        CbCliente = new javax.swing.JComboBox<>();
        CemiterioCapela[] listaCc = CemiterioCapelaDAO.buscaTodos().toArray(new CemiterioCapela[0]);
        DefaultComboBoxModel<CemiterioCapela> comboCcModel = new DefaultComboBoxModel<>(listaCc);
        CbxCapela = new javax.swing.JComboBox<>();
        TipoServico[] listaTs = TipoServicoDAO.buscaTodos().toArray(new TipoServico[0]);
        DefaultComboBoxModel<TipoServico> comboTsModel = new DefaultComboBoxModel<>(listaTs);
        CbxServico = new javax.swing.JComboBox<>();
        Defunto[] listaDefuntos = DefuntoDAO.buscaTodos().toArray(new Defunto[0]);
        DefaultComboBoxModel<Defunto> comboDefuntoModel = new DefaultComboBoxModel<>(listaDefuntos);
        CbDefunto = new javax.swing.JComboBox<>();
        FornecedorFlores[] listaFf = FornecedorFloresDAO.buscaTodos().toArray(new FornecedorFlores[0]);
        DefaultComboBoxModel<FornecedorFlores> comboFfModel = new DefaultComboBoxModel<>(listaFf);
        CbxFornFlores = new javax.swing.JComboBox<>();
        Automovel[] listaAut = AutomovelDAO.buscaTodos().toArray(new Automovel[0]);
        DefaultComboBoxModel<Automovel> comboAutModel = new DefaultComboBoxModel<>(listaAut);
        CbxAutomovel = new javax.swing.JComboBox<>();
        lbSubtotal = new javax.swing.JLabel();
        BtCadServico = new javax.swing.JButton();
        UrnaFuneraria[] listaUf = UrnaFunerariaDAO.buscaTodos().toArray(new UrnaFuneraria[0]);
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
        LbServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbServico.setText("Serviço/Venda");

        Cliente[] listaClientes = ClienteDAO.buscaTodos().toArray(new Cliente[0]);
        DefaultComboBoxModel<Cliente> comboClienteModel = new DefaultComboBoxModel<>(listaClientes);
        CbCliente.setMaximumRowCount(10);
        CbCliente.setModel(comboClienteModel);
        CbCliente.setPreferredSize(new java.awt.Dimension(270, 30));

        CbxCapela.setModel(comboCcModel);
        CbxCapela.setPreferredSize(new java.awt.Dimension(270, 30));

        CbxServico.setModel(comboTsModel);
        CbxServico.setPreferredSize(new java.awt.Dimension(270, 30));

        CbDefunto.setModel(comboDefuntoModel);
        CbDefunto.setPreferredSize(new java.awt.Dimension(270, 30));

        CbxFornFlores.setModel(comboFfModel);
        CbxFornFlores.setPreferredSize(new java.awt.Dimension(270, 30));

        CbxAutomovel.setModel(comboAutModel);
        CbxAutomovel.setPreferredSize(new java.awt.Dimension(270, 30));

        lbSubtotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbSubtotal.setText("Subtotal R$");
        lbSubtotal.setPreferredSize(new java.awt.Dimension(270, 30));

        BtCadServico.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtCadServico.setText("Cadastro do serviço");
        BtCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadServicoActionPerformed(evt);
            }
        });

        CbxUrnaFuneraria.setModel(comboUfModel);
        CbxUrnaFuneraria.setPreferredSize(new java.awt.Dimension(270, 30));

        lbCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbCliente.setText("Cliente");
        lbCliente.setPreferredSize(new java.awt.Dimension(270, 30));

        lbDefunto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbDefunto.setText("Defunto");
        lbDefunto.setPreferredSize(new java.awt.Dimension(270, 30));

        lbCemiterioCapela.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbCemiterioCapela.setText("Cemitério/Capela");
        lbCemiterioCapela.setPreferredSize(new java.awt.Dimension(270, 30));

        lbFornecedorFlores.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbFornecedorFlores.setText("Fornecedor de flores");
        lbFornecedorFlores.setPreferredSize(new java.awt.Dimension(270, 30));

        lbServico1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbServico1.setText("Serviço");
        lbServico1.setPreferredSize(new java.awt.Dimension(270, 30));

        lbAutomovel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbAutomovel.setText("Automóvel");
        lbAutomovel.setPreferredSize(new java.awt.Dimension(270, 30));

        lbUrnaFuneraria.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lbUrnaFuneraria.setText("Urna Funerária");
        lbUrnaFuneraria.setPreferredSize(new java.awt.Dimension(270, 30));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbServico, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbUrnaFuneraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbServico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxCapela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxUrnaFuneraria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbDefunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CbxFornFlores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CbxAutomovel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbFornecedorFlores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbDefunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtCadServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCemiterioCapela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LbServico)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDefunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbDefunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbServico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFornecedorFlores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbxFornFlores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCemiterioCapela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxCapela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbUrnaFuneraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbxUrnaFuneraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadServico)
                    .addComponent(btSubtotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadServicoActionPerformed
        try {
            Servico serv = criaServico();
            if (this.servico != null) {
                serv.setId(servico.getId());
                ServicoDAO.editaServico(serv);
                JOptionPane.showMessageDialog(this, "Serviço atualizado com sucesso\n", getTitle(), JOptionPane.INFORMATION_MESSAGE);
            } else {
                ServicoDAO.cadastra(serv);
                JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso\n" + serv, getTitle(), JOptionPane.INFORMATION_MESSAGE);
                try (PrintStream ps = new PrintStream(new File("NF.txt"), StandardCharsets.UTF_8.name())) {
                    ps.println("Funerária um irmão \n Antes eram dois.");
                    ps.println("Cliente: " + serv.getCli().getNome());
                    ps.println("Defunto: " + serv.getDef().getNome());
                    ps.println(serv.getTipoServico().getNome());
                    ps.println(String.format("Total R$ %.2f", serv.getValor()));

                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, String.format("Erro ao cadastrar Serviço:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_BtCadServicoActionPerformed
    private void defineIcone() {
        Image icone16 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/16.png"));
        Image icone32 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/32.png"));
        Image icone64 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/64.png"));
        Image icone128 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/128.png"));
        setIconImages(Arrays.asList(icone16, icone32, icone64, icone128));
    }
    private void btSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtotalActionPerformed
        Servico serv = criaServico();
        float valor = serv.getValor();
        lbSubtotal.setText(String.format("Subtotal R$ %.2f", valor));

    }//GEN-LAST:event_btSubtotalActionPerformed

    public Servico criaServico() {
        Cliente cli = CbCliente.getItemAt(CbCliente.getSelectedIndex());
        Defunto def = CbDefunto.getItemAt(CbDefunto.getSelectedIndex());
        TipoServico ts = CbxServico.getItemAt(CbxServico.getSelectedIndex());
        FornecedorFlores ff = CbxFornFlores.getItemAt(CbxFornFlores.getSelectedIndex());
        CemiterioCapela cc = CbxCapela.getItemAt(CbxCapela.getSelectedIndex());
        Automovel aut = CbxAutomovel.getItemAt(CbxAutomovel.getSelectedIndex());
        UrnaFuneraria uf = CbxUrnaFuneraria.getItemAt(CbxUrnaFuneraria.getSelectedIndex());

        float valor = (uf.getValor() + ts.getValor());

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
