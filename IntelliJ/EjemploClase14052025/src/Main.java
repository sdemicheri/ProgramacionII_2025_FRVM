import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Cliente> clientes = new HashSet<>();
        Set<Factura> facturas = new HashSet<>();
        System.out.println("Ingrese el codigo: ");
        int codigo=sc.nextInt();
        while (codigo>0){
            Cliente cliente1 = new Cliente();
            cliente1.setCodigo(codigo);
            System.out.println("Ingrese el nombre: ");
            cliente1.setNombre(sc.next());
            System.out.println("Ingrese el estado 0-Activo 1-No Activo: ");
            cliente1.setEstado(sc.nextInt());
            //    System.out.println(cliente1);
            clientes.add(cliente1);
            System.out.println("Ingrese el proximo codigo: ");
            codigo=sc.nextInt();
        }

        /*empiezo a cargar facturas*/

        System.out.println("Ingrese el nro: ");
        int nro=sc.nextInt();
        while (nro>0){
            Factura factura = new Factura();
            factura.setNro(nro);
            mostrarClientes(clientes);
            System.out.println("Ingrese el codigo del cliente: ");
            int codigoIngresado=sc.nextInt();
            for (Cliente c: clientes){
                if(codigoIngresado==c.getCodigo()){
                    factura.setCliente(c);
                }
            }
            System.out.println("Ingrese el total: ");
           // factura.setTotal(sc.nextDouble());
            facturas.add(factura);
            System.out.println("Ingrese el proximo nro: ");
            nro=sc.nextInt();
        }


        System.out.println(clientes);
        mostrarClientes(clientes);
        mostrarCantidadActivos(clientes);

        System.out.println(facturas);
        calcularCLientesRegulares(clientes,facturas);
    }

    private static void calcularCLientesRegulares(Set<Cliente> clientes, Set<Factura> facturas) {
        for (Cliente c: clientes){
            if(c.isRegular(facturas)){
                System.out.println(c+" es Regular");
            }
        }
    }

    private static void mostrarCantidadActivos(Set<Cliente> clientes) {
        int cont=0;
        for (Cliente c:clientes){
            if (c.isActivo()){
                cont+=1;
            }
        }
        System.out.println("La cantidad de activos es "+cont);
    }

    private static void mostrarClientes(Set<Cliente> clientes) {
        for (Cliente c:clientes){
            System.out.println(c);
        }
    }
}