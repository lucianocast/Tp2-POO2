package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vuelo {
    private String numeroVuelo;
    private TipoAerolinea aerolinea;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraLlegada;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoLlegada;
    private Avion avion;
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Vuelo(String numeroVuelo, TipoAerolinea aerolinea, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraLlegada,
                 Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.avion = avion;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public TipoAerolinea getAerolinea() {
        return aerolinea;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public LocalDateTime getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public Avion getAvion() {
        return avion;
    }

    @Override
    public String toString() {
        return "Vuelo " + numeroVuelo + " (" + aerolinea + ")\n" +
               "Salida: " + fechaHoraSalida.format(FORMATO_FECHA_HORA) + " desde " + aeropuertoSalida + "\n" +
               "Llegada: " + fechaHoraLlegada.format(FORMATO_FECHA_HORA) + " en " + aeropuertoLlegada + "\n" +
               "Avión: " + avion.mostrarDetalles();
    }
}
