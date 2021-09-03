package pojos;

import interfaces.IReseteable;

public class Impresoras extends Producto implements IReseteable {
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

    @Override
    public String toString() {
        return "Impresoras{" +
                "velocidad=" + velocidad +
                ", Codigo='" + Codigo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando impresora...");

    }
}

