/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDate;
import java.util.ArrayList;
import models.Defunto;
import errors.ErroSql;

public class DefuntoDAO {

    public static void cadastra(Defunto def) {
        String sql = "INSERT INTO defunto (nome, genero, data_nascimento, data_obito) VALUES (?,?,?,?)";

        try ( Connection con = ConnectionFactory.getConnection();  PreparedStatement statement = con.prepareStatement(sql);) {
            statement.setString(1, def.getNome());
            statement.setString(2, def.getGenero());
            statement.setDate(3, Date.valueOf(def.getDataNascimento()));
            statement.setDate(4, Date.valueOf(def.getDataObito()));

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Defunto> buscaTodos() {
        String sql = "SELECT id, nome, genero, data_nascimento, data_obito FROM defunto";

        try ( Connection con = ConnectionFactory.getConnection();  
                PreparedStatement statement = con.prepareStatement(sql);) {
            ArrayList<Defunto> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String genero = rs.getString("genero");
                LocalDate dataNascimento = rs.getDate("data_nascimento").toLocalDate();
                LocalDate dataObito = rs.getDate("data_obito").toLocalDate();

                Defunto def = new Defunto(nome, genero, dataNascimento, dataObito);
                def.setId(id);
                lista.add(def);
            }
            rs.close();
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static Defunto buscaPorId(int id) {
        String sql = "SELECT nome, genero, data_nascimento, data_obito FROM defunto WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            Defunto def = null;

            if (rs.next()) {
                String nome = rs.getString("nome");
                String genero = rs.getString("genero");
                LocalDate dataNascimento = rs.getDate("data_nascimento").toLocalDate();
                LocalDate dataObito = rs.getDate("data_obito").toLocalDate();

                def = new Defunto(nome, genero, dataNascimento, dataObito);
                def.setId(id);
                
            }
            rs.close();
            if (def != null) return def;
            throw new RuntimeException("Defunto não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void editaDefunto(Defunto def) {
        String sql = "UPDATE defunto SET nome =?, genero =?, data_nascimento=?, data_obito=? WHERE id = ?";

        try ( Connection con = ConnectionFactory.getConnection();  PreparedStatement statement = con.prepareStatement(sql);) {
            statement.setString(1, def.getNome());
            statement.setString(2, def.getGenero());
            statement.setDate(3, Date.valueOf(def.getDataNascimento()));
            statement.setDate(4, Date.valueOf(def.getDataObito()));
            statement.setInt(5, def.getId());

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void excluiDefunto(Defunto def) {
        String sql = "DELETE FROM defunto WHERE id = ?";

        try ( Connection con = ConnectionFactory.getConnection();  PreparedStatement statement = con.prepareStatement(sql);) {
            
            statement.setInt(1, def.getId());

            statement.execute();

        } catch (SQLIntegrityConstraintViolationException erroSql){
            throw new ErroSql("Não foi possível excluir defunto pois este possui serviço atrelado.");
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
