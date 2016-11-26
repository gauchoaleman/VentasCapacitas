package edu.capacitas.test.helper;

import edu.capacitas.domain.Cliente;

/**
 * Created by Stefan on 25/11/2016.
 */
public class ClienteHelper {
    public static void crearCliente() {
        Cliente cliente = new Cliente();

        cliente.setId(new Long(1));
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setEmail("juan@yahoo.com");
        cliente.setTelefono("12345");

        System.out.println(cliente);
    }

    public static Cliente obtenerCliente() {
        Cliente cliente = new Cliente();

        cliente.setId(new Long(1));
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setEmail("juan@yahoo.com");
        cliente.setTelefono("12345");

        return cliente;
    }
}
