# Capítulo cinco — polimorfismo

## Orden de estudio sugerido

1. **Jerarquía de herencia**: abre [Prueba.java](jerarquiadeherencia/Prueba.java). Crea objetos Gerente, Ingeniero, Secretario y Director mediante referencias EjemploEmpleadoDos y llama a obtenerDetalles(). El comentario incluye el diagrama UML del libro.
2. **Conversión ascendente y referencias compartidas**: abre [EjemploReferenciaCompartida.java](conversionascendente/EjemploReferenciaCompartida.java). Dos referencias comparten un objeto Gerente; los cambios de departamento realizados mediante una referencia se observan mediante la otra.
3. **Conversión descendente**: abre [PruebaEmpleado2.java](conversiondescendente/PruebaEmpleado2.java). Compara la conversión ascendente, las conversiones explícitas y las comprobaciones con instanceof antes de llamar a métodos de las subclases.
4. **Arreglos heterogéneos**: abre [ArregloHeterogeneo.java](arregloheterogeneo/ArregloHeterogeneo.java). Guarda distintas subclases de empleado en un arreglo. Los comentarios explican cuatro maneras de inicializarlo. Por ahora, este ejemplo crea el arreglo sin imprimir resultados.

## Ejecutar un ejemplo

Haz clic en uno de los enlaces a archivos Java de arriba para abrirlo en el editor. Selecciona **Run Java** o **Run** sobre su método main. Mantén abierta la carpeta del repositorio como raíz del proyecto Java para que se resuelvan los paquetes y las importaciones.

Las clases de apoyo están en las mismas carpetas temáticas. Estos ejemplos utilizan los paquetes `espanol.cp05polimorfismo`.

[Volver a la guía en español](../README.md) · [Versión en inglés](../../english/cp05polymorphism/README.md)
