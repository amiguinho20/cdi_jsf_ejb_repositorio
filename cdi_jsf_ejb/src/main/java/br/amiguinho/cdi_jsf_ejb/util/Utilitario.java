package br.amiguinho.cdi_jsf_ejb.util;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.amiguinho.cdi_jsf_ejb.ejb.CrudEJB;



@Named
@ApplicationScoped
public class Utilitario {
	
	@Inject
	CrudEJB crudEJB;
	
	public int somar(Integer arg1, Integer arg2)
	{
		int resultado = crudEJB.somar(arg1, arg2);
		return resultado;
	}

}
