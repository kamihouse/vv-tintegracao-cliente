package br.ufcqx.controle;

import java.util.ArrayList;

import br.ufcqx.interfaces.ICrudCliente;
import br.ufcqx.modelo.Cliente;


public class GerenciadorCliente implements ICrudCliente{
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void addCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCliente(int cliente) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public Cliente searchClienteNome(String nome) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente searchClienteCpf(long cpf) {
		// TODO Auto-generated method stub
		return null;
	}
}
