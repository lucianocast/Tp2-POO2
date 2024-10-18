package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva implements OperacionesReserva{
    private String numeroConfirmacion;
    private LocalDateTime fechaReserva;
    private Vuelo vuelo;
    private String asiento;
    private Cliente cliente;
    private boolean esActiva;
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Reserva(String numeroConfirmacion, LocalDateTime fechaReserva, Vuelo vuelo, String asiento, Cliente cliente) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fechaReserva = fechaReserva;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.cliente = cliente;
        this.esActiva = true;
    }

    @Override
    public void reservarAsiento(String asiento, Cliente cliente) {
        this.asiento = asiento;
        this.cliente = cliente;
        this.esActiva = true;
    }

    @Override
    public void cancelarReserva() {
        this.esActiva = false;
    }

    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isActiva() {
        return esActiva;
    }

    @Override
    public String toString() {
        return "Reserva confirmada: " + numeroConfirmacion + "\n" +
               "Cliente: " + cliente.getNombre() + "\n" +
               "Vuelo: " + vuelo.getNumeroVuelo() + " (Asiento: " + asiento + ")\n" +
               "Fecha de reserva: " + fechaReserva.format(FORMATO_FECHA_HORA) + "\n" +
               "Estado: " + (esActiva ? "Activa" : "Cancelada");
    }
}
