package pojos;

public class Clientes {
    private int DNI;
    private int telefono;
    private String direccion;


    //metodo Constructor


    public Clientes(int DNI, int telefono, String direccion) {
        this.setDNI(DNI);
        this.setTelefono(telefono);
        this.setDireccion(direccion);
    }


    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
