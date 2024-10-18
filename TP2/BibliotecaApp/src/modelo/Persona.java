package modelo;

/**
 * Clase que representa una persona.
 * @see UsuariO
 */
public abstract class Persona {
    /**
     * Identificación de la persona.
     */
    protected String id;
    /**
     * Nombre de la persona.
     */
    protected String nombre;
    /**
     * Constructor de la clase Persona.
     * @param id identificación de la persona
     * @param nombre nombre de la persona
     */
    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    /**
     * Método que retorna la identificación de la persona.
     * @return identificación de la persona
     */
    public String getId() {
        return id;
    }
    /**
     * Método que retorna el nombre de la persona.
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
}
