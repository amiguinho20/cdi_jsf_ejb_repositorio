package br.amiguinho.cdi_jsf_ejb.ejb;

import java.util.List;

import javax.ejb.Local;

import br.amiguinho.cdi_jsf_ejb.entity.Jogador;

@Local
public interface CrudEJB {
	
	List<Jogador> listarJogadores();
	
	int somar(int a, int b);

}
