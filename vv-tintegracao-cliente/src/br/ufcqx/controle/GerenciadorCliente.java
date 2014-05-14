package br.ufcqx.controle;

import java.util.ArrayList;

import br.ufcqx.interfaces.ICrudCliente;
import br.ufcqx.modelo.Cliente;


public class GerenciadorCliente implements ICrudCliente{
	private ArrayList<Cliente> clientes;
	
	public GerenciadorCliente(){
		clientes = new ArrayList<Cliente>();
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}

	public void deleteCliente(Cliente cliente) {
		clientes.remove(cliente);
	}

	public Cliente searchClienteNome(String nome) {
		for (Cliente cliente : clientes) {
			if(cliente.getNome().equals(nome)){
				return cliente;
			}
		}
		return null;
	}

	public Cliente searchClienteId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente searchClienteCpf(long cpf) {
		// TODO Auto-generated method stub
		return null;
	}
}
