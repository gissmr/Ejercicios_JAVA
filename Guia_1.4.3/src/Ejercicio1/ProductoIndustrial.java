package Ejercicio1;

public class ProductoIndustrial {
    private String codigo;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int cantidadDisponible;

    public ProductoIndustrial(String codigo, String nombre, String categoria, double precioUnitario, int cantidadDisponible) throws IllegalAccessException {

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

}
