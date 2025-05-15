import java.util.Set;

public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private int estado;

    public Cliente() {

    }

    public Cliente(int cod, String nombre) {
        this.codigo=cod;
        this.nombre=nombre;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public boolean isActivo(){
        return this.estado==0;
    }
    public String getEstadoEscrito(){
        if (this.isActivo()){
            return "Activo";
        }else{
            if (this.estado==1){
                return "No Activo";
            }else{
                return "Estado Error";
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                "} " +this.getEstadoEscrito() ;
    }

    public boolean isRegular(Set<Factura> facturas) {
        if (isActivo()){
            int cont=0;
            for (Factura f: facturas){
                if(f.getCliente()==this){
                    if(f.getTotal()>15000){
                       cont+=1;
                    }
                }
            }
            return cont>=5;
        }
        return false;
    }
}
