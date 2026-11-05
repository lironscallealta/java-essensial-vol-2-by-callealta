package espanol.cp06otrascaracteristicasdelasclases.clasesselladas.ejemplobasico;

// Sin sealed, cualquier clase puede implementar esta interfaz.
interface FigurasAbiertas {
}

// Con sealed, Figuras restringe qué tipos pueden implementarla directamente.
// Solo se permiten Circulo y Rectangulo.
sealed interface Figuras permits Circulo, Rectangulo {
}

// Al aparecer en permits, Circulo debe implementar Figuras directamente.
// final impide que otras clases hereden de Circulo.
final class Circulo implements Figuras {
}

// Rectangulo también debe implementar Figuras directamente.
final class Rectangulo implements Figuras {
}

// Un tipo permitido debe ser un subtipo directo de Figuras.
// No basta con aparecer en permits sin implementar la interfaz.
//
// Además, debe declarar qué ocurre con sus propios subtipos:
// final      = no permite subclases.
// sealed     = también restringe sus subclases.
// non-sealed = permite que cualquier clase herede de él.
