package Modelo;

public class Vehiculo {
    private String patente;
    private Marca marca;

    public Vehiculo() {
    }

    public Vehiculo(String patente, Marca marca) {
        this.patente = patente;
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", " + this.mostrarNombreMarca() + '\'' +
                '}';
    }

    public String mostrarNombreMarca() {
        return "La marca es " + this.getMarca().getNombre();
    }
}
