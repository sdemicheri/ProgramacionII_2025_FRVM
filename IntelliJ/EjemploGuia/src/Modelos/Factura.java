package Modelos;

public class Factura {
    private int nro;
    private Cliente cliente;
    private double total;

    public Factura() {
    }

    public Factura(int nro, Cliente cliente, double total) {
        this.nro = nro;
        this.cliente = cliente;
        this.total = total;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
