package br.ufcqx.modelo;

import java.sql.SQLException;

import br.ufcqx.controle.GerenciadorCliente;

public class Main {

	public static void main(String[] args) throws SQLException {
		Cliente cliente = new Cliente("Jo�o", "Rua dos testes", "Bairro dos Testes", 
						"Cidade dos Testes", "Estado dos Testes", "63900-000", null, 
						"12312312312", 213, "joao_teste@testes.com", 88880000, null);
		
		GerenciadorCliente gerCli = new GerenciadorCliente();
		//gerCli.addCliente(cliente);	
		//System.out.println("Delete Cliente: " + gerCli.deleteCliente(4));
		
		gerCli.addCliente(cliente);	
		System.out.println("Delete Cliente: " + gerCli.deleteCliente(4));
	}

}
