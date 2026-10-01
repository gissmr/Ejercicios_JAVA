public class ClaseSemiPersonal extends Clase {

    private int cantParticipantes;

    public ClaseSemiPersonal() {
    }

    public ClaseSemiPersonal(String nombre, int cupoMaximo, int duracion, int cantParticipantes) {
        super(nombre, cupoMaximo, duracion);
        //this.cantParticipantes = cantParticipantes;
        this.setCantParticipantes(cantParticipantes);
    }

    public int getCantParticipantes() {
        return cantParticipantes;
    }

    public void setCantParticipantes(int cantParticipantes) {
        this.cantParticipantes = cantParticipantes;
    }

    @Override
    public double calcularCosto() {

        double costo = 18000;
        if (cantParticipantes > 3) {
            costo = costo * 1.10;
        }
        return costo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Participantes: " + this.cantParticipantes + " | Costo: $" + calcularCosto();
    }
}
