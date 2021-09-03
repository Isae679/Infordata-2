package pojos;

import interfaces.IReseteable;
import pojos.Alquiler;

public class DiscosDuros extends Alquiler implements IReseteable {
    private String capacidad;


    //metodo constructor


    public DiscosDuros( String codigo, String modelo, int precio, String capacidad) {
        super( codigo, modelo, precio);
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("Formateando Disco Duro...");
    }
}
