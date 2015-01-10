package br.amiguinho.cdi_jsf_ejb.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.amiguinho.cdi_jsf_ejb.ejb.CrudEJB;
import br.amiguinho.cdi_jsf_ejb.entity.Jogador;
import br.amiguinho.cdi_jsf_ejb.entity.Soma;
import br.amiguinho.cdi_jsf_ejb.util.Utilitario;

@Named
@RequestScoped
public class CrudMB implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Jogador> jogadores;
	private Jogador jogador;
	
	@Inject
	private Soma soma;
	
	@Inject
	private CrudEJB crudEJB;
	
	@Inject
	private Utilitario utilitario;
	
	
	
	@PostConstruct
	public void init()
	{
		jogadores = crudEJB.listarJogadores();
	}
	
	public void somar()
	{
		Integer valor1 = getSoma().getValor1();
		Integer valor2 = getSoma().getValor2();
		Integer resultado = utilitario.somar(valor1, valor2);
		getSoma().setResultado(resultado); 
		
		
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Soma getSoma() {
		return soma;
	}

	public void setSoma(Soma soma) {
		this.soma = soma;
	}

}
