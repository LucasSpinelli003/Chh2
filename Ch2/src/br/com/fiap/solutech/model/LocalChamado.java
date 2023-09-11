package br.com.fiap.solutech.model;

public class LocalChamado {

    private String endereco;
    private String pontoDeReferencia;

    public LocalChamado(String endereco, String pontoDeReferencia) {
        this.endereco = endereco;
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
    	this.pontoDeReferencia = pontoDeReferencia;
    }	
}
