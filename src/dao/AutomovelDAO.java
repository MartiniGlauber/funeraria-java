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

public class AutomovelDAO {

    public static ArrayList<Automovel> buscaTodos() {
        String sql = "SELECT id, modelo, km, ano_fabricacao FROM automovel";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            ArrayList<Automovel> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String modelo = rs.getString("modelo");
                String km = rs.getString("km");
                String fabricacao = rs.getString("ano_fabricacao");
                

                Automovel aut = new Automovel(modelo, km, fabricacao);
                aut.setId(id);
                lista.add(aut);
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Automovel buscaPorId(int id) {
        String sql = "SELECT modelo, km, ano_fabricacao FROM automovel WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            Automovel aut = null;

            if (rs.next()) {
                String modelo = rs.getString("modelo");
                String km = rs.getString("km");
                String fabricacao = rs.getString("ano_fabricacao");
                

                aut = new Automovel(modelo, km, fabricacao);
                aut.setId(id);
                
            }
            rs.close();
            if (aut != null) return aut;
            throw new RuntimeException("Automovel não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
