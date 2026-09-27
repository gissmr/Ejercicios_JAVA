public class CargadorFrontal extends Maquina {

    private double capacidadBalde;

    public CargadorFrontal() {
    }

    public CargadorFrontal(String codigo, int horasUso, int potencia, double capacidadBalde) {
        super(codigo, horasUso, potencia);
        //this.capacidadBalde = capacidadBalde;
        this.setCapacidadBalde(capacidadBalde);
    }

    public double getCapacidadBalde() {
        return capacidadBalde;
    }

    public void setCapacidadBalde(double capacidadBalde) {
        this.capacidadBalde = capacidadBalde;
    }

    @Override
    public double calcularCosto() {

        double costo = 120000;
        if (capacidadBalde > 3) {
            costo = costo * 1.20;
        }
        return costo;
    }
}


