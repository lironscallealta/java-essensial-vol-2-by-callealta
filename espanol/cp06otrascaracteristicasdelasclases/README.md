# Capítulo seis — otras características de las clases

Esta versión en español incluye todos los ejemplos actuales del capítulo 6 en inglés. Los ejercicios y métodos que están incompletos en el original conservan su estado.

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

11. **Un método que recibe una interfaz**: ejecuta [Principal.java](ejemplointerfaz/Principal.java). Telefono y Bateria implementan Recargable. El método cargar recibe cualquiera de esos objetos y llama a su implementación de recargar.
12. **Métodos default**: lee [Animal.java](interfazpredeterminada/ejemplouno/Animal.java) y [Mamifero.java](interfazpredeterminada/ejemplouno/Mamifero.java) para ver una implementación heredada desde una interfaz. Ejecuta [InterfazPredeterminada.java](interfazpredeterminada/metodopredeterminado/InterfazPredeterminada.java) para sobrescribirla y llamar a la versión original con MiInterfaz.super. Ejecuta [HerenciaMultipleDeInterfacesPredeterminadas.java](interfazpredeterminada/metodopredeterminado/HerenciaMultipleDeInterfacesPredeterminadas.java) para resolver dos métodos default con la misma firma.
13. **Métodos estáticos de interfaces**: ejecuta [InterfazEstatica.java](metodoestaticodeinterfaz/InterfazEstatica.java) y lee [MiInterfaz.java](metodoestaticodeinterfaz/MiInterfaz.java). Compara la llamada mediante un objeto con la llamada mediante el nombre de la interfaz.
14. **Métodos privados de interfaces**: ejecuta [InterfazEstatica.java](metodosprivadoseninterfaces/InterfazEstatica.java) y lee [MiInterfaz.java](metodosprivadoseninterfaces/MiInterfaz.java). Un método default y uno estático reutilizan el mismo método auxiliar privado.
15. **Interfaces funcionales y lambdas**: ejecuta [EjemploLambda.java](interfazfuncionalylambda/EjemploLambda.java) para los saludos, [OtroEjemploLambda.java](interfazfuncionalylambda/OtroEjemploLambda.java) para parámetros y retorno, y [EjemploLambda2.java](interfazfuncionalylambda/EjemploLambda2.java) para comparar expresiones y bloques con return.
16. **Clases e interfaces selladas**: lee [EjemploSellado.java](clasesselladas/ejemplobasico/EjemploSellado.java) para estudiar sealed, permits, final y non-sealed. Ejecuta [Principal.java](clasesselladas/Principal.java) para describir círculos y rectángulos.
17. **Respuestas**: [Respuestas.java](Respuestas.java) conserva tus selecciones y las preguntas pendientes del archivo en inglés. La traducción no las corrige ni completa.

Para compilar todos los ejemplos del capítulo usa **Java 17 o posterior**. Los métodos privados de interfaces requieren Java 9; los records y las variables de patrón en instanceof requieren Java 16; las clases e interfaces selladas requieren Java 17, sin opciones de características preliminares.

## Continuar estudiando

Agrega los nuevos ejemplos al paquete del tema correspondiente. Usa nombres de paquetes en minúsculas que coincidan con sus carpetas. Puedes crear otras carpetas temáticas a medida que avances.

Esta versión traduce los ejemplos actuales: nombres propios de clases, métodos y variables, comentarios y mensajes de consola. Se conservan las palabras reservadas y los nombres de las API de Java.

## Ejecutar un ejemplo

Abre un archivo con main y selecciona **Run Java** o **Run** sobre el método. Mantén abierta la carpeta del repositorio como raíz del proyecto. Los paquetes de este capítulo comienzan con espanol.cp06otrascaracteristicasdelasclases.

[Volver a la guía en español](../README.md) · [Versión en inglés](../../english/cp06otherclassfeatures/README.md)

## Tareas de codificación

- **Asignación** (`asignacion`, equivalente a `assignment`): enunciados, requisitos, salidas de ejemplo y capturas originales.
- **Desarrollo** (`desarrollo`, equivalente a `doing`): espacio para escribir tu solución, todavía sin implementar.

1. **Figuras**: [enunciado y UML](tareasdecodificacion/asignacion/tareauno/README.md) · [desarrollo](tareasdecodificacion/desarrollo/tareauno/README.md).
2. **Gestor de contenido**: [enunciado](tareasdecodificacion/asignacion/tareados/README.md) · [desarrollo](tareasdecodificacion/desarrollo/tareados/README.md).

Las imágenes originales se guardan en la carpeta de asignaciones del capítulo en inglés y se enlazan desde ambas versiones. Puedes verlas al abrir la vista previa del README. No se han desarrollado estas tareas.
