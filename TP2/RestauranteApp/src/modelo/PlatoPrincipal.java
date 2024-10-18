package modelo;
/**
 * Clase que representa un plato principal del menú del restaurante.
 */
public class PlatoPrincipal extends Plato{
    /**
     * Constructor de la clase PlatoPrincipal.
     * @param nombre nombre del plato
     * @param precio precio del plato
     */
    public PlatoPrincipal(String nombre, double precio) {
        /**
         * Llama al constructor de la superclase.
         */
        super(nombre, precio, CategoriaPlato.PLATO_PRINCIPAL);
    }

}
