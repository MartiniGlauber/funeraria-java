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
public class UrnaFuneraria {
    private int id;
    private String tamanho;
    private String categoria;
    
    public UrnaFuneraria(String tamanho, String categoria){
        this.tamanho = tamanho;
        this.categoria = categoria;        
    }

    public int getId() {
        return id;
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
    
    
}
