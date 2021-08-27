package pojos;

import pojos.AltaTecnologia;

import java.util.Date;

public class DiscosSolidos extends AltaTecnologia {
    private String capacidad;
    public DiscosSolidos(String codigo, String modelo, String paisOrigen, Date fechaFabricacion,Empresa fabricante,String capacidad){
        super(codigo,modelo,paisOrigen,fechaFabricacion,fabricante);
        this.setCapacidad(capacidad);

    }


    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
