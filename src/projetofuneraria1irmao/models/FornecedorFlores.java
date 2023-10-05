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
public class FornecedorFlores {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    
    public FornecedorFlores(String nome, String email, String telefone, String endereco){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void cadastrar(){
        String sql = "INSERT INTO fornecedor_flores (nome, email, telefone, endereco) VALUES ("
                + " '" + this.getNome() + "',"
                + " '" + this.getEmail()+ "'," 
                + " '" + this.getTelefone()+ "',"
                + " '" + this.getEndereco()+ "')";
        Conexao.executar(sql);
        }
}
