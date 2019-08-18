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
update carrera set nombre="Lenguas extranjeras", cantidadMaterias=41, codigoFacultad=2 where codigoCarrera=1;
delete from carrera where codigoCarrera=0;