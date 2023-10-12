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
import models.UrnaFuneraria;

public class UrnaFunerariaDAO {

    public static ArrayList<UrnaFuneraria> buscaTodos() {
        String sql = "SELECT id, tamanho, categoria, valor FROM urna_funeraria";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            ArrayList<UrnaFuneraria> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String tamanho = rs.getString("tamanho");
                String categoria = rs.getString("categoria");
                float valor = rs.getFloat("valor");
                

                UrnaFuneraria uf = new UrnaFuneraria(tamanho, categoria, valor);
                uf.setId(id);
                lista.add(uf);
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static UrnaFuneraria buscaPorId(int id) {
        String sql = "SELECT tamanho, categoria, valor FROM urna_funeraria WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            UrnaFuneraria uf = null;

            if (rs.next()) {
                String tamanho = rs.getString("tamanho");
                String categoria = rs.getString("categoria");
                float valor = rs.getFloat("valor");
                

                uf = new UrnaFuneraria(tamanho, categoria, valor);
                uf.setId(id);
                
            }
            rs.close();
            if (uf != null) return uf;
            throw new RuntimeException("Urna funerária não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
