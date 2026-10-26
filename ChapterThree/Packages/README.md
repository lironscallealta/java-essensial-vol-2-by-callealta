# Ejemplo: paquetes e importaciones en Java

Esta carpeta contiene un ejemplo de referencia para estudiar cómo se organizan y se usan clases de distintos paquetes.

## Por dónde empezar

Abre `ImportExamples/PackageImportsExample.java` y ejecuta su método `main`. Ese archivo reúne las distintas formas de acceder a las clases de este ejemplo.

## Qué representa cada carpeta

- `subA/A.java`: clase A, utilizada mediante `import ChapterThree.Packages.subA.*;`.
- `subA/subAA/AA.java`: clase AA dentro de un subpaquete, utilizada mediante un import explícito.
- `subB/B.java`: clase B, utilizada mediante su nombre completo: `ChapterThree.Packages.subB.B`.
- `subC/C.java`: clase C, utilizada mediante otro import con `*`.
- `ImportExamples/PackageImportsExample.java`: programa que utiliza las cuatro clases.

## Qué debes recordar

1. `package` declara a qué paquete pertenece una clase. En este proyecto coincide con sus carpetas desde la raíz.
2. `import` permite referirse a una clase mediante su nombre simple, por ejemplo `AA`.
3. Un import con `*` permite usar los tipos accesibles de ese paquete, pero no incluye sus subpaquetes.
4. También puedes escribir el nombre completo de una clase sin importarla.

## Qué pasa al ejecutarlo

El programa crea los objetos y llama a `printMe()`. Los métodos están vacíos, por lo que no aparece texto en la consola. Sirven para practicar la estructura de paquetes y comprobar que las referencias a las clases compilan.
