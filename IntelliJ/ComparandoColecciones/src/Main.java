import java.util.*;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {

            lista.add("item" + i);

        }

        long tiempo1 = System.nanoTime();

        System.out.println(lista.contains("item4999"));

        long tiempo2 = System.nanoTime();

        System.out.println(TimeUnit.NANOSECONDS.toMicros(tiempo2 - tiempo1));

        Set<String> conjunto = new HashSet<>();

        for (int i = 0; i < 1000000; i++) {

            conjunto.add("item" + i);

        }




        long tiempo3 = System.nanoTime();

        System.out.println(conjunto.contains("item4999"));

        long tiempo4 = System.nanoTime();


        System.out.println(TimeUnit.NANOSECONDS.toMicros(tiempo4 - tiempo3));

        Set<String> conjunto2 = new TreeSet<>();

        for (int i = 0; i < 1000000; i++) {

            conjunto2.add("item" + i);

        }

        long tiempo5 = System.nanoTime();

        System.out.println(conjunto2.contains("item4999"));

        long tiempo6 = System.nanoTime();


        System.out.println(TimeUnit.NANOSECONDS.toMicros(tiempo6 - tiempo5));

    }

}