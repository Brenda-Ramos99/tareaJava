use AlfaroRecinosAyalaVillatoroRamos;
select * from facultad;
select * from carrera;
select * from estudiante;
select * from usuario;
select * from tipousuario;

insert into facultad (nombre,telefono) values ("Facultad de Ciencias y Humanidades", "2292-4565");
update facultad set nombre="Facultad de Odontología", telefono="2293-6543" where codigoFacultad=1;
delete from facultad where codigoFacultad=2;

insert into carrera (nombre, cantidadMaterias, codigoFacultad) values ("Lenguas Modernas", 40,3);
update carrera set nombre="Lenguas extranjeras", cantidadMaterias=41, codigoFacultad=2 where codigoCarrera=5;
delete from carrera where codigoCarrera=2;
-- desde aca
insert into estudiante (nombre, edad, genero, cum, intereses, codigoCarrera) values ("Elvis", 19,"Masculino", 9.8, "Deportes", 5);
update estudiante set nombre="Efraín", edad=20, genero="Masculino", intereses="Fútbol",codigoCarrera=4 where codigoEstudiante=1;
delete from estudiante where codigoEstudiante=2;

insert into tipoUsuario (nombre) values ("Admin");
update tipoUsuario set nombre="Comun" where codigoTipo=1;
delete from tipoUsuario where codigoTipo=2;

insert into usuario(usuario,contra,nombre,apellido,edad,codigoTipo) values("Bym","123","Elvis","Gómez",19,3);
update usuario set usuario="Bymer", contra="123", nombre="Efraín", apellido="Gómez", edad=20,codigoTipo=1 where codigoUsuario=2;
delete from usuario where codigoUsuario=1;