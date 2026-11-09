package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados;

import espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma.Articulo;
import espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma.Contenido;
import espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma.Podcast;
import espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma.Video;

public class Principal {
    public static void main(String[] args) {

        Articulo articulo = new Articulo("Artículo sobre política en el New York Times", "Julio Prado", 1200);
        Video video = new Video("Parque Jurásico", "Spilber", 130);
        Podcast podcast = new Podcast("Aprender inglés con hablantes nativos", "Miriam", 30, false);
        System.out.println("--------------------------");
        procesar(articulo);
        System.out.println("--------------------------");
        procesar(video);
        System.out.println("--------------------------");
        procesar(podcast);

    }

    public static void procesar(Contenido contenido) {
        if (contenido instanceof Articulo art) {

            art.mostrarInformacion();
            art.publicar();
            System.out.println("Tiempo estimado de lectura: " + art.calcularTiempoDeLectura() + " minutos");
            art.leer();
        } else if (contenido instanceof Video) {
            Video vid = (Video) contenido;
            vid.mostrarInformacion();
            vid.publicar();
            System.out.println("Duración estimada de la película: " + vid.calcularTiempoDeLectura() + " minutos");
            vid.ver();
        } else if (contenido instanceof Podcast pod) {
            pod.mostrarInformacion();
            pod.publicar();
            System.out.println("Duración estimada del pódcast: " + pod.calcularTiempoDeLectura() + " minutos");
            pod.leer();
            pod.ver();

        }
    }
}