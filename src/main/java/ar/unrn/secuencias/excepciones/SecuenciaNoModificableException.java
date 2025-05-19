package ar.unrn.secuencias.excepciones;

public class SecuenciaNoModificableException extends SecuenciaException {
    public SecuenciaNoModificableException(String mensaje) {
        super(mensaje);
    }

    public SecuenciaNoModificableException() {
        super("La secuencia es de solo lectura y no puede ser modificada.");
    }
}
