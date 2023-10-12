/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Automovel;
import models.CemiterioCapela;
import models.Cliente;
import models.Defunto;
import models.FornecedorFlores;
import models.Servico;
import models.UrnaFuneraria;

public class ServicoDAO {

    public static void cadastra(Servico serv) {
        String sql = "INSERT INTO servico (idCliente, idDefunto, tipo_servico, valor, idAutomovel, idFornecedor_flores, idCemiterio_capela, idUrna_funeraria) VALUES (?,?,?,?,?,?,?,?)";

        try ( Connection con = ConnectionFactory.getConnection();  
                PreparedStatement statement = con.prepareStatement(sql);) {
            statement.setInt(1, serv.getCli().getId());
            statement.setInt(2, serv.getDef().getId());
            statement.setString(3, serv.getTipoServico());
            statement.setFloat(4, serv.getValor());
            statement.setInt(5, serv.getAutomovel().getId());
            statement.setInt(6, serv.getFornecedorFlores().getId());
            statement.setInt(7, serv.getCemiterioCapela().getId());
            statement.setInt(8, serv.getUrnaFuneraria().getId());

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Servico> buscaTodos() {
        String sql =
        "SELECT id, idCliente, idDefunto, tipo_servico, valor, idAutomovel, idFornecedor_flores, idCemiterio_capela, idUrna_funeraria FROM servico";

        try ( Connection con = ConnectionFactory.getConnection();  
                PreparedStatement statement = con.prepareStatement(sql);) {
            ArrayList<Servico> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int idCliente = rs.getInt("idCliente");
                int idDefunto = rs.getInt("idDefunto");
                String tipoServico = rs.getString("tipo_servico");
                float valor = rs.getFloat("valor");
                int idAutomovel = rs.getInt("idAutomovel");
                int idFornecedorFlores = rs.getInt("idFornecedor_flores");
                int idCemiterioCapela = rs.getInt("idCemiterio_capela");
                int idUrnaFuneraria = rs.getInt("idUrna_funeraria");
                
                Cliente cli = ClienteDAO.buscaPorId(idCliente);
                Defunto def = DefuntoDAO.buscaPorId(idDefunto);
                Automovel aut = AutomovelDAO.buscaPorId(idAutomovel);
                FornecedorFlores ff = FornecedorFloresDAO.buscaPorId(idFornecedorFlores);
                CemiterioCapela cc = CemiterioCapelaDAO.buscaPorId(idCemiterioCapela);
                UrnaFuneraria uf = UrnaFunerariaDAO.buscaPorId(idUrnaFuneraria);

                Servico serv = new Servico(tipoServico, valor, aut, ff, cc, uf, cli, def);
                serv.setId(id);
                lista.add(serv);
            }
            rs.close();
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
