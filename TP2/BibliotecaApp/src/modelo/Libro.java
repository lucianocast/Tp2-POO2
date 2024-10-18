package modelo;

/**
 * Clase que representa un libro.
 */
public class Libro {
    /**
     * titulo del libro
     */
    private String titulo;
    /**
     * autor del libro
     */
    private String autor;
    /**
     * número de páginas del libro
     */
    private int numeroPaginas;
    /**
     * estado del libro
     */
    private EstadoLibro estado;
    /**
     * usuario al que se le presta el libro
     */
    private Usuario usuario;
    
    /**
     * Constructor de la clase Libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param numeroPaginas número de páginas del libro
     */
    public Libro (String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.estado = EstadoLibro.DISPONIBLE;
    }
    /**
     * Método que retorna el título del libro
     * @return título del libro
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     * Método que retorna el autor del libro
     * @return autor del libro
     */
    public String getAutor(){
        return autor;
    }
    /**
     * Método que retorna el número de páginas del libro
     * @return número de páginas del libro
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    /**
     * Método que retorna el estado del libro
     * @return estado del libro
     */
    public EstadoLibro getEstado(){
        return estado;
    }
    /**
     * Método que cambia el estado del libro
     * @param estado estado del libro
     */
    public void setEstado(EstadoLibro estado){
        this.estado = estado;
    }
    /**
     * Método que retorna el usuario al que se le presta el libro
     * @return usuario al que se le presta el libro
     */
    public Usuario getUsuario() {
        return usuario;
    }
    /**
     * Método que cambia el usuario al que se le presta el libro
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /**
     * Método que retorna la representación en cadena del libro
     * @return descripción del libro
     */
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Número de páginas: " + numeroPaginas + ", Estado: " + estado;
    }
}
