package br.ufcqx.controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import br.ufcqx.conexao.ClienteDAO;
import br.ufcqx.interfaces.ICrudCliente;
import br.ufcqx.modelo.Cliente;


public class GerenciadorCliente implements ICrudCliente{
	private ClienteDAO clienteDAO;
	private ComparadorCliente meuComparador = new ComparadorCliente();
	
	public GerenciadorCliente(){
		clienteDAO = new ClienteDAO();
	}

	public boolean addCliente(Cliente cliente) throws SQLException {
		return clienteDAO.addCliente(cliente);
	}
	
	/*
	 * Deleta cliente a partir do id e t
	 */
	public boolean deleteCliente(int idCliente) throws SQLException {
		return clienteDAO.deleteCliente(idCliente);
	}

	public ArrayList<Cliente> searchClienteNome(String nome) throws SQLException {
		return clienteDAO.searchClienteNome(nome);
	}

	public Cliente searchClienteId(int id) throws SQLException {
		return clienteDAO.searchClienteId(id);
	}
	
	// ainda é preciso implementar esse método no ClienteDao. Verificar se já foi implementado para alterar este método.
	public boolean updateCliente(Cliente selecionado, Cliente dados_alterado) {
		//deleteCliente(selecionado);
		//addCliente(dados_alterado);
		return true;
	}

	public ArrayList<Cliente> getClientes() {
		return null;
	}

	public Cliente searchClienteCpf(String cpf) throws SQLException {
		return clienteDAO.searchClienteCpf(cpf);
	}

	public ArrayList<Cliente> orderNome(ArrayList<Cliente> listaClientes) {
		Collections.sort(listaClientes, meuComparador);
		return listaClientes;  
	}

	public boolean existClienteCpf(String cpf) throws SQLException {
		return clienteDAO.existClienteCpf(cpf);
	}

	public boolean deleteCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
