create database sofkaDB

CREATE TABLE tripulante (id int(8) AUTO_INCREMENT PRIMARY KEY, cedula Varchar(12), nombre Varchar(30), rol Varchar(30))

CREATE TABLE VhLanzadera (id int(8) AUTO_INCREMENT PRIMARY KEY,agencia Varchar(30), tipoCombustible Varchar(30), empuje int(8), velocidad int(8), capacidadCarga int(8))

INSERT INTO `vhlanzadera`(`id`, `agencia`, `tipoCombustible`, `empuje`, `velocidad`, `capacidadCarga`) VALUES ('','nasa','nitrogeno','30000','35000','115')

INSERT INTO `vhlanzadera`(`id`, `agencia`, `tipoCombustible`, `empuje`, `velocidad`, `capacidadCarga`) VALUES ('','nasa','oxigeno liquido','32000','36000','126')

INSERT INTO `vhlanzadera`(`id`, `agencia`, `tipoCombustible`, `empuje`, `velocidad`, `capacidadCarga`) VALUES ('','spacex','oxigeno liquido','34000','35000','130')

CREATE TABLE VhNotripulado (id int(8) AUTO_INCREMENT PRIMARY KEY,agencia Varchar(30), tipoCombustible Varchar(30), empuje int(8), velocidad int(8), capacidadCarga int(8))

INSERT INTO `vhnotripulado`(`id`, `agencia`, `tipoCombustible`, `empuje`, `velocidad`, `capacidadCarga`) VALUES ('','eei','nitrogeno','30000','35000','115')

INSERT INTO `vhnotripulado`(`id`, `agencia`, `tipoCombustible`, `empuje`, `velocidad`, `capacidadCarga`) VALUES ('','nasa','oxigeno liquido','32000','36000','126')

INSERT INTO `vhnotripulado`(`id`, `agencia`, `tipoCombustible`, `empuje`, `velocidad`, `capacidadCarga`) VALUES ('','spacex','nitrogeno','34000','35000','130')