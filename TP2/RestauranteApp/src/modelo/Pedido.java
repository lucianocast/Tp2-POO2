package modelo;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Clase que representa un pedido realizado por un cliente.
 */
public class Pedido implements PedidoOperaciones{
    /**
     * Cliente que realizó el pedido.
     */
    private Cliente cliente;
    /**
     * Mesa en la que se realizó el pedido.
     */
    private Mesa mesa;
    /**
     * Lista de platos del pedido.
     */
    private ArrayList<Plato> platos;
    /**
     * Estado del pedido.
     */
    private EstadoPedido estado;
    /**
     * Hora de creación del pedido.
     */
    private LocalDateTime horaCreacion;
    /**
     * Formato de fecha y hora.
     */
    private static final DateTimeFormatter formatoDyH = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    /**
     * Constructor de la clase Pedido.
     * @param cliente cliente que realizó el pedido
     * @param mesa mesa en la que se realizó el pedido
     */
    public Pedido(Cliente cliente, Mesa mesa) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.platos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
        this.horaCreacion = LocalDateTime.now();
    }
    /**
     * Método que agrega un plato al pedido.
     */
    @Override
    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }
    /**
     * Método que calcula el total del pedido.
     * @return total del pedido
     */
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        return total;
    }
    /**
     * Método que retorna el estado del pedido.
     * @return estado del pedido
     */
    public EstadoPedido getEstado() {
        return estado;
    }
    /**
     * Método que establece el estado del pedido.
     * @param estado estado del pedido
     */
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    /**
     * Método que retorna la hora de creación del pedido.
     * @return 
     */
    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }
    /**
     * Método que retorna la información del pedido.
     * @return información del pedido
     */
    @Override
    public String toString() {
        String horaFormateada = horaCreacion.format(formatoDyH);
        return "Pedido de " + cliente + " en " + mesa + "\n" + "Estado: " + estado + "\n" + "Hora: " + horaFormateada + "\n" +
                "Platos: " + platos + "\n" + "Total: $" + calcularTotal();
    }

}
