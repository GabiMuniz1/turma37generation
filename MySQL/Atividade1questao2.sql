CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id_produto INT auto_increment ,
    preco double NOT NULL,
    estoque INT,
    marca VARCHAR(255),
    nome varchar(255),
	primary key(id_produto)
    
);

INSERT INTO tb_produtos(preco,estoque,marca,nome) VALUES
(20.00, 20, "Marisa", "camisa"),
(849.00, 20, "Marisa", "sutia"),
(233.00, 20, "Marisa", "Short"),
(213.00, 20, "Marisa", "calça"),
(24.00, 20, "Marisa", "saia"),
(654.00, 20, "Marisa", "chaéu de praia"),
(67.00, 20, "Marisa", "bolsa"),
(27.00, 20, "Marisa", "carteira");

-- SELECIONE TUDO DENTRO DE PRODUTOS QUE TEM MAIOR QUE 500
SELECT * FROM tb_produtos WHERE preco > 500.00;

SELECT*FROM tb_produtos WHERE preco<500;

UPDATE tb_produtos SET estoque = 40 WHERE id_produto = 8;

-- SELECT * FROM tb_produtos;