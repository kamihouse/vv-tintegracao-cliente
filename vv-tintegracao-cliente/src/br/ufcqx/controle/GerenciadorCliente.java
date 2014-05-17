package br.ufcqx.controle;

import java.util.ArrayList;
import java.util.Collections;

import br.ufcqx.interfaces.ICrudCliente;
import br.ufcqx.modelo.Cliente;


public class GerenciadorCliente implements ICrudCliente{
	private ArrayList<Cliente> clientes;
	private ComparadorCliente meuComparador = new ComparadorCliente();
	
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
		for (Cliente cliente : clientes) {
			if(cliente.getId() == id){
				return cliente;
			}
		}
		return null;
	}

	public void updateCliente(Cliente selecionado, Cliente dados_alterado) {
		deleteCliente(selecionado);
		addCliente(dados_alterado);
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente searchClienteCpf(long cpf) {
		for (Cliente cliente : clientes) {
			if(cliente.getCpf() == cpf){
				return cliente;
			}
		}
		return null;
	}

	public ArrayList<Cliente> orderNome(ArrayList<Cliente> listaClientes) {
		Collections.sort(listaClientes, meuComparador);
		return listaClientes;  
	}

}
