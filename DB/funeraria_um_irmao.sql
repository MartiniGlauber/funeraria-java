CREATE DATABASE IF NOT EXISTS funeraria_um_irmao;
USE funeraria_um_irmao;
CREATE TABLE IF NOT EXISTS cliente (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (25) NOT NULL,
cpf VARCHAR (25) NOT NULL,
telefone VARCHAR (25) NOT NULL,
email VARCHAR (25) NOT NULL,
endereco VARCHAR (25) NOT NULL,
cidade VARCHAR (25) NOT NULL
);
CREATE TABLE IF NOT EXISTS defunto (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (25) NOT NULL,
genero VARCHAR (25) NOT NULL,
data_nascimento DATE NOT NULL,
data_obito DATE NOT NULL
);
CREATE TABLE IF NOT EXISTS automovel (
id INT PRIMARY KEY AUTO_INCREMENT,
modelo VARCHAR (25) NOT NULL,
km VARCHAR (15) NOT NULL,
ano_fabricacao VARCHAR (4) NOT NULL
);
CREATE TABLE IF NOT EXISTS fornecedor_flores (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (25) NOT NULL,
email VARCHAR (50) NOT NULL,
telefone VARCHAR (25) NOT NULL,
endereco VARCHAR (50) NOT NULL
);
CREATE TABLE IF NOT EXISTS cemiterio_capela (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (25) NOT NULL,
email VARCHAR (50) NOT NULL,
telefone VARCHAR (25) NOT NULL,
endereco VARCHAR (50) NOT NULL
);
CREATE TABLE IF NOT EXISTS urna_funeraria (
id INT PRIMARY KEY AUTO_INCREMENT,
tamanho VARCHAR (15) NOT NULL,
categoria VARCHAR (15) NOT NULL
);
CREATE TABLE IF NOT EXISTS servico (
id INT PRIMARY KEY AUTO_INCREMENT,
idCliente INT NOT NULL,
idDefunto INT NOT NULL,
tipo_servico VARCHAR (15) NOT NULL,
valor FLOAT (5,2) NOT NULL,
idAutomovel INT NOT NULL,
idFornecedor_flores INT NOT NULL,
idCemiterio_capela INT NOT NULL,
idUrna_funeraria INT NOT NULL,
CONSTRAINT FK_cliente_servico FOREIGN KEY (idCliente) REFERENCES cliente(id),
CONSTRAINT FK_defunto_servico FOREIGN KEY (idDefunto) REFERENCES defunto(id),
CONSTRAINT FK_automovel_servico FOREIGN KEY (idAutomovel) REFERENCES automovel(id),
CONSTRAINT FK_fornecedor_flores_servico FOREIGN KEY (idFornecedor_flores) REFERENCES fornecedor_flores(id),
CONSTRAINT FK_cemiterio_capela_servico FOREIGN KEY (idCemiterio_capela) REFERENCES cemiterio_capela(id),
CONSTRAINT FK_urna_funeraria_servico FOREIGN KEY (idUrna_funeraria) REFERENCES urna_funeraria(id)
);

INSERT INTO automovel (modelo, km, ano_fabricacao) VALUES ("Saveiro", "15000", "2020"), ("Montana", "18000", "2021"), ("Strada", "15000", "2020");
INSERT INTO fornecedor_flores (nome, email, telefone, endereco) VALUES 
("floricultura abc", "floricultura1@email.com", "51 30212223", "Porto Alegre ZN"), 
("floricultura zyx", "floricultura2@email.com", "51 30216543", "Porto Alegre ZL"),
("floricultura gpt", "floricultura3@email.com", "51 30219876", "Porto Alegre ZS")
;
INSERT INTO cemiterio_capela (nome, email, telefone, endereco) VALUES 
("Capela ZN", "capelaZN@email.com", "51 30213216", "Porto Alegre ZN"), 
("capela ZL", "capelaZL@email.com", "51 30214567", "Porto Alegre ZL"),
("capela ZS", "capelaZS@email.com", "51 30217894", "Porto Alegre ZS")
;
INSERT INTO urna_funeraria (tamanho, categoria) VALUES 
("Infantil", "Standard"), 
("Infantil", "Luxo"), 
("Adulto", "Standard"), 
("Adulto", "Luxo") 
;
