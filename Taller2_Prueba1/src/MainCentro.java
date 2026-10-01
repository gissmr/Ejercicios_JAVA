public class MainCentro {

    public static void main(String[] args) {

        ClasePersonal clase1 = new ClasePersonal("Yoga", 1, 60, "Camila Rojas", false, false);
        clase1.activarCancelacion();
        ClasePersonal clase2 = new ClasePersonal("Pilates", 1, 50, "Diego Soto", false, false);
        ClaseSemiPersonal clase3 = new ClaseSemiPersonal("Yoga", 4, 60, 5);
        ClaseSemiPersonal clase4 = new ClaseSemiPersonal("Spinning", 3, 45, 2);

        GestorCentro miGestor = new GestorCentro();
        miGestor.registrarClases(clase1);
        miGestor.registrarClases(clase2);
        miGestor.registrarClases(clase3);
        miGestor.registrarClases(clase4);

        System.out.println("== BÚSQUEDA DE CLASE ==");
        for (Clase clase : miGestor.metodoBusqueda("Yoga")) {
            System.out.println("Clase: " + clase + " encontrada exitosamente");
        }

        System.out.println("== LISTA DE CLASES ==");
        for (Clase clase : miGestor.getListaClases()) {
            System.out.println(clase);
        }

    }



}
