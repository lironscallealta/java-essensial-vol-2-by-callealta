# Capítulo cuatro: herencia, sobrecarga y constructores

Cada paquete contiene un ejemplo independiente.

## Orden de estudio sugerido

1. **withoutinheritance**: campos duplicados de empleado y gerente sin herencia. Ejecuta MainWithOutInheritance.java.
2. **withinheritance**: Manager extends Employee, campos heredados, sobrescritura y super.getDetails(). Ejecuta Main.java.
3. **overloading**: mismo nombre de método con distintas listas de parámetros. Ejecuta Overloading.java.
4. **varargs**: argumentos variables, arreglos y sobrecarga. Ejecuta VarargsExample.java y luego Overloading2.java.
5. **constructorchaining**: constructores de la jerarquía A -> B -> C. ConstructorChaining.java imprime A, B y C en ese orden al crear C.
6. **constructoroverloading**: sobrecarga y delegación con this(...). Ejecuta OverloadingConstructorExample.java. Manager.java extiende Employee.java y llama a super(name, salary).
7. **objectinheritance**: herencia implícita de Object y versiones predeterminadas de toString(), equals() y hashCode(). Ejecuta ObjectInheritanceExample.java; Person.java es su clase de apoyo.

## Herencia de Object

Escribir extends Object es opcional si no se especifica otra superclase. Person lo omite deliberadamente.

Con Object.equals() predeterminado, dos referencias al mismo objeto son iguales. Dos objetos Person separados, aunque tengan los mismos datos, no son iguales por defecto.

Los paquetes usan minúsculas y coinciden con las carpetas. Las clases públicas coinciden con los nombres de sus archivos Java.
