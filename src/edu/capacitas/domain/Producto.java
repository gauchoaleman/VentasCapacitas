package edu.capacitas.domain;


/**
 * Created by Stefan on 25/11/2016.
 */
public class Producto {
    private Long id;
    private String nombre;
    private Float precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {

        return "Producto{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", precio=" + precio +
                '}';
    }

}
