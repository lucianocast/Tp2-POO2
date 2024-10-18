package modelo;

public class AvionComercial extends Avion{
    public AvionComercial(String modelo, int capacidad, TipoAerolinea aerolinea) {
        super(modelo, capacidad, aerolinea);
    }

    @Override
    public String mostrarDetalles() {
        return "Avión Comercial: " + modelo + " (" + aerolinea + ") - Capacidad: " + capacidad;
    }

}
