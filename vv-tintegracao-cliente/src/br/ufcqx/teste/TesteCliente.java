package br.ufcqx.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufcqx.controle.GerenciadorCliente;
import br.ufcqx.modelo.Cliente;

public class TesteCliente {

	@Test
	public void testAdicionarCliente() {
		Cliente cliente = new Cliente();
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.getClientes().get(0), cliente);
	}
	
	@Test
	public void testDeletarCliente() {
		Cliente cliente = new Cliente();
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		gerCliente.deleteCliente(cliente);
		assertTrue(gerCliente.getClientes().isEmpty());
	}
	
	@Test
	public void testBuscarClienteNome() {
		Cliente cliente = new Cliente();
		cliente.setNome("Jefferson");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteNome("Jefferson"), cliente);
	}
	
	@Test
	public void testBuscarClienteNomeFalha() {
		Cliente cliente = new Cliente();
		cliente.setNome("Jefferson");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteNome("Jef"), null);
	}

}
