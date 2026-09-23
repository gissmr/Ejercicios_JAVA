package ejercicio2;

public class Muestra {
    private String codigo;
    private String tipoAnalisis;
    private String fechaRecepcion;
    private EstadoMuestra estado;
    public enum EstadoMuestra {
        RECIBIDA,
        EN_ANALISIS,
        FINALIZADA,
        RECHAZADA
    }

    public Muestra(String codigo, String tipoAnalisis, String fechaRecepcion) {
        this.codigo = codigo;
        this.tipoAnalisis = tipoAnalisis;
        this.fechaRecepcion = fechaRecepcion;
        this.estado = EstadoMuestra.RECIBIDA;

    }
}
