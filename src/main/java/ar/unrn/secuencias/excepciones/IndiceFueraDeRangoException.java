package ar.unrn.secuencias.excepciones;

public class IndiceFueraDeRangoException extends SecuenciaException {


    public IndiceFueraDeRangoException(String mensaje) {
        super(mensaje);
    }

    public IndiceFueraDeRangoException(int indice, int largo) {
        super(String.format("Índice %d fuera de rango para largo %d", indice, largo));
    }
}

