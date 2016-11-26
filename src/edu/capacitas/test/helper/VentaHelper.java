package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Producto;
import edu.capacitas.domain.Venta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static edu.capacitas.test.helper.ClienteHelper.obtenerCliente;
import static edu.capacitas.test.helper.ProductoHelper.obtenerProducto;

/**
 * Created by Stefan on 25/11/2016.
 */
public class VentaHelper {
    public static void crearVenta() {
        Venta venta = new Venta();
        Cliente cliente = new Cliente();
        List<Producto> listaProductos = new ArrayList<>();

        cliente = obtenerCliente();
        venta.setId(new Long(1));
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setEmail("juan@yahoo.com");
        cliente.setTelefono("12345");

        listaProductos.add(obtenerProducto(new Long("1"),"Martillo",new Float("150.5")));   //añadir elemento
        listaProductos.add(obtenerProducto(new Long("2"),"Almohada",new Float("150.5")));   //añadir elemento
        listaProductos.add(obtenerProducto(new Long("3"),"Cama",new Float("500.75")));   //añadir elemento

        venta.setCliente(cliente);
        venta.setId(new Long("1"));

        Calendar fecha = Calendar.getInstance();
        fecha.set(2016,Calendar.NOVEMBER,29);
        venta.setFecha(fecha);
        venta.setListaProductos(listaProductos);
        venta.setTotal(obtenerTotal(listaProductos));
        System.out.println(venta);
    }

    public static Float obtenerTotal(List<Producto> listaProductos){
        Float total = new Float("0");

        for(int i=0; i<listaProductos.size(); i++){
            total = total + listaProductos.get(i).getPrecio();
        }
        return total;
    }
}
