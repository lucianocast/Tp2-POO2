package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservasVuelos {
    private List<Vuelo> vuelos;
    private List<Reserva> reservas;

    public SistemaReservasVuelos() {
        this.vuelos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Vuelo> buscarVuelos(Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
        List<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getAeropuertoSalida().equals(aeropuertoSalida) && vuelo.getAeropuertoLlegada().equals(aeropuertoLlegada)) {
                vuelosEncontrados.add(vuelo);
            }
        }
        return vuelosEncontrados;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
