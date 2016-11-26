package edu.capacitas.test.helper;

import edu.capacitas.domain.Producto;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by Stefan on 25/11/2016.
 */
public class ProductoHelper {
    public static void crearProducto() {
        Producto producto = new Producto();

        producto.setId(new Long(1));
        producto.setNombre("Birome");
        producto.setPrecio(new Float("20.5"));

        System.out.println(producto);
    }
    public static Producto obtenerProducto(Long id,String nombre,Float precio) {
        Producto producto = new Producto();

        producto.setId(id);
        producto.setNombre(nombre);
        producto.setPrecio(precio);

        return producto;
    }

}
