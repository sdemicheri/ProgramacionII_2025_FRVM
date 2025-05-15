package Modelos;

public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private int estado; //0-Activo 1-No Activo

    public Cliente(String nombre, String apellido, int estado, int codigo) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.estado=estado;
        this.codigo=codigo;
    }

    public Cliente() {

    }

    public boolean isActivo(){
        if (estado==0) {
            return true;
        }else{
            return false;
        }

    }

    public String isActivoS(){
        if (estado==0) {
            return "Activo";
        }else{
            return "Inactivo";
        }

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

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estado=" + this.isActivoS() +
                '}';
    }
}
