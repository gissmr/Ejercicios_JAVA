package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    private List<Muestra> muestras;

    public Laboratorio(List<Muestra> muestras) {
        this.muestras = new ArrayList<>();
    }

    public Muestra buscarPorCodigo (String codigoABuscar) throws  MuestraNoEncontradaException {

        for (Muestra muestraActual : muestras)
            if (muestraActual.getCodigo().equalsIgnoreCase(codigoABuscar)) {
                return muestraActual;
            }
        throw new MuestraNoEncontradaException("Error: No existe muestra con el código " + codigoABuscar);
    }
}
