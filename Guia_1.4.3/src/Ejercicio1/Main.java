package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductoIndustrial> inventario = new ArrayList<>();

        ProductoIndustrial prod1 = new ProductoIndustrial("G-01", "Gas", "Combustible", 20000, 200);
        ProductoIndustrial prod2 = new ProductoIndustrial("G-02", "Correas", "Repuestos", 5000, 100);
        ProductoIndustrial prod3 = new ProductoIndustrial("G-03", "Petroleo", "Combustible", 25000, 200);
        ProductoIndustrial prod4 = new ProductoIndustrial("G-04", "Ampolleta industrial", "Repuestos", 120000, 80);
        ProductoIndustrial prod5 = new ProductoIndustrial("G-05", "Tornillos", "Repuestos", 2000, 50);

        inventario.add(prod1);
        inventario.add(prod2);
        inventario.add(prod3);
        inventario.add(prod4);
        inventario.add(prod5);

        System.out.println("== LISTA DE PRODUCTOS ==");
        for (ProductoIndustrial productoActual : inventario) {
            productoActual.mostrarInformacion();
        }
    }
}