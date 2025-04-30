import Modelo.Vehiculo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("ADD251","Fiat");
        Vehiculo vehiculo1 = new Vehiculo("AD251AA","Fiat");
        Vehiculo vehiculo2 = new Vehiculo("AD251BB","Fait");
        Vehiculo vehiculo3 = new Vehiculo("HJJ250","Citroen");

        System.out.println(vehiculo);
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
        System.out.println(vehiculo3);
    }
}