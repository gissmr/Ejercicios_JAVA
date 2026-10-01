public class ClasePersonal extends Clase implements Cancelable {

    private String nombreInstructor;
    private boolean evaluacionPrevia, cancelacionAtiva;

    public ClasePersonal() {
    }

    public ClasePersonal(String nombre, int cupoMaximo, int duracion, String nombreInstructor, boolean evaluacionPrevia, boolean cancelacionAtiva) {
        super(nombre, cupoMaximo, duracion);
        //this.nombreInstructor = nombreInstructor;
        this.setNombreInstructor(nombreInstructor);
        //this.evaluacionPrevia = evaluacionPrevia;
        this.setEvaluacionPrevia(evaluacionPrevia);
        //this.cancelacionAtiva = cancelacionAtiva;
        this.setCancelacionAtiva(false);
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public boolean isEvaluacionPrevia() {
        return evaluacionPrevia;
    }

    public void setEvaluacionPrevia(boolean evaluacionPrevia) {
        this.evaluacionPrevia = evaluacionPrevia;
    }

    public boolean isCancelacionAtiva() {
        return cancelacionAtiva;
    }

    public void setCancelacionAtiva(boolean cancelacionAtiva) {
        this.cancelacionAtiva = cancelacionAtiva;
    }

    @Override
    public double calcularCosto() {

        double precio = 35000;
        if (!evaluacionPrevia) {
            precio = precio * 1.20;
        } return precio;

    }

    @Override
    public boolean tieneCancelacion() {  //Pregunto si tiene la cancelacion activa, por eso retorno la respuesta.
        return cancelacionAtiva;
    }

    @Override
    public void activarCancelacion() { //Si no la tiene y quiero activar esta cancelación
        cancelacionAtiva = true;       //Trae ese atributo y si está false lo cambia a true.
    }

    @Override
    public String toString() {
        return super.toString() + " | Evaluación: " + (this.evaluacionPrevia ? "Si" : "No") + " | Cancelación: " + (this.cancelacionAtiva ? "Si" : "No") + " | Costo: $" + calcularCosto();
    }
}
