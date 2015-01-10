package br.amiguinho.cdi_jsf_ejb.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.amiguinho.cdi_jsf_ejb.entity.Jogador;

@Stateless
public class CrudEJBImpl implements CrudEJB{

	@Override
	public List<Jogador> listarJogadores() {
		List<Jogador> jogadores = new ArrayList<>();
		jogadores.add(new Jogador("Cristiano Ronaldo", "Real Madri"));
		jogadores.add(new Jogador("Lionel Messi", "Barcelona"));
		jogadores.add(new Jogador("Rogerio Ceni", "Sao Paulo"));
		jogadores.add(new Jogador("Cassio", "Corinthians"));
		jogadores.add(new Jogador("Ze Roberto", "Palmeiras"));
		jogadores.add(new Jogador("Edu Dracena", "Santos"));
		jogadores.add(new Jogador("Neymar Jr", "Barcelona"));
		jogadores.add(new Jogador("Garreth Bale", "Real Madri"));
		return jogadores;
	}

	@Override
	public int somar(int a, int b) {
		return a + b;
	}

}
