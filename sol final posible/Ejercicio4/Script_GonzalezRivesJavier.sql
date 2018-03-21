use gestionproyectos;
#1
select count(*) as 'numero empleados cordoba' from gestionproyectos.departamento
where ciudad = "cordoba";
#2
select min(year(fecha_ingreso)) as 'mas antiguo',max(year(fecha_ingreso)) as 'mas nuevo' from gestionproyectos.empleado
where cddep = "02";
#3
select sum(nhoras) as horas, cdemp from gestionproyectos.trabaja
where cdpro = "dag" group by cdemp;
#4
select round(avg(nhoras),2) as 'promedio de horas', cdpro from gestionproyectos.trabaja 
where cdpro = "dag" or cdpro = "gre" group by cdpro;
#5
select count(*) as 'numero de empleados', cdjefe from gestionproyectos.empleado
where cdjefe is not null
group by cdjefe order by count(*);
#6
select count(*) as 'numero de empleados', cdjefe from gestionproyectos.empleado
where cdjefe is not null
group by cdjefe order by count(*)
limit 2;
#7
select count(*) as 'numero de empleados sin jefe' from gestionproyectos.empleado
where cdjefe is null;
#8
select count(*) as 'total de departamentos', ciudad from gestionproyectos.departamento
group by ciudad;
#9
select count(*) as 'departamenos(dos o mas)', ciudad from gestionproyectos.departamento
group by ciudad having count(*) >= 2;
#10
select cdpro,round(avg(nhoras)) as 'promedio de horas',count(cdemp) as 'numero de empleados' from gestionproyectos.trabaja
group by cdpro order by avg(nhoras) desc;














