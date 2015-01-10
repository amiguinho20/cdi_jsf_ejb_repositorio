package br.amiguinho.cdi_jsf_ejb.entity;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Soma implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Integer valor1;
	Integer valor2;
	Integer resultado;
	
	public Soma(){}
	
	public Soma(Integer valor1, Integer valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public Integer getValor1() {
		return valor1;
	}
	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}
	public Integer getValor2() {
		return valor2;
	}
	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	public Integer getResultado() {
		return resultado;
	}
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	

}
