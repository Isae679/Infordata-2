package pojos;

public class Impresoras extends Producto {
    private int velocidad;

    //metodo CONSTRUCTOR
    public Impresoras(String codigo, String modelo, int velocidad) {
        super(codigo, modelo);
        this.setVelocidad(velocidad);

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

