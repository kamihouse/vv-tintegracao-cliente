package br.ufcqx.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	
	@Test
	public void testBuscarClienteId() {
		Cliente cliente = new Cliente();
		cliente.setId(4);
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteId(4), cliente);
	}

	@Test
	public void testAtualizarCliente() {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Jefferson");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Outro");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente1);
		gerCliente.updateCliente(cliente1, cliente2);
		assertEquals(gerCliente.searchClienteNome("Outro"), cliente2);
	}
	
	@Test
	public void testAtualizarClienteErro() {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Jefferson");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Outro");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente1);
		gerCliente.updateCliente(cliente1, cliente2);
		assertEquals(gerCliente.searchClienteNome("Jefferson"), null);
	}
	
	@Test
	public void testOrdenarClienteNome() {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Jefferson");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Outro");
		
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente2);
		gerCliente.addCliente(cliente1);
		
		ArrayList<Cliente> clientes;
		clientes = gerCliente.orderNome(gerCliente.getClientes());
		assertEquals(clientes.get(0), cliente1);
	}
	
	@Test
	public void testOrdenarClienteNomeErro() {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Jefferson");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Outro");
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Ana");
		
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente2);
		gerCliente.addCliente(cliente3);
		gerCliente.addCliente(cliente1);
		
		ArrayList<Cliente> clientes;
		clientes = gerCliente.orderNome(gerCliente.getClientes());
		assertNotEquals(clientes.get(0), cliente1);
	}
}
