/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuneraria1irmao.models;

/**
 *
 * @author 182220008
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    

public Cliente (String nome, String cpf, String telefone, String email, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
}
public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void cadastrar(){
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email, endereco) VALUES ("
                + "'" + this.getNome() + "',"
                + "'" + this.getCpf()+ "'," 
                + "'" + this.getTelefone()+ "',"
                + "'" + this.getEmail()+ "',"
                + "'" + this.getEndereco()+ "')";
        
    }

}