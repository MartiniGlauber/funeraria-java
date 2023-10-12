/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author 182220008
 */
public class Automovel {
    private int id;
    private String modelo;
    private String km;
    private String fabricacao;
    
    public Automovel(String modelo, String km, String fabricacao){
        this.modelo = modelo;
        this.km = km;
        this.fabricacao = fabricacao;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    @Override
    public String toString() {
        return modelo;
    }
 
}
