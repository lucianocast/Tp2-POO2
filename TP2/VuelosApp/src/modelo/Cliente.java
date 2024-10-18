package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String email;
    private List<Reserva> reservas;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public String toString() {
        return nombre + " (" + email + ")";
    }
}
