DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;


CREATE TABLE fabricantes (
codigo int auto_increment,
nombre nvarchar(100),
PRIMARY KEY (codigo)
);

INSERT INTO fabricantes (nombre) VALUES ('Fabricante 1');
INSERT INTO fabricantes (nombre) VALUES ('Fabricante 2');
INSERT INTO fabricantes (nombre) VALUES ('Fabricante 3');
INSERT INTO fabricantes (nombre) VALUES ('Fabricante 4');

CREATE TABLE articulos (
codigo int auto_increment,
nombre nvarchar(100),
precio int,
codigo_fabricante int ,
PRIMARY KEY (codigo),
FOREIGN KEY (codigo_fabricante) REFERENCES Fabricantes(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO articulos (nombre, precio, codigo_fabricante) VALUES ('Articulo 1', 100, 1);
INSERT INTO articulos (nombre, precio, codigo_fabricante) VALUES ('Articulo 2', 150, 2);
