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
import models.CemiterioCapela;

public class CemiterioCapelaDAO {

    public static ArrayList<CemiterioCapela> buscaTodos() {
        String sql = "SELECT id, nome, email, telefone, endereco FROM cemiterio_capela";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            ArrayList<CemiterioCapela> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");

                CemiterioCapela cc = new CemiterioCapela(nome, email, telefone, endereco);
                cc.setId(id);
                lista.add(cc);
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static CemiterioCapela buscaPorId(int id) {
        String sql = "SELECT nome, email, telefone, endereco FROM cemiterio_capela WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            CemiterioCapela cc = null;

            if (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");

                cc = new CemiterioCapela(nome, email, telefone, endereco);
                cc.setId(id);
                
            }
            rs.close();
            if (cc != null) return cc;
            throw new RuntimeException("Cemitério/Capela não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
