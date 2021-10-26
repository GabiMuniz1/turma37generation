CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;
CREATE TABLE tb_classe(
	id_classes INT AUTO_INCREMENT,
    ataque_forca FLOAT NOT NULL,
    classe_armadura FLOAT NOT NULL,
    classe_personagem VARCHAR(255),
    PRIMARY KEY (id_classes)
);
CREATE TABLE tb_personagens(
	id_personagem INT AUTO_INCREMENT,
    nome VARCHAR(255),
    fk_classe INT,
	itens_iniciais VARCHAR(255),
    nivel INT,
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classes)
);

INSERT INTO tb_classe(ataque_forca,classe_armadura,classe_personagem)VALUES
(700.7,1272.9,"Guerreiro"),
(3000.3,1982.2,"Paladino"),
(1000.6,9832.9,"Druida"),
(2000.4,5261.9,"Necromante");

INSERT INTO tb_personagens(nome,fk_classe,itens_iniciais,nivel) VALUES
("VinteMatar",3, "kit de druída",3),
("Euponts",4, "kit de necromante",4),
("MTEG",1, "kit de guerreiro",1),
("Jureg",2, "kit de paladino",5);

SELECT tb_personagens.nome, tb_classe.classe_personagem,tb_classe.ataque_forca
FROM tb_personagens
INNER JOIN tb_classe ON tb_personagens.fk_classe = tb_classe.id_classes
WHERE tb_classe.ataque_forca>2000;

SELECT tb_personagens.nome, tb_classe.classe_personagem,tb_classe.classe_armadura
FROM tb_personagens
INNER JOIN tb_classe ON tb_personagens.fk_classe = tb_classe.id_classes
WHERE tb_classe.classe_armadura >999 AND tb_classe.classe_armadura<2001;

SELECT nome FROM tb_personagens WHERE nome LIKE '%c%';

SELECT tb_personagens.nome, tb_classe.classe_personagem
FROM tb_personagens
INNER JOIN tb_classe ON tb_personagens.fk_classe = tb_classe.id_classes
WHERE tb_classe.classe_personagem = "Paladino";