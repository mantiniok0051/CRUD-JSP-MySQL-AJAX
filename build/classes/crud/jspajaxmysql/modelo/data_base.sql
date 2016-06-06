create database if not exists _comercio;
use _comercio;

create table if not exists productos(
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
)

delimiter //
create procedure insertProducto(
    _nombre varchar(100),
    _descripcion varchar(1000),
    _precio float ,
    _categoria varchar(20) ,
    _detalles varchar(500) ,
    _reviews varchar(1000) ,
    _size int ,
    _color varchar(20) ,
    _imagen_1 varchar(100) ,
    _imagen_2 varchar(100) ,
    _imagen_3 varchar(100) ,
    _imagen_4 varchar(100) ,
    _imagen_5 varchar(100) 
    )begin
insert into productos(nombre, descripcion, precio, categoria, detalles, reviews, size, color, imagen_1, imagen_2, imagen_3, imagen_4, imagen_5)values (_nombre, _descripcion, _precio, _categoria, _detalles, _reviews, _size, _color, _imagen_1, _imagen_2, _imagen_3, _imagen_4, _imagen_5);
end
delimiter;