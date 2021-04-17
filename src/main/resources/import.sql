INSERT INTO tb_terapeuta (nome, email, contato, contato2, crp, endereco, senha) VALUES ('Carlos Frinka', 'carlos@hotmail.com', '11 9999-9999', '11 5566-9898', '12/759.301', 'Av. dos Terapeutas', '$2a$10$1j9vWRKNxJ71RMN.6qITL.nd28ZRhZUsX1o1OASUWN9XHKINmZP36');
INSERT INTO tb_terapeuta (nome, email, contato, contato2, crp, endereco, senha) VALUES ('Mariana Maiko', 'mariana@hotmail.com', '11 9999-9999', '11 5566-9898', '18/987.406', 'Av. dos Programadores', '4561');

INSERT INTO tb_paciente (nome, email, contato, contato2, contato_emergencial, data_nascimento, senha, terapeuta_id) VALUES ('Caick Marques', 'caick@hotmail.com', '11 9999-9999', '11 5566-9898', '11 89897-7879', '08/02/1995', '$2a$10$1j9vWRKNxJ71RMN.6qITL.nd28ZRhZUsX1o1OASUWN9XHKINmZP36', 1);
INSERT INTO tb_paciente (nome, email, contato, contato2, contato_emergencial, data_nascimento, senha, terapeuta_id) VALUES ('Victor Magosso', 'victor@hotmail.com', '11 9999-9999', '11 5566-9898', '11 89897-7879', '08/02/1998', '4567', 1);
INSERT INTO tb_paciente (nome, email, contato, contato2, contato_emergencial, data_nascimento, senha, terapeuta_id) VALUES ('Richard Passos', 'richard@hotmail.com', '11 9999-9999', '11 5566-9898', '11 89897-7879', '08/02/1952', '7418', 2);
--gambiarra para verificar a senha criptografada. Como a senha está sendo cadastrada aqui, ainda vou criptografar
--manualmente. Vai la no metodo main() que to gerando senha criptografada e salvando no db assim... essa criptografia
--vai ser feita na hora do insert no formulario, mas ainda não ta 100%
INSERT INTO tb_postagem (humor, emocao, texto, data, paciente_id) VALUES ('Feliz', 'Ansiedade', 'Ansioso pela entrevista, bla, bla, bla', '2020-07-21T20:59:19Z', 1);
INSERT INTO tb_postagem (humor, emocao, texto, data, paciente_id) VALUES ('Triste', 'Angustia', 'Angustiado por bla, bla, bla', '2020-07-21T20:59:19Z', 2);
