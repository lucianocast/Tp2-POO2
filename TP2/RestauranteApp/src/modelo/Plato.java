package modelo;
/**
 * Clase que representa un plato del menú del restaurante.
 */
public abstract class Plato {
    /**
     * Nombre del plato.
     */
    private String nombre;
    /**
     * Precio del plato.
     */
    private double precio;
    /**
     * Categoría del plato.
     */
    private CategoriaPlato categoria;
    /**
     * Constructor de la clase Plato.
     * @param nombre nombre del plato
     * @param precio precio del plato
     * @param categoria categoría del plato
     */
    public Plato(String nombre, double precio, CategoriaPlato categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    /**
     * Método que retorna el nombre del plato.
     * @return nombre del plato
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que retorna el precio del plato.
     * @return precio del plato
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Método que retorna la categoría del plato.
     * @return categoría del plato
     */
    public CategoriaPlato getCategoria() {
        return categoria;
    }
    /**
     * Método que retorna la información del plato.
     * @return información del plato
     */
    @Override
    public String toString() {
        return nombre + " (" + categoria + ") - $" + precio;
    }

}
