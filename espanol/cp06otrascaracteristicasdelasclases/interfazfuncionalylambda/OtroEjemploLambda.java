package espanol.cp06otrascaracteristicasdelasclases.interfazfuncionalylambda;

@FunctionalInterface
interface Saludador2 {
    public String despuesDelCumpleanos(String nombre, int edad);
}

public class OtroEjemploLambda {
    public static void main(String[] args) {
        Saludador2 saludador = (nombre, edad) -> {
            return nombre + ", el próximo año tendrás " + (edad + 1) + " años.";
        };
        System.out.println(saludador.despuesDelCumpleanos("Julio", 39));
        String proximoAnio = saludador.despuesDelCumpleanos("Pedro", 20);
        System.out.println(proximoAnio);
    }
}
