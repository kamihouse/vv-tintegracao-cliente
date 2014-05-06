package br.ufcqx.modelo;

/**
 * Classe Cliente.
 * Modelo que gerencia clientes.
 * @author matheus, jefferson, thiago
 * @version 1.0
 */
public class Cliente {
	
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String cnpj;
	private String cpf;
	private int numero;
	private String email;
	private int telefone;
	private String observacao;
	private int id;
	
	/**
	 * Contrutor da classe Cliente.
	 * @param nome
	 * @param endereco
	 * @param bairro
	 * @param cidade
	 * @param estado
	 * @param cep
	 * @param cnpj
	 * @param cpf
	 * @param numero
	 * @param email
	 * @param telefone
	 * @param observacao
	 * @param id
	 */
	public Cliente(String nome, String endereco, String bairro, String cidade,
			String estado, String cep, String cnpj, String cpf, int numero,
			String email, int telefone, String observacao, int id) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.numero = numero;
		this.email = email;
		this.telefone = telefone;
		this.observacao = observacao;
		this.id = id;
	}
	
	public Cliente(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	/**
	 * Recupera Nome do cliente.
	 * @return String nome
	 */
	public String getNome() {
		return nome;
	}
	
	
	/**
	 * Adiciona Nome do cliente.
	 * @param String nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
	 * Recupera Endereço do cliente.
	 * @return String endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	
	
	/**
	 * Adiciona Endereço do cliente.
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	/**
	 * Recupera Bairro do cliente.
	 * @return String bairro
	 */
	public String getBairro() {
		return bairro;
	}
	
	
	/**
	 * Adiciona Bairro do cliente.
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	/**
	 * Recupera Cidade do cliente.
	 * @return String cidade
	 */
	public String getCidade() {
		return cidade;
	}
	
	
	/**
	 * Adiciona Cidade do cliente.
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	/**
	 * Recupera Estado do cliente.
	 * @return String estado
	 */
	public String getEstado() {
		return estado;
	}
	
	
	/**
	 * Adiciona Estado do cliente.
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}

