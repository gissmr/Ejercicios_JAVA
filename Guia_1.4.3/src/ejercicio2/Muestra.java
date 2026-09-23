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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoAnalisis() {
        return tipoAnalisis;
    }

    public void setTipoAnalisis(String tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public EstadoMuestra getEstado() {
        return estado;
    }

    public void setEstado(EstadoMuestra estado) {
        this.estado = estado;
    }

    public Muestra(String codigo, String tipoAnalisis, String fechaRecepcion) {
        this.codigo = codigo;
        this.tipoAnalisis = tipoAnalisis;
        this.fechaRecepcion = fechaRecepcion;
        this.estado = EstadoMuestra.RECIBIDA;


    }
}
