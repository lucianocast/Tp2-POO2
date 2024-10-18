import modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear el restaurante
        Restaurante restaurante = new Restaurante();

        // Crear mesas
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        // Agregar mesas al restaurante
        restaurante.agregarMesa(mesa1);
        restaurante.agregarMesa(mesa2);

        // Crear clientes
        Cliente cliente1 = new Cliente("Carlos Perez");
        Cliente cliente2 = new Cliente("Ana Gomez");

        // Crear platos
        Plato entrada1 = new Entrada("Ensalada César", 5.50);
        Plato entrada2 = new Entrada("Bruschetta", 4.00);
        Plato principal1 = new PlatoPrincipal("Spaghetti Carbonara", 12.00);
        Plato principal2 = new PlatoPrincipal("Pizza Margarita", 10.50);
        Plato postre1 = new Postre("Tiramisu", 6.00);
        Plato postre2 = new Postre("Helado", 4.50);

        // Crear pedidos
        Pedido pedido1 = new Pedido(cliente1, mesa1);
        pedido1.agregarPlato(entrada1);
        pedido1.agregarPlato(principal1);
        pedido1.agregarPlato(postre1);

        Pedido pedido2 = new Pedido(cliente2, mesa2);
        pedido2.agregarPlato(entrada2);
        pedido2.agregarPlato(principal2);
        pedido2.agregarPlato(postre2);

        // Registrar los pedidos en el restaurante
        restaurante.registrarPedido(pedido1);
        restaurante.registrarPedido(pedido2);

        // Cambiar el estado de los pedidos
        pedido1.setEstado(EstadoPedido.EN_PREPARACION);
        pedido2.setEstado(EstadoPedido.SERVIDO);

        // Mostrar detalles de los pedidos
        System.out.println("Pedidos registrados en el restaurante:");
        for (Pedido pedido : restaurante.getPedidos()) {
            System.out.println(pedido);
            System.out.println("--------------------------");
        }
    }
}
