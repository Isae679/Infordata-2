package pojos;

import interfaces.IReseteable;
import pojos.Alquiler;

public class Monitores extends Alquiler implements IReseteable {
    private String definicionMaxima;


    //metodo constructor


    public Monitores( String codigo, String modelo, int precio, String definicionMaxima) {
        super(codigo, modelo, precio);
        this.setDefinicionMaxima(definicionMaxima);
    }

    @Override
    public String toString() {
        return "Monitores{" +
                "definicionMaxima='" + definicionMaxima + '\'' +
                ", precio=" + precio +
                ", Codigo='" + Codigo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    public String getDefinicionMaxima() {
        return definicionMaxima;
    }

    public void setDefinicionMaxima(String definicionMaxima) {
        this.definicionMaxima = definicionMaxima;
    }

    @Override
    public void reset() {
        System.out.println("Rseteando monitor...");

    }
}
