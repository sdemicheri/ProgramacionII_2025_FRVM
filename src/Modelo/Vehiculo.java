package Modelo;

public class Vehiculo {
    private String patente;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
