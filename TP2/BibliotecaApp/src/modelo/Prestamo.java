package modelo;
/**
 * Interfaz que representa un préstamo.
 */
public interface Prestamo {
    /**
     * Método que presta un libro a un usuario
     * @param libro libro a prestar
     * @param usuario usuario al que se le presta el libro
     */
    void prestarLibro(Libro libro, Usuario usuario);
    /**
     * Método que devuelve un libro a la biblioteca
     * @param libro libro a devolver
     * @param usuario usuario que devuelve el libro
     */
    void devolverLibro(Libro libro, Usuario usuario);
}
