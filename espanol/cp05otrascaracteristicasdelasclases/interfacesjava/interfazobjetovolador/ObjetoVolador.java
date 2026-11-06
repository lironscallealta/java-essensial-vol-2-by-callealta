package espanol.cp05otrascaracteristicasdelasclases.interfacesjava.interfazobjetovolador;

// Una interfaz publica en su propio archivo no necesita estar dentro de una clase.
// Sus metodos declarados sin cuerpo son public abstract. Las clases concretas que
// la implementen deben proporcionar despegar(), aterrizar() y volar().

public interface ObjetoVolador {

    public void despegar();

    public void aterrizar();

    public void volar();

}
