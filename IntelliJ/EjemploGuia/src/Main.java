import Modelos.Cliente;
import Modelos.Factura;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();//no permite objetos duplicados y no los ordena
        Set<Factura> facturas = new HashSet<>();
        // Set<Cliente> lista = new TreeSet<>();//no permite objetos duplicados y SI los ordena
        Scanner es = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int codigo = es.nextInt();
        while (codigo!=0) {
            System.out.println("Ingrese el nombre: ");
            String nombre = es.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = es.next();
            System.out.println("Ingrese el estado: ");
            int estado = es.nextInt();
            //aca lo guardamos en una lista
            clientes.add(new Cliente(nombre, apellido, estado, codigo));
//            Cliente cliente = new Cliente(nombre, apellido, estado, codigo);
//            System.out.println("Cliente ingresado, estado = " + cliente.isActivoS());

            System.out.println("Ingrese el proximo codigo: ");
            codigo = es.nextInt();
        }

        mostrarClientes(clientes);

//        System.out.println(lista);

        /*
            Cliente cliente1= new Cliente();
            cliente1.setNombre("Sole");
            cliente1.setApellido("Demicheri");
            cliente1.setEstado(0);
            cliente1.setCodigo(1);

            Cliente cliente2= new Cliente("Emilia","Villarruel",1,2);

            System.out.println("Cliente 1, estado = "+cliente1.isActivoS());
            System.out.println("Cliente 2, estado = "+cliente2.isActivoS());

         */

        //CARGANDO LAS FACTURAS
        System.out.println("Ingrese el nro: ");
        int nro = es.nextInt();
        while (nro!=0) {
            mostrarClientes(clientes);
            System.out.println("Ingrese el codigo del cliente: ");
            int codigoCliente = es.nextInt();
            System.out.println("Ingrese el total: ");
            double total = es.nextDouble();
            Cliente clienteObjeto=buscarCliente(clientes,codigoCliente);

            facturas.add(new Factura(nro,clienteObjeto,total));

            System.out.println("Ingrese el proximo nro: ");
            nro = es.nextInt();
        }

        for (Factura f: facturas){
            System.out.println(f);
        }

        //quiero saber si un cliente es regular
        mostrarClientes(clientes);
        System.out.println("Ingrese el codigo del cliente: ");
        int codigoCliente = es.nextInt();
        Cliente clienteObjeto=buscarCliente(clientes,codigoCliente);
        if (clienteObjeto.isActivo()){
            double totalFacturado=0.0;
            for (Factura f: facturas){
                if (f.getCliente()==clienteObjeto){
                    totalFacturado=totalFacturado+f.getTotal();
                }
            }
            if(totalFacturado>15000){
                System.out.println("Es regular");
            }else{
                System.out.println("No es regular");
            }

        }

    }

    private static Cliente buscarCliente(Set<Cliente> clientes,int codigoCliente) {
        for (Cliente c: clientes){
            if (c.getCodigo()==codigoCliente){
                return c;
            }
        }
        return null;
    }

    private static void mostrarClientes(Set<Cliente> clientes) {
        for (Cliente c: clientes){
            System.out.println(c);
        }
    }
}