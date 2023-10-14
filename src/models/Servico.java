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
public class Servico {

    private int id;
    private TipoServico tipoServico;
    private float valor;
    private Automovel automovel;
    private FornecedorFlores fornecedorFlores;
    private CemiterioCapela cemiterioCapela;
    private UrnaFuneraria urnaFuneraria;
    private Cliente cliente;
    private Defunto defunto;

    public Servico() {
    }

    public Servico(TipoServico tipoServico, float valor, Automovel automovel, FornecedorFlores fornecedorFlores, CemiterioCapela cemiterioCapela, UrnaFuneraria urnaFuneraria, Cliente cliente, Defunto defunto) {

        this.tipoServico = tipoServico;
        this.valor = valor;
        this.automovel = automovel;
        this.fornecedorFlores = fornecedorFlores;
        this.cemiterioCapela = cemiterioCapela;
        this.urnaFuneraria = urnaFuneraria;
        this.cliente = cliente;
        this.defunto = defunto;
    }

    public Cliente getCli() {
        return cliente;
    }

    public void setCli(Cliente cli) {
        this.cliente = cli;
    }

    public Defunto getDef() {
        return defunto;
    }

    public void setDef(Defunto def) {
        this.defunto = def;
    }

    public UrnaFuneraria getUrnaFuneraria() {
        return urnaFuneraria;
    }

    public void setUrnaFuneraria(UrnaFuneraria urnaFuneraria) {
        this.urnaFuneraria = urnaFuneraria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
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
