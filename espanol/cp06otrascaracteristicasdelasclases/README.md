# Capítulo seis — otras características de las clases

Este capítulo está en desarrollo. La guía incluye los ejemplos agregados hasta ahora.

## Orden de estudio sugerido

1. **Miembros estáticos**: ejecuta [EjemploEstatico.java](palabraestatica/EjemploEstatico.java). Compara el contador compartido con el número de serie de cada objeto. El comentario también explica las clases anidadas estáticas. [OtraClase.java](palabraestatica/OtraClase.java) accede al contador desde otra clase. Ejecuta [PruebaEstatico.java](palabraestatica/PruebaEstatico.java) por separado para ver su valor inicial sin crear objetos.
2. **Math y System**: ejecuta [LasClasesMathYSystem.java](clasesutilitarias/LasClasesMathYSystem.java). Accede a los miembros estáticos mediante el nombre de su clase.
3. **Importaciones estáticas**: ejecuta [ImportacionesEstaticas.java](importacionesestaticas/ImportacionesEstaticas.java). Utiliza PI, max y out sin escribir el nombre de la clase que los declara.
4. **Clases envoltorio**: lee [ClaseEnvoltorio.java](clasesenvoltorio/ClaseEnvoltorio.java). Compara int e Integer, boxing y unboxing. Esta clase no tiene método main.
5. **La palabra final**: lee [LaPalabraFinal.java](palabrafinal/LaPalabraFinal.java) para repasar clases, métodos y atributos final. [EstudianteFinal.java](palabrafinal/EstudianteFinal.java) inicializa un atributo final en el constructor. El generador conserva el valor provisional 1; estas clases no tienen método main.

6. **Puntos y métodos de Object**: ejecuta [PruebaPunto.java](pruebapunto/PruebaPunto.java). Repasa equals(), casting, hashCode(), XOR y toString().
7. **Records desde Java 16**: compara [PruebaPuntoJava16EnAdelante.java](pruebapunto/recordsjava16/PruebaPuntoJava16EnAdelante.java) con la clase anterior. Prueba [EjemploRecordEvento.java](pruebapunto/recordsjava16/EjemploRecordEvento.java) para fechas y [EjemploPuntoConMetodo.java](pruebapunto/recordsjava16/EjemploPuntoConMetodo.java) para un método propio. Los accesores no llevan prefijo get.
8. **Enumeraciones**: ejecuta [PlanetasInteriores.java](enumeraciones/PlanetasInteriores.java) para ver constantes numéricas y switch. Continúa con [EjemploEnumPlanetasInteriores.java](enumeraciones/EjemploEnumPlanetasInteriores.java) y [EjemploPlanetaConDatos.java](enumeraciones/EjemploPlanetaConDatos.java). Lee [EjemploPlaneta.java](enumeraciones/EjemploPlaneta.java) y [MasEjemplos.java](enumeraciones/MasEjemplos.java), que no tienen main.
9. **Clases abstractas**: compara [PruebaAnimalAbstracto.java](clasesabstractas/PruebaAnimalAbstracto.java) con [PruebaAnimalAbstractoMejorada.java](clasesabstractas/PruebaAnimalAbstractoMejorada.java). Conservan las dos formas de casting y muestran cómo evitar repetir las acciones comunes. Animal, Ave y Mamifero son sus clases de apoyo.
10. **Interfaces**: ejecuta [InterfazJava.java](interfacesjava/InterfazJava.java) para las constantes y lee [HerenciaDeInterfaces.java](interfacesjava/HerenciaDeInterfaces.java). Ejecuta [EjemploMultiplesInterfaces.java](interfacesjava/EjemploMultiplesInterfaces.java) para combinar una superclase y varias interfaces. Revisa [ObjetoVolador.java](interfacesjava/interfazobjetovolador/ObjetoVolador.java) y [Avion.java](interfacesjava/interfazobjetovolador/Avion.java): son archivos separados y los métodos del avión siguen como borradores.

Los ejemplos con records y variables de patrón en instanceof requieren Java 16 o posterior sin opciones de características preliminares. La clase tradicional Punto también funciona en versiones anteriores.

## Continuar estudiando

Agrega los nuevos ejemplos al paquete del tema correspondiente. Usa nombres de paquetes en minúsculas que coincidan con sus carpetas. Puedes crear otras carpetas temáticas a medida que avances.

Esta versión traduce los ejemplos actuales: nombres propios de clases, métodos y variables, comentarios y mensajes de consola. Se conservan las palabras reservadas y los nombres de las API de Java.

## Ejecutar un ejemplo

Abre un archivo con main y selecciona **Run Java** o **Run** sobre el método. Mantén abierta la carpeta del repositorio como raíz del proyecto. Los paquetes de este capítulo comienzan con espanol.cp06otrascaracteristicasdelasclases.

[Volver a la guía en español](../README.md) · [Versión en inglés](../../english/cp06otherclassfeatures/README.md)
