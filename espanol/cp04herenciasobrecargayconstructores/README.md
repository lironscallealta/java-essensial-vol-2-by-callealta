# Capítulo cuatro: herencia, sobrecarga y constructores

Cada paquete contiene un ejemplo independiente.

## Orden de estudio sugerido

1. **sinherencia**: campos duplicados de empleado y gerente sin herencia. Ejecuta PrincipalSinHerencia.java.
2. **conherencia**: Gerente extends Empleado, campos heredados, sobrescritura y super.obtenerDetalles(). Ejecuta Principal.java.
3. **sobrecarga**: mismo nombre de método con distintas listas de parámetros. Ejecuta Sobrecarga.java.
4. **argumentosvariables**: argumentos variables, arreglos y sobrecarga. Ejecuta EjemploArgumentosVariables.java y luego Sobrecarga2.java.
5. **encadenamientodeconstructores**: constructores de la jerarquía A -> B -> C. EncadenamientoDeConstructores.java imprime A, B y C en ese orden al crear C.
6. **sobrecargadeconstructores**: sobrecarga y delegación con this(...). Ejecuta EjemploSobrecargaDeConstructores.java. Gerente.java extiende Empleado.java y llama a super(nombre, sueldo).
7. **herenciadeobject**: herencia implícita de Object y versiones predeterminadas de function toString() { [native code] }(), equals() y hashCode(). Ejecuta EjemploHerenciaDeObject.java; Persona.java es su clase de apoyo.

## Herencia de Object

Escribir extends Object es opcional si no se especifica otra superclase. Persona lo omite deliberadamente.

Con Object.equals() predeterminado, dos referencias al mismo objeto son iguales. Dos objetos Persona separados, aunque tengan los mismos datos, no son iguales por defecto.

Los paquetes usan minúsculas y coinciden con las carpetas. Las clases públicas coinciden con los nombres de sus archivos Java.
