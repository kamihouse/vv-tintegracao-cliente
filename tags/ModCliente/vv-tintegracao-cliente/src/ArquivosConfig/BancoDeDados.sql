-- SQL para criar tabela CLIENTES na base de dados.
CREATE TABLE CLIENTES (
  ID_CLIENTE	SERIAL			NOT NULL,
  NOME			VARCHAR(100)	NULL,
  ENDERECO		VARCHAR(100)	NULL,
  BAIRRO		VARCHAR(45) 	NULL,
  CIDADE		VARCHAR(45) 	NULL,
  ESTADO		VARCHAR(45) 	NULL,
  NUMERO		INT 			NULL,
  CEP			VARCHAR(45) 	NULL	UNIQUE,
  CNPJ			VARCHAR(45) 	NULL,
  CPF			VARCHAR(45) 	NULL,
  EMAIL			VARCHAR(100) 	NULL,
  TELEFONE		VARCHAR(45) 	NULL,
  OBSERVACAO	VARCHAR(100)  	NULL,
  PRIMARY KEY (ID_CLIENTE));