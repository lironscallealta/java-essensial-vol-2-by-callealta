package espanol.cp06otrascaracteristicasdelasclases.interfazpredeterminada.ejemplouno;

public interface Animal {
    // Estos métodos no tienen cuerpo. Cada clase concreta que implemente
    // Animal debe proporcionar sus implementaciones.
    // Los métodos abstractos de una interfaz son públicos implícitamente.
    void comer();
    void dormir();
    void respirar();

    // default proporciona una implementación lista para usar.
    // Las clases la heredan y pueden sobrescribirla si lo necesitan.
    // Un método default de una interfaz es público.
    default void jugar() {
        System.out.println("El animal se está divirtiendo.");
    }
}
