public class Excavadora extends Maquina implements Certificable {

    private double peso;
    private boolean mantencionAlDia, certificacionActiva;

    public Excavadora() {
        super();
    }

    public Excavadora(String codigo, int horasUso, int potencia, double peso, boolean mantencionAlDia) {
        super(codigo, horasUso, potencia);
        //this.peso = peso;
        this.setPeso(peso);
        //this.mantencionAlDia = mantencionAlDia;
        this.setMantencionAlDia(mantencionAlDia);
        //this.certificacionActiva = false;
        /* creo manualmente la última porque en el enunciado dice que la certificación se gestiona de forma diferenciada. */
        this.setCertificacionActiva(false);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMantencionAlDia() {
        return mantencionAlDia;
    }

    public void setMantencionAlDia(boolean mantencionAlDia) {
        this.mantencionAlDia = mantencionAlDia;
    }

    public boolean isCertificacionActiva() {
        return certificacionActiva;
    }

    public void setCertificacionActiva(boolean certificacionActiva) {
        this.certificacionActiva = certificacionActiva;
    }

    @Override
    public double calcularCosto() {

        double costo = 150000;
        if (!mantencionAlDia) {
            costo = costo * 1.25;
        }
        return costo;
    }

    @Override
    public boolean estaCertificada() {
        return certificacionActiva;
    }

    @Override
    public void certificar() {
        certificacionActiva = true;

    }
}
