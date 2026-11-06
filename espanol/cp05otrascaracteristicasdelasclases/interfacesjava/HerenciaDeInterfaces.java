package espanol.cp05otrascaracteristicasdelasclases.interfacesjava;

// Una interfaz puede extender varias interfaces, separadas por comas.
// I3 hereda los contratos de I1 e I2 y agrega hacerAlgoMas().

public class HerenciaDeInterfaces {

    interface I1 {
        public void hacerAlgo();
    }

    interface I2 {
        public void hacerOtraCosa();
    }

    interface I3 extends I1, I2 {

        public void hacerAlgoMas();

    }

}
