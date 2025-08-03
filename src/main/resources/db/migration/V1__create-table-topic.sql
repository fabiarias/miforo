create table topics(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje  varchar(1000) not null,
    fecha date not null,
    estado varchar(25) not null,
    autor varchar(50) not null,
    curso varchar(50) not null,

    primary key(id)
);