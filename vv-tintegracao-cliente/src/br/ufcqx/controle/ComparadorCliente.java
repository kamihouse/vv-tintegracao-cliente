package br.ufcqx.controle;

import java.util.Comparator;
import br.ufcqx.modelo.Cliente;

public class ComparadorCliente implements  Comparator<Cliente>{

	public int compare(Cliente cliente1, Cliente cliente2) {
		return cliente1.getNome().compareTo(cliente2.getNome());
	}


}
