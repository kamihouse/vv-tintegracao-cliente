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
	 * Contrutor da classe Cliente com preenchimento dos parametros obrigatório.
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
	
	
	/**
	 * Construtor da classe Cliente sem parametros.
	 */
	public Cliente(){
		super();
	}
	
	
	/**
	 * Recupera Id do cliente.
	 * @return int id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * Adiciona Id do cliente.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
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
	
	
	/**
	 * Recupera Cep do cliente.
	 * @return String cep
	 */
	public String getCep() {
		return cep;
	}
	
	
	/**
	 * Adiciona Cep do cliente.
	 * @param cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	/**
	 * Recupera Cnpj do cliente.
	 * @return String cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	
	/**
	 * Adiciona Cnpj do cliente.
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	/**
	 * Recupera Cpf do cliente.
	 * @return String cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	
	/**
	 * Adiciona Cpf do cliente.
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	/**
	 * Recupera Número do cliente.
	 * @return int numero
	 */
	public int getNumero() {
		return numero;
	}
	
	
	/**
	 * Adiciona Número do cliente.
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	/**
	 * Recupera Email do cliente.
	 * @return String email
	 */
	public String getEmail() {
		return email;
	}
	
	
	/**
	 * Adiciona Email do cliente.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/**
	 * Recupera Telefone do cliente.
	 * @return int telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	
	
	/**
	 * Adiciona Telefone do cliente.
	 * @param telefone
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	/**
	 * Recupera Observações do cliente.
	 * @return String observacao
	 */
	public String getObservacao() {
		return observacao;
	}
	
	
	/**
	 * Adicionar Observações do cliente.
	 * @param observacao
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}

