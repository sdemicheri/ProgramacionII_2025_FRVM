public class Factura {
    private int nro;
    private double total;
    private Cliente cliente;

    public Factura() {
    }

    public Factura(int nro, double total, Cliente cliente) {
        this.nro = nro;
        this.total = total;
        this.cliente = cliente;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nro=" + nro +
                ", total=" + total +
                ", cliente=" + cliente +
                '}';
    }
}
