package espanol.cp04herenciasobrecargayconstructores.ejercicios.enunciados.ejerciciodos;

public class Enunciado {

    /*
 * Ejercicio de programación 2: implementar una jerarquía sencilla de herencia.
 * Objetivo: aplicar herencia con comportamientos comunes y específicos.
 * 
 * A. Crea Animal con nombre (String, nombre) y edad (int, edad).
 * El constructor inicializa ambos campos.
 * emitirSonido() imprime "Sonido genérico de animal".
 * mostrarInformacion() muestra el nombre y la edad.
 * 
 * B. Crea Perro extends Animal. Su constructor llama al de la superclase.
 * Sobrescribe emitirSonido() para imprimir "¡Guau! ¡Guau! ¡Guau!".
 * Agrega buscarPelota(), que imprime "¡Buscando la pelota!".
 * 
 * C. Crea Gato extends Animal. Su constructor llama al de la superclase.
 * Sobrescribe emitirSonido() para imprimir "¡Miau! ¡Miau! ¡Miau!".
 * Agrega ronronear(), que imprime "¡Ronroneando suavemente!".
 * 
 * D. Crea PruebaAnimal con main. Instancia Perro y Gato y llama a sus métodos:
 * public class PruebaAnimal {
 *     public static void main(String[] argumentos) {
 *         Perro miPerro = new Perro("Buddy", 3);
 *         Gato miGato = new Gato("Whiskers", 2);
 *         miPerro.mostrarInformacion();
 *         miPerro.emitirSonido();
 *         miPerro.buscarPelota();
 *         miGato.mostrarInformacion();
 *         miGato.emitirSonido();
 *         miGato.ronronear();
 *     }
 * }
 * 
 * Salida esperada del ejemplo:
 * Nombre: Buddy Edad: 3
 * ¡Guau! ¡Guau! ¡Guau!
 * ¡Buscando la pelota!
 * Nombre: Whiskers Edad: 2
 * ¡Miau! ¡Miau! ¡Miau!
 * ¡Ronroneando suavemente!
 */
}
