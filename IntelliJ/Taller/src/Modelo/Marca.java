package Modelo;

public class Marca {
    private String nombre;
    private int codigo;

    public Marca() {
    }

    public Marca(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
