# Capítulo dos: variables, referencias y constructores

Las carpetas temáticas contienen ejemplos. codingtask contiene el ejercicio y tu trabajo en curso.

## Orden de estudio sugerido

1. **variablesandscope/**: variables locales, alcance de bloque e inferencia de tipos.
2. **methods/**: parámetros y argumentos.
3. **referencesandpassbyvalue/**: referencias y paso por valor.
4. **constructors/**: constructores, this y copia de objetos.
5. **codingtask/**: práctica que combina los conceptos.

## Variables y alcance

- LocalVariableExample.java muestra variables declaradas dentro de un método.
- BlockScopeExample.java muestra el alcance dentro de un bloque if.
- VarExample.java muestra la inferencia de tipos con var; requiere Java 10 o posterior.

## Métodos

Ejecuta methods/MethodWithParameters.java: greet recibe un parámetro y se llama con distintos argumentos.

## Referencias y paso por valor

- **ReferenceAssignmentExample.java** (antes Main.java): compara compartir un objeto mediante dos referencias con crear otro objeto con los mismos datos.
- **PassByValueExample.java** (antes PassTest.java): compara modificar un número, reasignar una referencia local y cambiar un campo del objeto referenciado. Java pasa los argumentos por valor, incluso si ese valor es una referencia.
- **Person.java**: clase de apoyo compartida.

Answering.java conserva las respuestas personales de la página 102.

## Constructores

- **ConstructorExample.java**: un constructor sin argumentos llama a otro mediante this(...). Ambos comparten la validación de edad. ExamplePerson está en el mismo archivo.
- **CopyConstructorExample.java** (antes TestPersonTwo.java): PersonTwo.addAge() llama al constructor de copia y crea otra persona con una edad diferente.
- **PersonTwo.java**: clase de apoyo del ejemplo de copia.

## Ejercicios

La organización coincide con chapterthree:

- **codingtask/assignment/codingtaskone/Assignment.java**: instrucciones originales extraídas de los comentarios.
- **codingtask/doing/codingtaskone/CodingTask.java**: implementación en curso, con PersonFour en el mismo archivo.

Para otro ejercicio, crea codingtasktwo tanto en assignment como en doing.
Los ejemplos ejecutables tienen main. Consulta las clases de apoyo para comprenderlos.
