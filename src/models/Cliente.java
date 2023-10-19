/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static utils.Validator.isValidString;
import static utils.Validator.isValidCpf;
import errors.ValidationException;


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
    private String cidade;
    
public Cliente(){
    
}
public Cliente (String nome, String cpf, String telefone, String email, String endereco, String cidade) {
    setNome(nome);
    setCpf(cpf);
    setTelefone(telefone);
    setEmail(email);
    setEndereco(endereco);
    setCidade(cidade);
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

    private void setNome(String nome) {
        if (! isValidString(nome)){
            throw new ValidationException("Input para o nome é inválido");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        if (! isValidCpf(cpf)){
            throw new ValidationException("Input para o CPF é inválido");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        if (! isValidString(telefone)){
            throw new ValidationException("Input para o telefone é inválido");
        }
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        if (! isValidString(email)){
            throw new ValidationException("Input para o e-mail é inválido");
        }
        this.email = email;
    }

    public String getEndereco() {
        
        return endereco;
    }

    private void setEndereco(String endereco) {
        if (! isValidString(endereco)){
            throw new ValidationException("Input para o endereço é inválido");
        }
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    private void setCidade(String cidade) {
        if (! isValidString(cidade)){
            throw new ValidationException("Input para o cidade é inválido");
        }
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    

}