create database if not exists _comercio;
use _comercio;

create table if not exists productos{
	id_producto int auto_increment primary key,
    nombre varchar(100) not null,
    descripcion varchar(1000) not null,
    precio float not null,
    categoria varchar(20) not null,
    detalles varchar(500) not null,
    reviews varchar(1000) not null,
    size int not null,
    color varchar(20) not null,
    imagen_1 varchar(100) not null,
    imagen_2 varchar(100) not null,
    imagen_3 varchar(100) not null,
    imagen_4 varchar(100) not null,
    imagen_5 varchar(100) not null
}