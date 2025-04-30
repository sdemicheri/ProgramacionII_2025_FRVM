import Modelo.Marca;
import Modelo.Vehiculo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Marca marcaF = new Marca("Fiat",1);
        Marca marcaC = new Marca("Citroen",2);
        Vehiculo vehiculo = new Vehiculo("ADD251",marcaF);
        Vehiculo vehiculo1 = new Vehiculo("AD251AA",marcaF);
        Vehiculo vehiculo2 = new Vehiculo("AD251BB",marcaF);
        Vehiculo vehiculo3 = new Vehiculo("HJJ250",marcaC);

        System.out.println(vehiculo.mostrarNombreMarca());
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
        System.out.println(vehiculo3);
    }
}