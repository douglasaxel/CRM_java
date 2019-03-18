create database bancoCRM;
use bancoCRM;

create table usuario(
id_usu int(11) unsigned auto_increment primary key not null,
nome varchar(60) not null,
sobrenome varchar(60) not null,
login varchar(30) not null,
senha varchar(200) not null);

create table cliente(
id_cli int(11) unsigned primary key auto_increment not null,
nome varchar(60) not null,
sobrenome varchar(60) not null,
cpf varchar(200),
data_nasc varchar(200) not null,
endereco varchar(500),
bairro varchar(200),
regiao varchar(60) not null,
telefone varchar(250),
celular varchar(250) not null,
email varchar(400),
descricao varchar(5000),
dia_env varchar(11));

create table emails(
id_emails int(2) unsigned primary key auto_increment not null,
assunto varchar(200) not null,
email varchar(5000) not null);