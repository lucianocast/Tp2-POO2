package modelo;
/**
 * Clase que representa un aeropuerto.
 */
public class Aeropuerto {
    /**
     * Código del aeropuerto.
     */
    private String codigo;
    /**
     * Nombre del aeropuerto.
     */
    private String nombre;
    /**
     * Ciudad del aeropuerto.
     */
    private String ciudad;
    /**
     * Constructor de la clase Aeropuerto.
     * @param codigo código del aeropuerto
     * @param nombre nombre del aeropuerto
     * @param ciudad ciudad del aeropuerto
     */
    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    /**
     * Método que retorna el código del aeropuerto.
     * @return código del aeropuerto
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * Método que retorna el nombre del aeropuerto.
     * @return nombre del aeropuerto
     */
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + "), " + ciudad;
    }
}
