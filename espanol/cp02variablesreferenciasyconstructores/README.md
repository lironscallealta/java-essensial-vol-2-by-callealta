# Capítulo dos: variables, referencias y constructores

Las carpetas temáticas contienen ejemplos. ejercicios contiene el ejercicio y tu trabajo en curso.

## Orden de estudio sugerido

1. **variablesyalcance/**: variables locales, alcance de bloque e inferencia de tipos.
2. **metodos/**: parámetros y argumentos.
3. **referenciasypasoporvalor/**: referencias y paso por valor.
4. **constructores/**: constructores, this y copia de objetos.
5. **ejercicios/**: práctica que combina los conceptos.

## Variables y alcance

- EjemploVariableLocal.java muestra variables declaradas dentro de un método.
- EjemploAlcanceDeBloque.java muestra el alcance dentro de un bloque if.
- EjemploInferenciaDeTipos.java muestra la inferencia de tipos con var; requiere Java 10 o posterior.

## Métodos

Ejecuta metodos/MetodoConParametros.java: saludar recibe un parámetro y se llama con distintos argumentos.

## Referencias y paso por valor

- **EjemploAsignacionDeReferencias.java** (antes Principal.java): compara compartir un objeto mediante dos referencias con crear otro objeto con los mismos datos.
- **EjemploPasoPorValor.java** (antes PassTest.java): compara modificar un número, reasignar una referencia local y cambiar un campo del objeto referenciado. Java pasa los argumentos por valor, incluso si ese valor es una referencia.
- **Persona.java**: clase de apoyo compartida.

Respuestas.java conserva las respuestas personales de la página 102.

## Constructores

- **EjemploConstructor.java**: un function Object() { [native code] } sin argumentos llama a otro mediante this(...). Ambos comparten la validación de edad. PersonaDeEjemplo está en el mismo archivo.
- **EjemploConstructorDeCopia.java** (antes TestPersonTwo.java): PersonaDos.agregarEdad() llama al function Object() { [native code] } de copia y crea otra persona con una edad diferente.
- **PersonaDos.java**: clase de apoyo del ejemplo de copia.

## Ejercicios

La organización coincide con cp03paquetesyencapsulacion:

- **ejercicios/enunciados/ejerciciouno/Enunciado.java**: instrucciones originales extraídas de los comentarios.
- **ejercicios/desarrollo/ejerciciouno/EjercicioProgramacion.java**: implementación en curso, con PersonaCuatro en el mismo archivo.

Para otro ejercicio, crea ejerciciodos tanto en enunciados como en desarrollo.
Los ejemplos ejecutables tienen main. Consulta las clases de apoyo para comprenderlos.
