import java.util.ArrayList;

public class GestorCentro {

    private ArrayList<Clase> listaClases;

    public GestorCentro() {

        listaClases = new ArrayList<>();
    }

    public void registrarClases(Clase clase) {
        listaClases.add(clase);
        System.out.println("Clase:" + clase + "agregada correctamente");
    }

    public ArrayList<Clase> metodoBusqueda (String buscado) {
        ArrayList<Clase> coincidencias = new ArrayList<>();
        System.out.println("== Clases encontradas ==");
        for (Clase clase : listaClases) {
            if (clase.getNombre().equalsIgnoreCase(buscado)) {
                coincidencias.add(clase);
            }
        }
        return coincidencias;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }
}
