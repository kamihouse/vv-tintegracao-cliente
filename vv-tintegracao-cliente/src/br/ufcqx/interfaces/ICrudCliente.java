package br.ufcqx.interfaces;
import java.util.ArrayList;

import br.ufcqx.modelo.Cliente;

public interface ICrudCliente {
	public void addCliente(Cliente cliente);
	public void deleteCliente(Cliente cliente);
	public Cliente searchClienteNome(String nome);
	public Cliente searchClienteCpf(String cpf);
	public Cliente searchClienteId(int id);
	public void updateCliente(Cliente selecionado, Cliente dados_alterado); 
	public ArrayList<Cliente> getClientes();
	public ArrayList<Cliente> orderNome(ArrayList<Cliente> clientes);
	public boolean existClienteCpf(String cpf);
}
