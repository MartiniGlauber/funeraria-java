/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuneraria1irmao.models;
import java.util.ArrayList;

/**
 *
 * @author 182220008
 */
public class Servico {
    private int id;
    private String tipoServico;
    private float valor;
    private Automovel automovel;
    private FornecedorFlores fornecedorFlores;
    private CemiterioCapela cemiterioCapela;
    
    public Servico (String tipoServico, float valor, Automovel automovel, FornecedorFlores fornecedorFlores, CemiterioCapela cemiterioCapela){
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.automovel = automovel;
        this.fornecedorFlores = fornecedorFlores;
        this.cemiterioCapela = cemiterioCapela;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public FornecedorFlores getFornecedorFlores() {
        return fornecedorFlores;
    }

    public void setFornecedorFlores(FornecedorFlores fornecedorFlores) {
        this.fornecedorFlores = fornecedorFlores;
    }

    public CemiterioCapela getCemiterioCapela() {
        return cemiterioCapela;
    }

    public void setCemiterioCapela(CemiterioCapela cemiterioCapela) {
        this.cemiterioCapela = cemiterioCapela;
    }
    
    
}
