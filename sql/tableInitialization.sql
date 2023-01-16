CREATE TABLE IF NOT EXISTS newdb.cliente ( cliente_id INT auto_increment NOT NULL, cognome varchar(100) NULL, gusti varchar(15) NULL, CONSTRAINT cliente_pk PRIMARY KEY (cliente_id);
INSERT INTO newdb.cliente (cognome, gusti) VALUES ('Rossi', 'CLASSICO');
INSERT INTO newdb.cliente (cognome, gusti) VALUES ('De paolo', 'VEGANO');
INSERT INTO newdb.cliente (cognome, gusti) VALUES ('De luca', 'VEGETARIANO');
UPDATE newdb.cliente SET cognome='Rossi', gusti='CLASSICO' WHERE cliente_id=1;
DELETE FROM cliente WHERE cliente_id=3;