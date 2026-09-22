package Ejercicio1;

public class ProductoIndustrial {
    private String codigo;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int cantidadDisponible;


    public ProductoIndustrial(String codigo, String nombre, String categoria, double precioUnitario, int cantidadDisponible) {

        if (codigo.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        if (cantidadDisponible < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double calcularValorInventario() {
        return this.cantidadDisponible * this.precioUnitario;
    }

    public boolean coincideConCodigo(String codigoBuscado) {
        return this.codigo.equalsIgnoreCase(codigoBuscado);
    }

    public boolean coincideConTexto(String texto) {
        return this.nombre.equalsIgnoreCase(texto) || this.categoria.equalsIgnoreCase(texto);
    }

    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El número debe ser positivo y mayor a 0");
        }
        this.cantidadDisponible = this.cantidadDisponible + cantidad;
    }

    public boolean disminuirStock(int cantidad) {
        if (cantidad <=0){
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        if (cantidad > this.cantidadDisponible) {
            throw new IllegalArgumentException("No hay stock suficiente");
        }
        this.cantidadDisponible = this.cantidadDisponible - cantidad;
        return  true;
    }

    public boolean tieneStockBajo (int limite) {
        return this.cantidadDisponible < limite;
    }

    public void mostrarInformacion() {
        System.out.println("--- DATOS DEL PRODUCTO ---");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Categoría: " + this.categoria);
        System.out.println("Precio Unitario: $" + this.precioUnitario);
        System.out.println("Stock Disponible: " + this.cantidadDisponible + " unidades");
        System.out.println("--------------------------");
    }
}
