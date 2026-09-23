package Ejercicio1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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

        System.out.println("== BÚSQUEDA DE PRODUCTO POR CÓDIGO ==");
        for (ProductoIndustrial prodCoincidencia : inventario) {
            if (prodCoincidencia.coincideConCodigo("G-01")) {
                System.out.println("Producto encontrado!");
                prodCoincidencia.mostrarInformacion();
            }
        }

        System.out.println("== BÚSQUEDA DE PRODUCTO POR NOMBRE O CATEGORÍA ==");
        for (ProductoIndustrial prodBuscado : inventario) {
            if (prodBuscado.coincideConTexto("Tornillos")) {
                System.out.println("Producto encontrado!");
                prodBuscado.mostrarInformacion();
            }
        }

        System.out.println("== AUMENTAR STOCK DEL PRODUCTO ==");
        for (ProductoIndustrial stockAumentado : inventario) {
            if (stockAumentado.coincideConTexto("Ampolleta industrial")) {
                stockAumentado.aumentarStock(5);
                stockAumentado.mostrarInformacion();
                System.out.println("Stock aumentado exitosamente");
            }
        }

        System.out.println("== DISMINUIR STOCK DEL PRODUCTO ==");
        for (ProductoIndustrial menosStock : inventario) {
            if (menosStock.coincideConTexto("Gas")) {
                menosStock.disminuirStock(50);
                menosStock.mostrarInformacion();
                System.out.println("Stock disminuido exitosamente");
            }
        }
    }
}