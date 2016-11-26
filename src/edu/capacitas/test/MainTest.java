package edu.capacitas.test;

import static edu.capacitas.test.helper.ClienteHelper.crearCliente;
import static edu.capacitas.test.helper.ProductoHelper.crearProducto;
import static edu.capacitas.test.helper.VentaHelper.crearVenta;

/**
 * Created by Stefan on 25/11/2016.
 */
public class MainTest {

    public static void main(String[] args) {
        System.out.println("*****LOTE DE PRUEBAS*****");
        System.out.println("Crear producto:");
        crearProducto();
        System.out.println("Crear cliente:");
        crearCliente();
        System.out.println("Crear venta:");
        crearVenta();
    }

}
