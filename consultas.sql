use alfarorecinosayalavillatororamos;

select nombre from tipousuario;
select nombre from facultad;



-- -------------- CUM MAYOR -----------------------
select codigoEstudiante, nombre, edad, genero, intereses, cum, codigoCarrera, codigoUsuario
from estudiante
where cum = (select max(cum) from estudiante);

-- --------------ALUMNOS CON UNA CARRERA ESPECIFICA ---------------------
select codigoEstudiante, e.nombre, edad, genero, intereses, cum, e.codigoCarrera, c.nombre, codigoUsuario
from estudiante e
inner join carrera c on c.nombre = c.nombre;


-- -----------FACULTAD ESPECIFICA ----------------
select codigoEstudiante, e.nombre, edad, genero, intereses, cum, f.nombre, e.codigoCarrera, c.nombre, codigoUsuario
from estudiante e
inner join carrera c on c.nombre = e.nombre
inner join facultad f on f.nombre = e.nombre

-- ------------------CARRERAS CON MAYOR NUMEROS DE MATERIAS ----------------
select c.codigoCarrera, c.nombre, c.cantidadMaterias, c.codigoFacultad, f.nombre 
from carrera c
inner join facultad f on f.nombre = c.nombre
where c.cantidadMaterias = (select max(cantidadMaterias) from carrera)

-- --------ALUMNOS MAYORES DE EDAD ----------------
select *
from estudiante
where edad>= 18

-- -----BUSQUEDA POR CARNET -----------------
select e.codigoEstudiante, e.nombre, e.edad, e.genero, e.cum, e.intereses,
e.codigoCarrera, c.nombre, f.nombre, e.codigoUsuario, u.nombre
from estudiante e
inner join carrera c on c.nombre = c.nombre
inner join facultad f on f.nombre = f.nombre
inner join usuario u on u.nombre  = u.nombre
where e.codigoEstudiante = 1 -- sentencia dao

