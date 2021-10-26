CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;
CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    sabor_massa VARCHAR(255)NOT NULL,
    massa_fina BOOLEAN,
	tamanho_familia BOOLEAN,
    PRIMARY KEY(id_categoria)
);
CREATE TABLE tb_pizza(
	id_pizza INT AUTO_INCREMENT,
    nome VARCHAR(255),
    preco FLOAT NOT NULL,
    borda_recheada BOOLEAN,
    fk_categoria INT,
    PRIMARY KEY(id_pizza),
    FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria(sabor_massa,massa_fina,tamanho_familia)VALUES
("Salgada",false, true),
("Doce",true,true),
("Salgada", true,true),
("Doce", false, false);

INSERT INTO tb_pizza(nome,preco,borda_recheada,fk_categoria) VALUES
("Calabresa",21.00,true,3),
("Romeu e Julieta",26.95,false,4),
("Cartola", 31.99, false,2),
("Provolone com Cogumelos",55.50,true,1);

SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco > 28 and preco <61;

SELECT nome FROM tb_pizza WHERE nome LIKE '%c%';

SELECT tb_pizza.nome AS "PIZZA", tb_categoria.sabor_massa AS "TIPO", tb_pizza.preco AS "PREÇO"
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria;

SELECT tb_pizza.nome AS "PIZZA", tb_categoria.sabor_massa AS "TIPO", tb_pizza.preco AS "PREÇO"
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria
WHERE tb_categoria.sabor_massa = 'Doce';

