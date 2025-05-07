package Modelos;

import lombok.Data;

@Data
public class Marca implements Comparable<Marca>{
    private String nombre;
    private int codigo;    

    public Marca(int codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Marca o) {
        return o.codigo-this.codigo;
    }
}
