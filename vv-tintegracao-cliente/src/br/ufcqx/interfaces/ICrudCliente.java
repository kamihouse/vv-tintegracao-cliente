package br.ufcqx.interfaces;
import java.sql.SQLException;
import java.util.ArrayList;

import br.ufcqx.modelo.Cliente;

public interface ICrudCliente {
	public boolean addCliente(Cliente cliente) throws SQLException;
	public boolean deleteCliente(Cliente cliente);
	public ArrayList<Cliente> searchClienteNome(String nome) throws SQLException;
	public Cliente searchClienteCpf(String cpf) throws SQLException;
	public Cliente searchClienteId(int id) throws SQLException;
	public boolean updateCliente(Cliente selecionado, Cliente dados_alterado) throws SQLException; 
	public ArrayList<Cliente> getClientes() throws SQLException;
	public ArrayList<Cliente> orderNome(ArrayList<Cliente> clientes) throws SQLException;
	public boolean existClienteCpf(String cpf) throws SQLException;
}
