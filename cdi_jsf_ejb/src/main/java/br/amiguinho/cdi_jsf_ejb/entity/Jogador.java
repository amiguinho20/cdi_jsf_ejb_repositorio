package br.amiguinho.cdi_jsf_ejb.entity;

import java.io.Serializable;

public class Jogador implements Serializable, Comparable<Jogador>{

	private static final long serialVersionUID = 1L;

	private String nome;
	private String time;
	
	public Jogador(){}
	
	public Jogador(String nome, String time)
	{
		this.nome = nome;
		this.time = time;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public int compareTo(Jogador o) {
		return getNome().compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", time=" + time + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}



}
