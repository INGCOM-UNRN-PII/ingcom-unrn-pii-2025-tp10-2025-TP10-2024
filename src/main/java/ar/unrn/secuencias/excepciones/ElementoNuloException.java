package ar.unrn.secuencias.excepciones;

public class ElementoNuloException extends ElementoInvalidoException {

    public ElementoNuloException() {
        super("El elemento no puede ser nulo para esta secuencia.");
    }

    public ElementoNuloException(String mensaje) {
        super(mensaje);
    }
}
