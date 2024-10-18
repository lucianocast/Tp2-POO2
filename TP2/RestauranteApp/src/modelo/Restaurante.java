package modelo;

import java.util.ArrayList;
/**
 * Clase que representa un restaurante.
 */
public class Restaurante {
    /**
     * Lista de mesas del restaurante.
     */
    private ArrayList<Mesa> mesas;
    /**
     * Lista de pedidos realizados en el restaurante.
     */
    private ArrayList<Pedido> pedidos;
    /**
     * Constructor vacío de la clase Restaurante.
     */
    public Restaurante() {
        this.mesas = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    /**
     * Método que agrega una mesa a la lista de mesas del restaurante.
     * @param mesa mesa a agregar
     */
    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }
    /**
     * Método que registra un nuevo pedido en el restaurante.
     * @param pedido pedido a registrar
     */
    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    /**
     * Método que retorna la lista de mesas del restaurante.
     * @return lista de mesas del restaurante
     */
    public ArrayList<Mesa> getMesas() {
        return mesas;
    }
    /**
     * Método que retorna la lista de pedidos realizados en el restaurante.
     * @return lista de pedidos realizados en el restaurante
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
