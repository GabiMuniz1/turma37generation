CREATE DATABASE db_escola;

USE db_escola;
CREATE TABLE tb_alunos(
	id_aluno INT auto_increment,
    nome VARCHAR (255),
    matricula VARCHAR (255),
    cpf VARCHAR(255) NOT NULL,
    nota DOUBLE NOT NULL,
    PRIMARY KEY (id_aluno)
    
);

INSERT INTO tb_alunos(nome,matricula,cpf,nota)VALUES
("ArthurL","123","219837651",10.0),
("Renata","123","219837236",9.0),
("ArthurF","123","21983724",8.0),
("Amancio","123","219837533",8.0),
("Marilia","123","21983721",7.0);


SELECT * FROM tb_alunos WHERE nota > 7;

SELECT * FROM tb_alunos WHERE nota < 7;

UPDATE tb_alunos SET nota = 9.0 WHERE id_aluno = 5;