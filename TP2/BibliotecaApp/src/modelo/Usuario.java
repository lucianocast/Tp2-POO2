package modelo;
import java.util.ArrayList;

/**
 * Clase que representa un usuario.
 */
public class Usuario extends Persona{
    /**
     * Libros prestados al usuario.
     */
    private ArrayList<Libro> librosPrestados;
    /**
     * Biblioteca a la que pertenece el usuario.
     */
    
    /**
     * Constructor de la clase Usuario
     * @param id identificación del usuario
     * @param nombre nombre del usuario
     */
    public Usuario(String id, String nombre){
        super(id , nombre);
        librosPrestados = new ArrayList<Libro>();
    }
    /**
     * Método que retorna los libros prestados al usuario
     * @return libros prestados al usuario
     */
    public ArrayList<Libro> getLibrosPrestados(){
        return librosPrestados;
    }
    /**
     * Método que agrega un libro prestado al usuario
     * @param libro libro prestado al usuario
     */
    public void agregarLibroPrestado(Libro libro){
        librosPrestados.add(libro);
    }
    /**
     * Método que remueve un libro prestado al usuario
     * @param libro libro prestado al usuario
     */
    public void removerLibroPrestado(Libro libro){
        librosPrestados.remove(libro);
    }
    /**
     * Método que retorna la información del usuario
     * @return información del usuario
     */
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", ID:" + getId();
    }

}
