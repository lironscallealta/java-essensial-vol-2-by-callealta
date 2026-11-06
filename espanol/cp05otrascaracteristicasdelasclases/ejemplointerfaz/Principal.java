package espanol.cp05otrascaracteristicasdelasclases.ejemplointerfaz;

interface Recargable {
    void recargar();
}

class Telefono implements Recargable {
    @Override
    public void recargar() {
        System.out.println("Cargando teléfono");
    }
}

class Bateria implements Recargable {
    @Override
    public void recargar() {
        System.out.println("Cargando batería");
    }
}

public class Principal {
    static void cargar(Recargable dispositivo) {
        dispositivo.recargar();
    }

    public static void main(String[] args) {
        Telefono miTelefono = new Telefono();
        Bateria miBateria = new Bateria();

        cargar(miTelefono);
        cargar(miBateria);
    }
}
