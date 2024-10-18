package modelo;

import java.util.ArrayList;

/**
 * Clase que representa a un cliente del restaurante.
 */
public class Cliente {
    /**
     * Nombre del cliente.
     */
    private String nombre;
    /**
     * Lista de pedidos realizados por el cliente.
     */
    private ArrayList<Pedido> pedidos;
    /**
     * Constructor de la clase Cliente.
     * @param nombre nombre del cliente
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }
    /**
     * Método que retorna el nombre del cliente.
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que retorna la lista de pedidos realizados por el cliente.
     * @return lista de pedidos realizados por el cliente
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    /**
     * Método que agrega un pedido a la lista de pedidos realizados por el cliente.
     * @param pedido pedido a agregar
     */
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    /**
     * Método que retorna la cantidad de pedidos realizados por cliente.
     * @return cantidad de pedidos realizados por cliente
     */
    @Override
    public String toString() {
        return "nombre: " + nombre + ", pedidos: \n" + pedidos;
    }
}
