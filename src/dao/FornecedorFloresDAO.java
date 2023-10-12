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
import models.FornecedorFlores;

public class FornecedorFloresDAO {

    public static ArrayList<FornecedorFlores> buscaTodos() {
        String sql = "SELECT id, nome, email, telefone, endereco FROM fornecedor_flores";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            ArrayList<FornecedorFlores> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");

                FornecedorFlores ff = new FornecedorFlores(nome, email, telefone, endereco);
                ff.setId(id);
                lista.add(ff);
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static FornecedorFlores buscaPorId(int id) {
        String sql = "SELECT nome, email, telefone, endereco FROM fornecedor_flores WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            FornecedorFlores ff = null;

            if (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");

                ff = new FornecedorFlores(nome, email, telefone, endereco);
                ff.setId(id);
                
            }
            rs.close();
            if (ff != null) return ff;
            throw new RuntimeException("Fornecedor de flores não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
