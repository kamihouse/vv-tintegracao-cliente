package br.ufcqx.conexao;
import java.sql.*;

import br.ufcqx.modelo.Cliente;

/**
 * Classe responsável por realizar a conexão com o banco de dados Postgres.
 */
public class ClienteDAO {
	private String url;
	private String banco;
	private String senha;
	private String driver;
	private Connection con;

	
	/**
	 * Construtor ClienteDAO
	 */
	public ClienteDAO() {
		driver = "org.postgresql.Driver";
		url = "jdbc:postgresql://localhost:5432/mpf";
		banco = "postgres";
		senha = "postgres";

		
		/**
		 * Tentando realizar a conexão.
		 */
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, banco, senha);

		} catch (ClassNotFoundException objErroDriver) {
			System.out.println("Erro no carregamento do driver JDBC");

		} catch (SQLException objErroConexao) {

			System.out.println("Erro na Conexao");

		}
	}
	
	
	/**
	 * Adiciona cliente na base de dados.
	 * @param cliente
	 * @throws SQLException 
	 */
	public void adiciona(Cliente cliente) throws SQLException{
		String sql = "INSERT INTO CLIENTES (NOME, ENDERECO, BAIRRO, CIDADE, ESTADO, NUMERO, CEP, CNPJ, CPF, EMAIL, TELEFONE, OBSERVACAO) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
		stmt.setString(1, cliente.getObservacao());
		
		stmt.execute();
		stmt.close();
	}
}
