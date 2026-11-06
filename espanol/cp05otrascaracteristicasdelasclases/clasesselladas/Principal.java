package espanol.cp05otrascaracteristicasdelasclases.clasesselladas;

// Una interfaz sellada restringe qué clases pueden implementarla directamente.
// Solo se permiten las clases indicadas después de permits.
sealed interface Figuras permits Circulo, Rectangulo {
}

// Una clase permitida debe declararse final, sealed o non-sealed.
// final impide que otras clases hereden de Circulo.
final class Circulo implements Figuras {
    int radio = 3;
}

// final también impide que otras clases hereden de Rectangulo.
final class Rectangulo implements Figuras {
    int ancho = 4, alto = 5;
}

// Las clases e interfaces selladas son una característica estándar desde Java 17.
public class Principal {
    public static void describirFigura(Figuras figura) {
        if (figura instanceof Circulo circulo) {
            System.out.println("Círculo de radio " + circulo.radio);
        } else if (figura instanceof Rectangulo rectangulo) {
            System.out.println("Rectángulo de " + rectangulo.ancho + " x " + rectangulo.alto);
        }
    }

    public static void main(String[] args) {
        describirFigura(new Circulo());
        describirFigura(new Rectangulo());
    }
}
