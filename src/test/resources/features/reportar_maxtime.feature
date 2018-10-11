#language: es
Característica: Reportar mis actividades en el sistema de Registro

  Esquema del escenario: Como analista de pruebas
    Quiero realizar el reporte de mis actividades en MaxTime
    Para cumplir con la tarea que debo llevar a cabo diariamente

    Dado el analista inicia sesion en maxtime con usuario dchavezq y contrasena Cym_6609 para realizar el registro de actividades
    Cuando el analista realiza el filtro por usuario o por dia para realizar el registro de actividades
    Y el realiza el registro de actividades
      | proyecto   | tipoHora   | servicio   | actividad   | horasejecutadas   | comentario   |
      | <proyecto> | <tipoHora> | <servicio> | <actividad> | <horasejecutadas> | <comentario> |
    Entonces ella deberia cumplir con la tarea diariamente

    Ejemplos:
      | proyecto | tipoHora    | servicio                | actividad            | horasejecutadas | comentario           |
      | PMO27453 | H. Proyecto | P. generales CVDS ágiles  | EJECUCIÓN DE PRUEBAS |               8 | Ejecucion de pruebas |
