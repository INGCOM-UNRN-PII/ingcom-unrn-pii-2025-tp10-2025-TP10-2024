package ar.unrn.secuencias.excepciones;

/**
 * Excepción lanzada cuando se intenta realizar una operación sobre una estructura
 * de datos que requiere que esta contenga elementos, pero la estructura se
 * encuentra vacía.
 * <p>
 * Por ejemplo, intentar remover un elemento de una pila o cola vacía.
 * </p>
 * Esta es una excepción de tiempo de ejecución (unchecked) ya que usualmente
 * indica un error de programación o una violación de precondiciones que
 * podrían haber sido verificadas por el código cliente antes de la invocación
 * del método problemático (e.g., mediante una llamada a {@code estaVacia()}).
 */
public class EstructuraVaciaException extends RuntimeException {

    /**
     * Construye una {@code EstructuraVaciaException} con {@code null}
     * como su mensaje de detalle. La causa no es inicializada, y puede
     * ser posteriormente inicializada por una llamada a {@link #initCause}.
     */
    public EstructuraVaciaException() {
        super();
    }

    /**
     * Construye una {@code EstructuraVaciaException} con el mensaje de
     * detalle especificado. La causa no es inicializada, y puede ser
     * posteriormente inicializada por una llamada a {@link #initCause}.
     *
     * @param mensaje el mensaje de detalle. El mensaje de detalle es guardado
     *                para recuperación posterior por el método {@link #getMessage()}.
     */
    public EstructuraVaciaException(String mensaje) {
        super(mensaje);
    }

    /**
     * Construye una {@code EstructuraVaciaException} con el mensaje de
     * detalle y causa especificados.
     * <p>Nota: el mensaje de detalle asociado con {@code causa} <em>no</em> es
     * automáticamente incorporado en el mensaje de detalle de esta excepción.</p>
     *
     * @param mensaje el mensaje de detalle (guardado para recuperación posterior
     *                por el método {@link #getMessage()}).
     * @param causa   la causa (guardada para recuperación posterior por el
     *                método {@link #getCause()}). (Un valor {@code null} es
     *                permitido, e indica que la causa es inexistente o desconocida.)
     */
    public EstructuraVaciaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    /**
     * Construye una {@code EstructuraVaciaException} con la causa especificada
     * y un mensaje de detalle de {@code (causa==null ? null : causa.toString())}
     * (que típicamente contiene la clase y mensaje de detalle de {@code causa}).
     * Este constructor es útil para excepciones que son meramente envoltorios
     * de otras throwables.
     *
     * @param causa la causa (guardada para recuperación posterior por el
     *              método {@link #getCause()}). (Un valor {@code null} es
     *              permitido, e indica que la causa es inexistente o desconocida.)
     */
    public EstructuraVaciaException(Throwable causa) {
        super(causa);
    }
}