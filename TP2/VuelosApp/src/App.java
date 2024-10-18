import java.time.LocalDateTime;

import modelo.Aeropuerto;
import modelo.Avion;
import modelo.AvionComercial;
import modelo.Cliente;
import modelo.Reserva;
import modelo.SistemaReservasVuelos;
import modelo.TipoAerolinea;
import modelo.Vuelo;

public class App {
    public static void main(String[] args) throws Exception {
        SistemaReservasVuelos sistema = new SistemaReservasVuelos();

        // Crear aeropuertos
        Aeropuerto aeropuerto1 = new Aeropuerto("JFK", "John F. Kennedy", "Nueva York");
        Aeropuerto aeropuerto2 = new Aeropuerto("LAX", "Los Ángeles", "Los Ángeles");
        Aeropuerto aeropuerto3 = new Aeropuerto("MEX", "Aeropuerto Internacional de la Ciudad de México", "Ciudad de México");

        // Crear aviones
        Avion avion1 = new AvionComercial("Boeing 747", 400, TipoAerolinea.AMERICAN_AIRLINES);
        Avion avion2 = new AvionComercial("Airbus A320", 180, TipoAerolinea.DELTA);

        // Crear vuelos
        Vuelo vuelo1 = new Vuelo("AA123", TipoAerolinea.AMERICAN_AIRLINES, 
            LocalDateTime.of(2024, 11, 15, 8, 0),
            LocalDateTime.of(2024, 11, 15, 11, 30), 
            aeropuerto1, aeropuerto2, avion1);
        
        Vuelo vuelo2 = new Vuelo("DL456", TipoAerolinea.DELTA, 
            LocalDateTime.of(2024, 12, 10, 14, 45),
            LocalDateTime.of(2024, 12, 10, 18, 0), 
            aeropuerto2, aeropuerto3, avion2);

        // Agregar vuelos al sistema
        sistema.agregarVuelo(vuelo1);
        sistema.agregarVuelo(vuelo2);

        // Crear clientes
        Cliente cliente1 = new Cliente("Carlos Perez", "carlos.perez@example.com");
        Cliente cliente2 = new Cliente("Ana Rodriguez", "ana.rodriguez@example.com");

        // Crear reservas para cliente1 y cliente2
        Reserva reserva1 = new Reserva("CONF12345", LocalDateTime.now(), vuelo1, "12A", cliente1);
        Reserva reserva2 = new Reserva("CONF54321", LocalDateTime.now(), vuelo2, "18B", cliente2);

        // Registrar reservas en el sistema
        sistema.registrarReserva(reserva1);
        sistema.registrarReserva(reserva2);

        // Agregar reservas a los clientes
        cliente1.agregarReserva(reserva1);
        cliente2.agregarReserva(reserva2);

        // Mostrar los vuelos disponibles
        System.out.println("Vuelos disponibles:");
        for (Vuelo vuelo : sistema.getVuelos()) {
            System.out.println(vuelo);
            System.out.println("----------------------------");
        }

        // Mostrar reservas realizadas
        System.out.println("\nReservas realizadas:");
        for (Reserva reserva : sistema.getReservas()) {
            System.out.println(reserva);
            System.out.println("----------------------------");
        }

        // Mostrar las reservas de un cliente específico
        System.out.println("\nReservas del cliente: " + cliente1.getNombre());
        for (Reserva reserva : cliente1.getReservas()) {
            System.out.println(reserva);
            System.out.println("----------------------------");
        }

        // Cancelar una reserva y mostrar el estado actualizado
        System.out.println("\nCancelando la reserva de Carlos Perez...");
        reserva1.cancelarReserva();
        System.out.println(reserva1);
    }
}
