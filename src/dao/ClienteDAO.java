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
import models.Cliente;

public class ClienteDAO {

    public static void cadastra(Cliente cli) {
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email, endereco, cidade) VALUES (?,?,?,?,?,?)";

        try ( Connection con = ConnectionFactory.getConnection();  PreparedStatement statement = con.prepareStatement(sql);) {
            statement.setString(1, cli.getNome());
            statement.setString(2, cli.getCpf());
            statement.setString(3, cli.getTelefone());
            statement.setString(4, cli.getEmail());
            statement.setString(5, cli.getEndereco());
            statement.setString(6, cli.getCidade());

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Cliente> buscaTodos() {
        String sql = "SELECT id, nome, cpf, telefone, email, endereco, cidade FROM cliente";

        try ( Connection con = ConnectionFactory.getConnection();  
                PreparedStatement statement = con.prepareStatement(sql);) {
            ArrayList<Cliente> lista = new ArrayList<>();
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                String cidade = rs.getString("cidade");

                Cliente cli = new Cliente(nome, cpf, telefone, email, endereco, cidade);
                cli.setId(id);
                lista.add(cli);
            }
            rs.close();
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static Cliente buscaPorId(int id) {
        String sql = "SELECT nome, cpf, telefone, email, endereco, cidade FROM cliente WHERE id = ?";
        
        try ( Connection con = ConnectionFactory.getConnection();
                PreparedStatement statement = con.prepareStatement(sql);) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            Cliente cli = null;

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                String cidade = rs.getString("cidade");

                cli = new Cliente(nome, cpf, telefone, email, endereco, cidade);
                cli.setId(id);
                
            }
            rs.close();
            if (cli != null) return cli;
            throw new RuntimeException("Cliente não encontrado para o id "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
