package modelo;
import java.util.ArrayList;

/**
 * Clase que representa una biblioteca.
 */
public class Biblioteca implements Prestamo{
    /**
     * Libros registrados en la biblioteca
     */
    private ArrayList<Libro> libros;
    /**
     * Usuarios registrados en la biblioteca
     */
    private ArrayList<Usuario> usuarios;
    /**j
     * Constructor de la clase Biblioteca
     */
    public Biblioteca(){
        libros = new ArrayList<Libro>();
        usuarios = new ArrayList<Usuario>();
    }
    /**
     * Método que registra un libro en la biblioteca
     * @param libro libros a registrar
     */
    public void registrarLibro(Libro libro){
        libros.add(libro);
    }
    /**
     * Método que retorna los libros registrados en la biblioteca
     * @return libros registrados en la biblioteca
     */
    public ArrayList<Libro> getLibros(){
        return libros;
    }
    /**
     * Método que registra un usuario en la biblioteca
     * @param usuario usuario a registrar
     */
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    /**
     * Método que retorna los usuarios registrados en la biblioteca
     * @return usuarios registrados en la biblioteca
     */
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    /**
     * Método que presta un libro a un usuario
     * @param libro libro a prestar
     * @param usuario usuario al que se le presta el libro
     * @throws RuntimeException si el libro no se encuentra disponible
     */
    @Override
    public void prestarLibro(Libro libro, Usuario usuario){
        if(libro.getEstado() == EstadoLibro.DISPONIBLE){
            libro.setEstado(EstadoLibro.PRESTADO);
            usuario.agregarLibroPrestado(libro);
        }
        else{
            throw new RuntimeException("El libro no se encuentra disponible");
        }
    }
    
    /**
     * Método que devuelve un libro prestado por un usuario
     * @param libro libro a devolver
     * @param usuario usuario que devuelve el libro
     * @throws RuntimeException si el libro no se encuentra prestado
     */
    @Override
    public void devolverLibro(Libro libro, Usuario usuario){
        if(libro.getEstado() == EstadoLibro.PRESTADO){
            libro.setEstado(EstadoLibro.DISPONIBLE);
            usuario.removerLibroPrestado(libro);
        }
        else{
            throw new RuntimeException("El libro no se encuentra prestado");
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de usuarios:\n");
        for (Usuario usuario : usuarios) {
            sb.append(usuario.toString()).append("\n");
        }
        sb.append("Lista de libros:\n");
        for (Libro libro : libros) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }
}
