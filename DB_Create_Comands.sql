/*
Linguagem de desenvolvimento JAVA 
Banco de dados Mysql

Interface com usuário: Livre

Saída de dados: arquivo txt seguindo o seguinte formato: Cada linha irá conter um registro, 
os campos dos registros na linha serão separados pelo caracter '#'

Testes automatizados: Quanto maior a cobertura melhor utilizando preferencialmente JUNIT

DADOS:
	Nome
	
	CPF(validar)
	
-Contatos
	Telefone
	Email
	
-Endereço
	CEP(deverá consultar dados através da api pública viacep e preencher o restante dos campos.
	uf
	localidade(cidade)
	bairro
	Logradouro
	Numero
	Complemento
	
	Observações
	
Deverá haver opções de cadastro, edição,exclusão e de exportação dos dados no formato especificado em "Saída de dados". 
Além disso o sistema deverá apresentar uma lista das pessoas cadastradas com opções de filtro e ordenação.
*/

CREATE DATABASE TesteSattra_DB;

USE TesteSattra_DB;
 
CREATE TABLE pessoa (
	id BIGINT(10) AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	telefone VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	cep VARCHAR(255) NOT NULL,
	uf VARCHAR(255) NOT NULL,
	localidade VARCHAR(255) NOT NULL,
	bairro VARCHAR(255) NOT NULL,
	logradouro VARCHAR(255) NOT NULL,
	numero VARCHAR(255) NOT NULL,
	complemento VARCHAR(255),
	observacoes TEXT,
	PRIMARY KEY (id),
	CONSTRAINT UC_Person UNIQUE (nome, cpf, telefone, email)
);

/*   */

INSERT INTO pessoa (nome, cpf, telefone, email, cep, uf, localidade, bairro, logradouro, numero, complemento, observacao)
VALUES ('Fabio H', '123456789', 'fabio@gmail.com', '(47)3333-3333');