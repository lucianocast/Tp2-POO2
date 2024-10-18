package modelo;
/**
 * Interfaz que define las operaciones que se pueden realizar sobre un pedido.
 */
public interface PedidoOperaciones {
    /**
     * Método que agrega un plato al pedido.
     * @param plato plato a agregar
     */
    void agregarPlato(Plato plato);
    /**
     * Método que calcula el total del pedido.
     * @return total del pedido
     */
    double calcularTotal();
}
