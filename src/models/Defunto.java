/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import errors.ValidationException;
import java.time.LocalDate;
import static utils.Validator.compareDate;
import static utils.Validator.isValidString;

/**
 *
 * @author 182220008
 */
public class Defunto {
    private int id;
    private String nome;
    private String genero;
    private LocalDate dataNascimento;
    private LocalDate dataObito;
    
       
    public Defunto(String nome, String genero, LocalDate dataNascimento, LocalDate dataObito){
        if (!compareDate(dataNascimento, dataObito)) throw new ValidationException("Data de óbito não pode ser inferior a data de nascimento");
        setNome(nome);
        setGenero(genero);
        setDataNascimento(dataNascimento);
        setDataObito(dataObito);
       
    }
    public Defunto(){
        
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

    private void setNome(String nome) {
        if (! isValidString(nome)){
            throw new ValidationException("Input para o nome é inválido");
        }
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        if (! isValidString(genero)){
            throw new ValidationException("Input para o gênero é inválido");
        }
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    private void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataObito() {
        return dataObito;
    }

    private void setDataObito(LocalDate dataObito) {
        this.dataObito = dataObito;
    }

    @Override
    public String toString() {
        return nome;
    }
    
       
}
