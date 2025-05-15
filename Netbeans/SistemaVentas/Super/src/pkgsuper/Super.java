package pkgsuper;

import Modelos.Marca;
import Modelos.Producto;
import Vistas.FrmProducto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Super {

    public static void main(String[] args) {
        Marca marca = new Marca(1,"Coca Cola");
        Marca marca1 = new Marca(2,"Pepsi");
        Marca marca2 = new Marca(3,"Secco");
        
        //lista de marcas
        List<Marca> marcas= Arrays.asList(marca,marca1,marca2,marca);
        System.err.println(marcas);
        abrirVentana(marcas);
        /*Scanner scanner = new Scanner(System.in); //para poder usar la consola
        
        Marca marca = new Marca(1,"Coca Cola");
        Marca marca1 = new Marca(2,"Pepsi");
        Marca marca2 = new Marca(3,"Secco");
        
        //lista de marcas
        List<Marca> marcas= Arrays.asList(marca,marca1,marca2,marca);
        System.err.println(marcas);
        
        System.out.println("Seleccione una marca:");
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println((i + 1) + ". " + marcas.get(i).getNombre());
        }

        System.out.print("Ingrese el número correspondiente: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= marcas.size()) {
            Marca seleccionada = marcas.get(opcion - 1);
            Producto prod = new Producto(1, "Gaseosa 1.5 lts", seleccionada);
            System.out.println("Producto creado: " + prod);
        } else {
            System.out.println("Opción inválida.");
        }
        
        
        //Hash de marcas
        
        Set<Marca> marcasHSet= new HashSet<>(Arrays.asList(marca,marca1,marca2,marca));
        System.err.println(marcasHSet);
        
        System.out.print("Ingrese el código de la marca *busco en el HashSet: ");
        int codigoBuscado = scanner.nextInt();

        Marca seleccionada = buscarMarcaPorCodigo(marcasHSet, codigoBuscado);

        if (seleccionada != null) {
            Producto prod = new Producto(1, "Gaseosa 1.5 lts", seleccionada);
            System.out.println("Producto creado: " + prod);
        } else {
            System.out.println("Marca no encontrada.");
        }
               
        //Tree de marcas
        
        Set<Marca> marcasTSet= new TreeSet<>(Arrays.asList(marca,marca1,marca2,marca));
        System.err.println(marcasTSet);
        Producto prod = new Producto(1,"Gaseosa 1.5 lts",marca);
        
        */
        //map de marcas
    /*    
        Map<Integer, Marca> marcasMap = new HashMap<>();
        marcasMap.put(1, marca);
        marcasMap.put(2, marca1);
        marcasMap.put(99, marca2);
        marcasMap.put(100, new Marca(33,"nueva"));
        
        System.out.println("Codigos de marca cargados en el map:");
        for (Map.Entry<Integer, Marca> entry : marcasMap.entrySet()) { //recorro e imprimo
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo de la marca a buscar en el map: ");
        int codigoBuscado = scanner.nextInt();

        Marca seleccionada = marcasMap.get(codigoBuscado); //busqueda directa, va directamente a la clave

        if (seleccionada != null) {
            Producto prod = new Producto(1, "Gaseosa 1.5 lts", seleccionada);
            System.out.println("Producto creado: " + prod);
        } else {
            System.out.println("Marca no encontrada.");
        }
      */  
       // cargarDatosDesdeArchivo();
    }
    
    //el metodo es static porque estoy en el main
    public static Marca buscarMarcaPorCodigo(Set<Marca> marcas, int codigo) { //busqueda lineal porque recorro todos hasta encontrarlo
        for (Marca m : marcas) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

    private static void cargarDatosDesdeArchivo() {
        Map<Integer, Marca> marcasMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\ArchivosTUP\\marcas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int codigo = Integer.parseInt(partes[0].trim());
                String nombre = partes[1].trim();
                marcasMap.put(codigo, new Marca(codigo, nombre));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        System.out.println("Marcas disponibles en archivo:");
        marcasMap.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNombre());
        });

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código de la marca: ");
        int codigoBuscado = scanner.nextInt();

        Marca seleccionada = marcasMap.get(codigoBuscado);

        if (seleccionada != null) {
            Producto prod = new Producto(1, "Gaseosa 1.5 lts", seleccionada);
            System.out.println("Producto creado: " + prod);
        } else {
            System.out.println("Marca no encontrada.");
        }
        
    }

    private static void abrirVentana(List<Marca> marcas) {
        FrmProducto formulario = new FrmProducto();
        formulario.setVisible(true);
        formulario.cargarCombo(marcas);
    }
    
}
