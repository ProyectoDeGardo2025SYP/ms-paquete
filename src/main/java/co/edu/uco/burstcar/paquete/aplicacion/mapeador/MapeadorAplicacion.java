package co.edu.uco.burstcar.paquete.aplicacion.mapeador;

public interface MapeadorAplicacion<A, D> {
    D aDominio(A dto);
}
