# Ejemplo: paquetes e importaciones de Java

Este ejemplo muestra cómo organizar y utilizar clases de distintos paquetes.

## Por dónde empezar

Ejecuta main en ejemplosdeimportacion/EjemploImportacionDePaquetes.java. Reúne distintas formas de acceder a las clases.

## Contenido

- **suba/A.java**: clase A, accesible mediante import espanol.cp03paquetesyencapsulacion.paquetes.suba.*;
- **suba/subaa/AA.java**: clase AA de un subpaquete, con una importación explícita.
- **subb/B.java**: se utiliza mediante su nombre completo espanol.cp03paquetesyencapsulacion.paquetes.subb.B.
- **subc/C.java**: clase C, accesible mediante otra importación con *.
- **ejemplosdeimportacion/EjemploImportacionDePaquetes.java**: programa que utiliza las cuatro clases.

## Qué recordar

1. package declara el paquete de una clase. Aquí coincide con las carpetas desde la raíz.
2. import permite utilizar un nombre simple, como AA.
3. Una importación con * incluye los tipos accesibles del paquete, pero no los subpaquetes.
4. También puedes utilizar el nombre completo sin importar la clase.

## Al ejecutarlo

El programa crea objetos y llama a imprimir(). Los métodos están vacíos: no aparece texto en consola. Sirven para practicar la estructura y comprobar que las referencias compilan.
