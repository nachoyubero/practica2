package edu.comillas.icai.gitt.pat.spring.mvc.modelo;

public class Carrito {
    private int idCarrito;
    private int idArticulo;
    private String descripcion;
    private int unidades;
    private double precio;

    public Carrito(){

    }

    public Carrito(int idCarrito, int idArticulo, String descripcion, int unidades, double precio) {
        this.idCarrito = idCarrito;
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precio = precio;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
