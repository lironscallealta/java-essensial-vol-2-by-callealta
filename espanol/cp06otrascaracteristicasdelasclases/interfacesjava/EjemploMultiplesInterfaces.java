package espanol.cp06otrascaracteristicasdelasclases.interfacesjava;

// Una clase puede extender una clase e implementar varias interfaces.
// Pato hereda comer() de Animal e implementa nadar() y volar().
// Una interfaz tambien puede extender varias interfaces: HabilidadesDePato hereda
// los contratos de Nadador y Volador, y agrega graznar().
// OtroPato implementa esos tres metodos y tambien hereda comer() de Animal.

interface Nadador {
    void nadar();
}

interface Volador {
    void volar();
}

interface HabilidadesDePato extends Nadador, Volador {
    void graznar();
}

class Animal {

    public void comer() {
        System.out.println("El animal come.");
    }
}

class Pato extends Animal implements Nadador, Volador {

    @Override
    public void nadar() {
        System.out.println("El pato nada.");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela.");
    }
}

class OtroPato extends Animal implements HabilidadesDePato {

    @Override
    public void nadar() {
        System.out.println("Otro pato nada.");
    }

    @Override
    public void volar() {
        System.out.println("Otro pato vuela.");
    }

    @Override
    public void graznar() {
        System.out.println("¡Cuac!");
    }
}

public class EjemploMultiplesInterfaces {

    public static void main(String[] args) {
        Pato pato = new Pato();

        pato.comer();  
        pato.nadar(); 
        pato.volar();  

        OtroPato otroPato = new OtroPato();

        otroPato.comer();   
        otroPato.nadar();  
        otroPato.volar();   
        otroPato.graznar(); 
    }
}
