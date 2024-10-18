package modelo;

public interface OperacionesReserva {
    void reservarAsiento(String asiento, Cliente cliente);
    void cancelarReserva();

}
