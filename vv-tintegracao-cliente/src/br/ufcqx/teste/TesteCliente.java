package br.ufcqx.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.ufcqx.controle.GerenciadorCliente;
import br.ufcqx.modelo.Cliente;

public class TesteCliente {

	@Test
	public void testAdicionarCliente() throws SQLException {
		Cliente cliente = new Cliente("João", "Rua dos testes", "Bairro dos Testes", "Cidade dos Testes", "Estado dos Testes", "63900-000", null, "12312312312", 213, "joao_teste@testes.com", 88880000, null);
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteCpf("12312312312"), cliente);
	}
	
	@Test
	public void testDeletarCliente() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setNome("Jonas");
		cliente.setCpf("98765432100");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		gerCliente.deleteCliente(cliente);
		assertTrue(gerCliente.getClientes().isEmpty());
	}
	
	@Test
	public void testBuscarClienteNome() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setNome("Jefferson");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteNome("Jefferson"), cliente);
	}
	
	@Test
	public void testBuscarClienteNomeFalha() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setNome("Jefferson");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteNome("Jef"), null);
	}
	
	@Test
	public void testBuscarClienteId() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(4);
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteId(4), cliente);
	}
	
	@Test
	public void testBuscarClienteCpf() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setCpf("058.432.123-80");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.searchClienteCpf("058.432.123-80"), cliente);
	}

	@Test
	public void testExisteClienteCpf() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setCpf("148.233.961-27");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.existClienteCpf("148.233.961-27"), true);
	}
	
	@Test
	public void testExisteClienteCpfErro() throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setCpf("148.233.961-27");
		GerenciadorCliente gerCliente = new GerenciadorCliente();
		gerCliente.addCliente(cliente);
		assertEquals(gerCliente.existClienteCpf("058.432.123-80"), false);
	}

	@Test
	public void testAtualizarCliente() throws SQLException {
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
	public void testAtualizarClienteErro() throws SQLException {
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
	public void testOrdenarClienteNome() throws SQLException {
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
	public void testOrdenarClienteNomeErro() throws SQLException {
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
