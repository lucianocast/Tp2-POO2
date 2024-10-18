package modelo;
/**
 * Clase que representa un plato de entrada.
 */
public class Entrada extends Plato {
    /**
     * Constructor de la clase Entrada.
     * @param nombre nombre de la entrada
     * @param precio precio de la entrada
     */
    public Entrada(String nombre, double precio) {
        super(nombre, precio, CategoriaPlato.ENTRADA);
    }

}
