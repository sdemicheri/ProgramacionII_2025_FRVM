package Modelos;

import lombok.Data;

@Data
public class Producto {
    private String nombre;
    private int codigo; 
    private Marca marca;

    public Producto(int codgo, String nombre, Marca marca) {
        this.codigo=codgo;
        this.nombre=nombre;
        this.marca=marca;
    }
}
