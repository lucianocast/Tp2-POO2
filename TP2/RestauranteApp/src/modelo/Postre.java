package modelo;
/**
 * Clase que representa un postre del menú del restaurante.
 */
public class Postre extends Plato {
    /**
     * Constructor de la clase Postre.
     * @param nombre nombre del postre
     * @param precio precio del postre
     */
    public Postre(String nombre, double precio) {
        /**
         * Llama al constructor de la superclase.
         */
        super(nombre, precio, CategoriaPlato.POSTRE);
    }

}
