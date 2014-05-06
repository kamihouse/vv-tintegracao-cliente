package br.ufcqx.interfaces;
import java.util.ArrayList;

import br.ufcqx.modelo.Cliente;

public interface ICrudCliente {
	public void addCliente(Cliente cliente);
	public void deleteCliente(Cliente cliente);
	public void searchClienteNome(String nome);
	public void searchClienteId(int id);
	public void updateCliente(Cliente cliente); 
	public ArrayList<Cliente> getClientes();
	
}
