package pojos;

public abstract class Alquiler extends Producto {
    protected int precio;

    //metodo constructor

    public Alquiler(String codigo, String modelo, int precio) {
        super(codigo, modelo);
        this.setPrecio(precio);
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "precio=" + precio +
                ", Codigo='" + Codigo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
