package br.ufcqx.conexao;

import java.sql.*;
import java.util.ArrayList;

import br.ufcqx.modelo.Cliente;

/**
 * Classe responsável por realizar a conexão e consultas com o banco de dados PostgreSQL.
 * @author thiago <thiagor@engineer.com>
 */
public class ClienteDAO {
	private String		url;
	private String		usuario;
	private String		senha;
	private String		driver;
	private Connection	con;
	private String		tabela = "CLIENTES";

	
	/**
	 * Construtor ClienteDAO com JDBC + PostgreSQL.
	 */
	public ClienteDAO() {
		driver	= "org.postgresql.Driver";
		url		= "jdbc:postgresql://localhost:5432/Estoque";
		usuario	= "postgres";
		senha	= "postgres";

		
		/**
		 * Tentando realizar a conexão com o banco de dados.
		 */
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, senha);
			//System.out.println("Conexão realizada com sucesso.");  

		} catch (ClassNotFoundException objErroDriver) {
			System.out.println("Erro no carregamento do driver JDBC");

		} catch (SQLException objErroConexao) {
			System.out.println("Erro na Conexao");
		}
	}

	
	/**
	 * Adiciona cliente na base de dados.
	 * 
	 * @param cliente Objeto Cliente
	 * @return true Add ok
	 * @return false Falha ao Add
	 * @throws SQLException
	 */
	public boolean addCliente(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO "
				+ this.tabela
				+ " (NOME, ENDERECO, BAIRRO, CIDADE, ESTADO, NUMERO, CEP, CNPJ, CPF, EMAIL, TELEFONE, OBSERVACAO)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getEndereco());
		stmt.setString(3, cliente.getBairro());
		stmt.setString(4, cliente.getCidade());
		stmt.setString(5, cliente.getEstado());
		stmt.setInt(6, cliente.getNumero());
		stmt.setString(7, cliente.getCep());
		stmt.setString(8, cliente.getCnpj());
		stmt.setString(9, cliente.getCpf());
		stmt.setString(10, cliente.getEmail());
		stmt.setInt(11, cliente.getTelefone());
		stmt.setString(12, cliente.getObservacao());

		boolean res = stmt.execute();
		stmt.close();

		return res;
	}

	
	/**
	 * Remove cliente na base de dados
	 * 
	 * @param idCliente
	 * @return true Delete ok.
	 * @return false Delete falha.
	 * @throws SQLException
	 */
	public boolean deleteCliente(int idCliente) throws SQLException {
		String sql = "DELETE FROM " + this.tabela + " WHERE ID_CLIENTE = ?";

		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setInt(1, idCliente);

		int res = stmt.executeUpdate();
		stmt.close();
		
		if(res == 1){
			return true;
		} else {
			return false;
		}
	}

	
	/**
	 * Recupera cliente pelo Nome informado.
	 * 
	 * @param nome
	 * @return ArrayList<Cliente>
	 * @return null Se não encontrou cliente
	 * @throws SQLException
	 */
	public ArrayList<Cliente> searchClienteNome(String nome) throws SQLException {
		String sql = "SELECT * FROM " + this.tabela + " WHERE NOME LIKE ?";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, '%' + nome + '%');

		ResultSet rs = stmt.executeQuery();
		
		// Criando uma lista de Cliente.
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		
		while(rs.next()){
			// Adicionando o Cliente encontrado
			Cliente c = new Cliente();
			
			c.setId(rs.getInt("ID_CLIENTE"));
			c.setNome(rs.getString("NOME"));
			c.setEndereco(rs.getString("ENDERECO"));
			c.setBairro(rs.getString("BAIRRO"));
			c.setCidade(rs.getString("CIDADE"));
			c.setEstado(rs.getString("ESTADO"));
			c.setNumero(rs.getInt("NUMERO"));
			c.setCep(rs.getString("CEP"));
			c.setCnpj(rs.getString("CNPJ"));
			c.setCpf(rs.getString("CPF"));
			c.setEmail(rs.getString("EMAIL"));
			c.setTelefone(rs.getInt("TELEFONE"));
			c.setObservacao(rs.getString("OBSERVACAO"));
			
			listaCliente.add(c);
		}
		stmt.close();

		return listaCliente;
	}

	
	/**
	 * Recupera cliente pelo CPF informado.
	 * 
	 * @param cpf CPF do Cliente
	 * @return Cliente
	 * @return null Se cliente não existe
	 * @throws SQLException
	 */
	public Cliente searchClienteCpf(String cpf) throws SQLException {
		String sql = "SELECT * FROM " + this.tabela + " WHERE CPF LIKE ?";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, '%' + cpf + '%');

		ResultSet rs = stmt.executeQuery();
		
		Cliente c = new Cliente();
		
		while(rs.next()){
			// Adicionando o Cliente encontrado
			c.setId(rs.getInt("ID_CLIENTE"));
			c.setNome(rs.getString("NOME"));
			c.setEndereco(rs.getString("ENDERECO"));
			c.setBairro(rs.getString("BAIRRO"));
			c.setCidade(rs.getString("CIDADE"));
			c.setEstado(rs.getString("ESTADO"));
			c.setNumero(rs.getInt("NUMERO"));
			c.setCep(rs.getString("CEP"));
			c.setCnpj(rs.getString("CNPJ"));
			c.setCpf(rs.getString("CPF"));
			c.setEmail(rs.getString("EMAIL"));
			c.setTelefone(rs.getInt("TELEFONE"));
			c.setObservacao(rs.getString("OBSERVACAO"));			
		}
		stmt.close();

		return c;
	}

	
	/**
	 * Recupera cliente pelo ID do Cliente informado.
	 * 
	 * @param idCliente ID do Cliente
	 * @return Cliente
	 * @return null Se cliente não existe
	 * @throws SQLException
	 */
	public Cliente searchClienteId(int idCliente) throws SQLException {
		String sql = "SELECT * FROM " + this.tabela + " WHERE ID_CLIENTE = ?";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, idCliente);

		ResultSet rs = stmt.executeQuery();
		
		Cliente c = new Cliente();
		
		while(rs.next()){
			// Adicionando o Cliente encontrado
			c.setId(rs.getInt("ID_CLIENTE"));
			c.setNome(rs.getString("NOME"));
			c.setEndereco(rs.getString("ENDERECO"));
			c.setBairro(rs.getString("BAIRRO"));
			c.setCidade(rs.getString("CIDADE"));
			c.setEstado(rs.getString("ESTADO"));
			c.setNumero(rs.getInt("NUMERO"));
			c.setCep(rs.getString("CEP"));
			c.setCnpj(rs.getString("CNPJ"));
			c.setCpf(rs.getString("CPF"));
			c.setEmail(rs.getString("EMAIL"));
			c.setTelefone(rs.getInt("TELEFONE"));
			c.setObservacao(rs.getString("OBSERVACAO"));
		}
		stmt.close();

		return c;
	}

	
	/**
	 * Verifica se pelo CPF informado o cliente existe.
	 * 
	 * @param cpf CPF do Cliente
	 * @return true = Cliente existe
	 * @return false = Cliente não existe
	 * @throws SQLException
	 */
	public boolean existClienteCpf(String cpf) throws SQLException {
		String sql = "SELECT * FROM " + this.tabela + " WHERE CPF LIKE ?";

		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setString(1, '%' + cpf + '%');

		ResultSet rs = stmt.executeQuery();
		stmt.close();

		// Verificando se a qtde de resultados da consulta foi nula.
		if (rs.wasNull()) {
			return false;
		} else {
			return true;
		}
	}

}
