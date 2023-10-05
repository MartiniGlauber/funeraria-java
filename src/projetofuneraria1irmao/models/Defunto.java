/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuneraria1irmao.models;

import java.time.LocalDate;
import java.util.ArrayList;

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
    ArrayList<UrnaFuneraria> urnaFuneraria;
       
    public Defunto(String nome, String genero, String urnaFuneraria, LocalDate dataNascimento, LocalDate dataObito){
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.dataObito = dataObito;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataObito() {
        return dataObito;
    }

    public void setDataObito(LocalDate dataObito) {
        this.dataObito = dataObito;
    }
        
}
