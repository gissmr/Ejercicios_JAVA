import java.util.ArrayList;

public class GestorMaquinaria {

    private ArrayList<Maquina> maquinas;

    public GestorMaquinaria() {

        maquinas = new ArrayList<>();
    }

    public void registrarMaquinas(Maquina maquina) {
        maquinas.add(maquina);
        System.out.println(maquina.getCodigo() + "("+ maquina.getClass(). getName()+") registrada correctamente");
    }

    public ArrayList<Maquina> buscarPorCodigo(String codigo) {
        ArrayList<Maquina> encontradas = new ArrayList<>();

        // iter + tab
        for (Maquina maquina : maquinas) {
            if (maquina.getCodigo().equalsIgnoreCase(codigo)) {
                encontradas.add(maquina);
            }
        }
        return encontradas;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }
}
