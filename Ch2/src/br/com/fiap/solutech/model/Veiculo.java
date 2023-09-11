package br.com.fiap.solutech.model;

import br.com.fiap.solutech.exception.*;

public class Veiculo {

    private String modelo,tpCarroceria,mudancaNoVeiculo;
    private double comprimento,altura,largura,pesoCarga,peso;
    private int eixos;

    public Veiculo(String modelo, String tpCarroceria, String mudancaNoVeiculo, 
    		double peso, double comprimento, double altura, double largura, double pesoCarga, int eixos)throws ValorInvalido{
    	this.modelo = modelo;
    	this.tpCarroceria = tpCarroceria;
    	this.mudancaNoVeiculo = mudancaNoVeiculo;
    	this.peso = peso;
    	if(peso<= 0) {
    		throw new ValorInvalido("O peso deve ser maior que Zero!");
    	}
    	this.comprimento = comprimento;
    	if(comprimento <= 0) {
    		throw new ValorInvalido("O comprimento deve ser maior que Zero!");
    	}
    	this.altura = altura;
    	if(altura<=0) {
    		throw new ValorInvalido("A altura deve ser maior que Zero!");
    	}
    	this.largura = largura;
    	if(largura<=0) {
    		throw new ValorInvalido("A largura deve ser maior que Zero!");
    	}
    	this.pesoCarga = pesoCarga;
    	if(pesoCarga<0) {
    		throw new ValorInvalido("O peso da carga não pode ser menor que zero!");
    	}
    	this.eixos = eixos;
    	if(eixos<4) {
    		throw new ValorInvalido("O caminhão deve ter no minimo Quatro eixos!");
    	}
    }  
    public double calculaPeso(){
        double pesoTotal = peso + pesoCarga;
        return pesoTotal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTpCarroceria() {
        return tpCarroceria;
    }

    public void setTpCarroceria(String tpCarroceria) {
        this.tpCarroceria = tpCarroceria;
    }

    public String getMudancaNoVeiculo() {
        return mudancaNoVeiculo;
    }

    public void setMudancaNoVeiculo(String mudancaNoVeiculo) {
        this.mudancaNoVeiculo = mudancaNoVeiculo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
	
}
