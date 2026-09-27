public class Maquina {

    protected String codigo;
    protected int horasUso;
    protected int potencia;

    public Maquina() {
    }

    public Maquina(String codigo, int horasUso, int potencia) {
        //this.codigo = codigo;
        this.setCodigo(codigo);
        //this.horasUso = horasUso;
        this.setHorasUso(horasUso);
        //this.potencia = potencia;
        this.setPotencia(potencia);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {

        if (horasUso < 0 || horasUso > 2000) {
            throw new IllegalArgumentException("Las horas de uso deben estar entre 0 y 2000");
        }
        this.horasUso = horasUso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {

        if (potencia < 0) {
            throw new IllegalArgumentException("La potencia debe ser mayor a 0");
        }
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "codigo='" + codigo + '\'' +
                ", horasUso=" + horasUso +
                '}';
    }
}
