CREATE DATABASE prueba;
USE DATABASE prueba;

CREATE TABLE prueba1 (id_prueba1 int, float1 float, string1 char(50),
CONSTRAINT pk_id_prueba1 PRIMARY KEY (id_prueba1));


CREATE TABLE prueba2 (id_prueba2 int, float2 float, string2 char(50),
CONSTRAINT pk_id_prueba2 PRIMARY KEY (id_prueba2));


CREATE TABLE prueba3 (id_prueba3 int, float3 float, string3 char(50),
CONSTRAINT pk_id_prueba3 PRIMARY KEY (id_prueba3));


INSERT INTO prueba1 (id_prueba1, float1, string1) VALUES (1, 90.0, 'Hola');
INSERT INTO prueba1 (id_prueba1, float1, string1) VALUES (2, 89.6, 'Hola');
INSERT INTO prueba1 (id_prueba1, float1, string1) VALUES (3, 20.5, 'Hola');
INSERT INTO prueba1 (id_prueba1, float1, string1) VALUES (4, 44.0, 'Hola');



INSERT INTO prueba2 (id_prueba2, float2, string2) VALUES (1, 90.0, 'Hola');
INSERT INTO prueba2 (id_prueba2, float2, string2) VALUES (2, 9.0, 'Hola');
INSERT INTO prueba2 (id_prueba2, float2, string2) VALUES (3, 190.0, 'Hola');
INSERT INTO prueba2 (id_prueba2, float2, string2) VALUES (4, 290.0, 'Hola');


INSERT INTO prueba3 (id_prueba3, float3, string3) VALUES (1, 20.0, 'Hola');
INSERT INTO prueba3 (id_prueba3, float3, string3) VALUES (2, 21.0, 'Hola');
INSERT INTO prueba3 (id_prueba3, float3, string3) VALUES (3, 201.0, 'Hola');
INSERT INTO prueba3 (id_prueba3, float3, string3) VALUES (4, 221.0, 'Hola');