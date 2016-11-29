package edu.capacitas.app;

import edu.capacitas.domain.Cliente;
import edu.capacitas.domain.Producto;
import edu.capacitas.domain.Venta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Stefan on 29/11/2016.
 */
public class App {

    /*public App() {
        hacerVenta();
    }*/

    public Cliente agregarCliente(){

        int id;
        Cliente cliente = new Cliente();
        //FuncionesVariadas funcionesVariadas = new FuncionesVariadas();
        System.out.println("Arranca agregar Cliente");

        System.out.println("Id: ");
        id = FuncionesVariadas.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = FuncionesVariadas.pedirNumeroPositivo();
        }
        cliente.setId(id);
        System.out.println("Nombre:");
        cliente.setNombre(FuncionesVariadas.pedirEntrada());
        System.out.println("Apellido: ");
        cliente.setApellido(FuncionesVariadas.pedirEntrada());
        System.out.println("Email: ");
        cliente.setEmail(FuncionesVariadas.pedirEntrada());
        System.out.println("Telefono: ");

        return cliente;
    }

    public void hacerVenta(){
        Venta venta = new Venta();
        Cliente cliente = new Cliente();
        Integer id;
        List<Producto> listaProductos = new ArrayList<>();

        System.out.println("Ingrese Id:");
        id = FuncionesVariadas.pedirNumeroPositivo();
        while( id<0 ){
            System.out.println("Ingrese número");
            id = FuncionesVariadas.pedirNumeroPositivo();
        }

        System.out.println("Cuántos productos?");
        int ctdProductos = FuncionesVariadas.pedirNumeroPositivo();

        for( int i=0;i<ctdProductos;i++)
            listaProductos.add(leerProducto());


        venta.setId(id);
        venta.setListaProductos(listaProductos);
        venta.setCliente(agregarCliente());

        System.out.println("Fecha de nacimiento:");
        System.out.println("Día:");
        int dia = FuncionesVariadas.pedirNumeroPositivo();
        System.out.println("Mes:");
        int mes = FuncionesVariadas.pedirNumeroPositivo();
        System.out.println("Anio:");
        int anio = FuncionesVariadas.pedirNumeroPositivo();
        Calendar fecha = Calendar.getInstance();

        fecha.set(Calendar.MONTH,mes-1);
        fecha.set(Calendar.DAY_OF_MONTH,dia);
        fecha.set(Calendar.YEAR,anio);
        venta.setFecha(fecha);
        System.out.println(venta);
    }

    public Producto leerProducto(){
        int id;
        Producto producto = new Producto();

        System.out.println("Ingrese Id:");
        id = FuncionesVariadas.pedirNumeroPositivo();
        while( id<0 )
        {
            System.out.println("Ingrese número");
            id = FuncionesVariadas.pedirNumeroPositivo();
        }
        System.out.println("Nombre:");
        producto.setNombre(FuncionesVariadas.pedirEntrada());
        System.out.println("Precio: ");
        producto.setPrecio(FuncionesVariadas.pedirFlotante());

        return producto;
    }

}
