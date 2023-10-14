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
import models.TipoServico;

public class TipoServicoDAO {

    public static ArrayList<TipoServico> buscaTodos() {
        String sql = "SELECT id, nome, valor FROM tipo_servico";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            ArrayList<TipoServico> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                float valor = rs.getFloat("valor");
                

                TipoServico ts = new TipoServico(nome, valor);
                ts.setId(id);
                lista.add(ts);
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static TipoServico buscaPorId(int id) {
        String sql = "SELECT nome, valor FROM tipo_servico WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            TipoServico ts = null;

            if (rs.next()) {
                String nome = rs.getString("nome");
                float valor = rs.getFloat("valor");
                

                ts = new TipoServico(nome, valor);
                ts.setId(id);
                
            }
            rs.close();
            if (ts != null) return ts;
            throw new RuntimeException("Tipo de serviço não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
