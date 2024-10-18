package modelo;

public abstract class Avion {
    protected String modelo;
    protected int capacidad;
    protected TipoAerolinea aerolinea;

    public Avion(String modelo, int capacidad, TipoAerolinea aerolinea) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.aerolinea = aerolinea;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public TipoAerolinea getAerolinea() {
        return aerolinea;
    }

    public abstract String mostrarDetalles();
}
