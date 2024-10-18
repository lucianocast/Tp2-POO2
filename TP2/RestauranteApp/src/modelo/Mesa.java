package modelo;
/**
 * Clase que representa una mesa del restaurante.
 */
public class Mesa {
    /**
     * Número de la mesa.
     */
    private int numeroMesa;
    /**
     * Constructor de la clase Mesa.
     * @param numeroMesa número de la mesa
     */
    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    /**
     * Método que retorna el número de la mesa.
     * @return número de la mesa
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }
    /**
     * Método que retorna el numero de mesa
     * @return numero de mesa
     */
    @Override
    public String toString() {
        return "Mesa " + numeroMesa;
    }

}
