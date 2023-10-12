/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 182220008
 */
public class UrnaFuneraria {
    private int id;
    private String tamanho;
    private String categoria;
    private float valor;
    
    public UrnaFuneraria(String tamanho, String categoria, float valor){
        this.tamanho = tamanho;
        this.categoria = categoria;   
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public float getValor() {
        return valor;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }    

    @Override
    public String toString() {
        return String.format("%s - %s", tamanho, categoria);
    }
    
    }
