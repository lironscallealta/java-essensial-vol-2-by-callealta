# Capítulo cinco — polimorfismo

## Orden de estudio sugerido

1. **Jerarquía de herencia**: abre [Prueba.java](jerarquiadeherencia/Prueba.java). Crea objetos Gerente, Ingeniero, Secretario y Director mediante referencias EjemploEmpleadoDos y llama a obtenerDetalles(). El comentario incluye el diagrama UML del libro.
2. **Conversión ascendente y referencias compartidas**: abre [EjemploReferenciaCompartida.java](conversionascendente/EjemploReferenciaCompartida.java). Dos referencias comparten un objeto Gerente; los cambios de departamento realizados mediante una referencia se observan mediante la otra.
3. **Conversión descendente**: abre [PruebaEmpleado2.java](conversiondescendente/PruebaEmpleado2.java). Compara la conversión ascendente, las conversiones explícitas y las comprobaciones con instanceof antes de llamar a métodos de las subclases.
4. **Arreglos heterogéneos**: abre [ArregloHeterogeneo.java](arregloheterogeneo/ArregloHeterogeneo.java). Guarda distintas subclases de empleado en un arreglo. Los comentarios explican cuatro maneras de inicializarlo. Por ahora, este ejemplo crea el arreglo sin imprimir resultados.

## Tareas de codificación

Las instrucciones están en la carpeta asignacion y el código que has avanzado está en desarrollo. Los paquetes, carpetas, clases, métodos y variables de esta versión están en español.

### Tarea 1 — Beca estudiantil

- Lee [Asignacion.java](tareasdecodificacion/asignacion/tareauno/Asignacion.java) para revisar los requisitos y la salida de referencia.
- Continúa en [Estudiante.java](tareasdecodificacion/desarrollo/tareauno/Estudiante.java), [EstudianteBecadoParcial.java](tareasdecodificacion/desarrollo/tareauno/EstudianteBecadoParcial.java) y [Prueba.java](tareasdecodificacion/desarrollo/tareauno/Prueba.java).

### Tarea 2 — El reino animal

- Lee [Asignacion.java](tareasdecodificacion/asignacion/tareados/Asignacion.java) para revisar los requisitos y la salida esperada.
- Continúa en [Animal.java](tareasdecodificacion/desarrollo/tareados/Animal.java), [Perro.java](tareasdecodificacion/desarrollo/tareados/Perro.java), [Gato.java](tareasdecodificacion/desarrollo/tareados/Gato.java) y [Ave.java](tareasdecodificacion/desarrollo/tareados/Ave.java).
- [ReinoAnimal.java](tareasdecodificacion/desarrollo/tareados/ReinoAnimal.java) tiene el método de demostración; [Prueba.java](tareasdecodificacion/desarrollo/tareados/Prueba.java) crea y recorre el arreglo.

## Ejecutar una tarea

Abre el archivo Prueba.java correspondiente y selecciona Run Java o Run sobre su método main. Mantén abierta la carpeta del repositorio como raíz del proyecto Java para que se resuelvan los paquetes y las importaciones.

Las clases de apoyo están en las mismas carpetas temáticas. Estos ejemplos utilizan paquetes bajo espanol.cp05polimorfismo.

## Ejecutar un ejemplo

Haz clic en uno de los enlaces a archivos Java de arriba para abrirlo en el editor. Selecciona **Run Java** o **Run** sobre su método main. Mantén abierta la carpeta del repositorio como raíz del proyecto Java para que se resuelvan los paquetes y las importaciones.

Las clases de apoyo están en las mismas carpetas temáticas. Estos ejemplos utilizan los paquetes `espanol.cp05polimorfismo`.

[Volver a la guía en español](../README.md) · [Versión en inglés](../../english/cp05polymorphism/README.md)
