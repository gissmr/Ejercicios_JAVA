package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<ProductoIndustrial> inventario = new ArrayList<>();

    ProductoIndustrial prod1 = new ProductoIndustrial("G-01", "Gas", "Combustible", 12.000, 200);
    ProductoIndustrial prod2 = new ProductoIndustrial("G-02", "Correas", "Repuestos", 5000, 100);
    ProductoIndustrial prod3 = new ProductoIndustrial("G-03", "Petroleo", "Combustible", 25000, 200);
    ProductoIndustrial prod4 = new ProductoIndustrial("G-04", "Ampolleta industrial", "Repuestos", 120000, 80);
    ProductoIndustrial prod5 = new ProductoIndustrial("G-05", "Tornillos", "Repuestos", 2000, 50);
}
