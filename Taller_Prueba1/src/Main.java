public class Main {

    public static void main(String[] args) {

        Excavadora excavadora1 = new Excavadora("MAQ-EX01", 3200, 210, 18.5, false);
        Excavadora excavadora2 = new Excavadora("MAQ-EX02", 800, 180, 14.0, true);

        CargadorFrontal cargador1 = new CargadorFrontal("MAQ-CG01", 1500, 150, 3.5);
        CargadorFrontal cargador2 = new CargadorFrontal("MAQ-CG02", 400, 120, 2.0);

        excavadora1.certificar();

        GestorMaquinaria gestor = new GestorMaquinaria();

        gestor.registrarMaquinas(excavadora1);
        gestor.registrarMaquinas(excavadora2);
        gestor.registrarMaquinas(cargador1);
        gestor.registrarMaquinas(cargador2);

        System.out.println("== BÚSQUEDA ==");
        for (Maquina maquina : gestor.buscarPorCodigo("MAQ-EX01")) {
            System.out.println(maquina);
            System.out.println("Costo: $"+maquina.calcularCosto());
        }

        System.out.println("\n -- LISTADO DE MÁQUINAS --");
        for (Maquina maquina : gestor.getMaquinas()) {
            System.out.println(maquina);
            System.out.println("Costo: $"+ maquina.calcularCosto());
        }

    }
}
