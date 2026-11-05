package espanol.cp06otrascaracteristicasdelasclases.interfazpredeterminada.ejemplouno;

public class Mamifero implements Animal {
    @Override
    public void comer() {
        // Agrega el código que indica cómo come un mamífero.
    }

    @Override
    public void dormir() {
        // Agrega el código que indica cómo duerme un mamífero.
    }

    @Override
    public void respirar() {
        // Agrega el código que indica cómo respira un mamífero.
    }

    // Mamifero hereda jugar() de Animal porque no lo sobrescribe.
    // Al llamar a mamifero.jugar() se imprime:
    // "El animal se está divirtiendo."
}
