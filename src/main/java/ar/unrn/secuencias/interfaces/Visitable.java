package ar.unrn.secuencias.interfaces;

/**
 * Define el contrato para objetos o estructuras que pueden ser "visitados"
 * por un objeto {@link Visitor}. Esta interfaz es un componente fundamental
 * del patrón de diseño Visitor, que permite añadir nuevas operaciones a una
 * jerarquía de objetos sin modificar las clases de dichos objetos.
 * <p>
 * Un objeto {@code Visitable} se encarga de "aceptar" un {@link Visitor} y
 * dirigirlo para que realice su operación. Esto se logra típicamente mediante
 * un mecanismo de doble despacho, donde el {@code Visitable} invoca un método
 * específico en el {@code Visitor}, pasándose a sí mismo o a sus elementos
 * como argumento.
 * </p>
 * <p>
 * <b>Contrato General del Visitable:</b>
 * <ul>
 *   <li><b>Aceptación del Visitante:</b> Debe proveer un método ({@link #visitar})
 *       que permita a un {@link Visitor} iniciar su operación sobre el
 *       objeto visitable o sus componentes.</li>
 *   <li><b>Control de Travesía (para estructuras compuestas):</b> Si el
 *       {@code Visitable} es una estructura que contiene múltiples elementos
 *       (de tipo {@code T} o que son ellos mismos {@code Visitable}),
 *       es responsabilidad del {@code Visitable} controlar la iteración sobre
 *       estos elementos y asegurar que el {@code Visitor} sea aceptado por cada
 *       uno de ellos, o que el {@code Visitor} reciba cada elemento para su
 *       procesamiento, según la estrategia definida por la implementación
 *       concreta del {@code Visitable} y la interfaz del {@code Visitor}.</li>
 *   <li><b>Provisión de Contexto:</b> Al invocar al {@code Visitor}, el
 *       {@code Visitable} debe proveer el contexto necesario para que el
 *       {@code Visitor} pueda realizar su tarea. Esto usualmente implica
 *       pasar una referencia al elemento actual que está siendo visitado o
 *       al propio {@code Visitable}.</li>
 *   <li><b>Desacoplamiento:</b> El {@code Visitable} no debe tener conocimiento
 *       de la operación concreta que el {@code Visitor} realizará. Su única
 *       responsabilidad es guiar al {@code Visitor} a través de su estructura
 *       o elementos.</li>
 * </ul>
 * </p>
 *
 * @param <T> El tipo de los elementos fundamentales que componen o son
 *            representados por este objeto visitable, y sobre los cuales
 *            el {@link Visitor} operará. La naturaleza exacta de cómo
 *            {@code T} se relaciona con el {@code Visitable} (e.g., si el
 *            {@code Visitable} es una colección de {@code T}s, o si {@code T}
 *            es un tipo base para el {@code Visitable} mismo) dependerá de
 *            la implementación concreta.
 * @see Visitor
 */
public interface Visitable<T> {
    /**
     * Acepta un {@link Visitor} y le permite realizar una operación sobre
     * este objeto visitable o sobre los elementos de tipo {@code T} que contiene,
     * representa o gestiona.
     * <p>
     * Este método es el punto de entrada para el patrón Visitor. La
     * implementación de este método en una clase concreta típicamente
     * invoca un método apropiado en la interfaz del {@code Visitor}. La forma
     * exacta de esta invocación (doble despacho) depende de la estructura del
     * {@code Visitable} y del diseño de la interfaz {@code Visitor}.
     *
     * @param visitor El visitante que realizará la operación.
     */
    void visitar(Visitor<T> visitor);
}