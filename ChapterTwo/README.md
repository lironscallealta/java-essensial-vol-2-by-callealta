# Chapter Two — variables, referencias y constructores

Las carpetas de temas contienen ejemplos de referencia. `codingtask` contiene el ejercicio y tu avance.

## Orden sugerido para retomar el capítulo

1. **variablesandscope/**: variables locales, alcance por bloques e inferencia de tipos.
2. **methods/**: parámetros y argumentos.
3. **referencesandpassbyvalue/**: referencias a objetos y paso por valor.
4. **constructors/**: constructores, uso de `this` y copia de objetos.
5. **codingtask/**: práctica que reúne conceptos del capítulo.

## variablesandscope

- Ejecuta `LocalVariableExample.java` para ver variables declaradas dentro de un método.
- Ejecuta `BlockScopeExample.java` para ver el alcance de una variable dentro de un bloque `if`.
- Ejecuta `VarExample.java` para ver cómo Java infiere el tipo de una variable local con `var` (requiere Java 10 o posterior).

## methods

Ejecuta `MethodWithParameters.java`: el método `greet` recibe un parámetro y se llama con distintos argumentos.

## referencesandpassbyvalue

- Ejecuta **ReferenceAssignmentExample.java** (antes `Main.java`): compara dos referencias al mismo objeto con la creación de otro objeto que contiene los mismos datos.
- Ejecuta **PassByValueExample.java** (antes `PassTest.java`): compara cambiar un número, reasignar una referencia dentro de un método y modificar un atributo del objeto referenciado. Java pasa los argumentos por valor, también cuando ese valor es una referencia.
- **Person.java** es la clase de apoyo compartida por los dos ejemplos.

Las respuestas personales del libro (página 102) siguen al final de `ReferenceAssignmentExample.java`, dentro de un comentario.

## constructors

- Ejecuta **ConstructorExample.java**: un constructor sin argumentos llama a otro mediante `this(...)`, y ambos comparten la validación de edad. La clase de apoyo `ExamplePerson` está en el mismo archivo.
- Ejecuta **CopyConstructorExample.java** (antes `TestPersonTwo.java`): utiliza `PersonTwo.addAge()`, que llama al constructor de copia para crear otra persona con una edad distinta.
- **PersonTwo.java** es la clase de apoyo del ejemplo de copia.

## codingtask

Se mantiene el mismo formato que en chapterthree:

- **assignment/codingtaskone/README.md**: enunciado original del ejercicio, extraído de los comentarios existentes.
- **doing/codingtaskone/CodingTask.java**: tu implementación actual. Incluye la clase de apoyo `PersonFour` en el mismo archivo.

Este capítulo tiene una tarea. Para agregar otra, crea `codingtasktwo` dentro de `assignment` y de `doing`.

Los ejemplos que se ejecutan tienen un método `main`. Las clases de apoyo se consultan para entender cómo funciona cada ejemplo.
