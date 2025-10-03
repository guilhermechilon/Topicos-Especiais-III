CREATE TABLE aluno(
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    idade INTEGER NOT NULL
);

INSERT INTO aluno(nome, idade) VALUES
('Lara', 34),
('Gabriel', 28),
('Celia', 64);

SELECT * FROM aluno