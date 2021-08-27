package pojos;

import java.util.Date;

public class AltaTecnologia extends Producto {
    protected String paisOrigen;
    protected Date fechaFabricacion;
    private Empresa fabricante;

    //metodo constructor

    public AltaTecnologia(String codigo, String modelo,String paisOrigen,Date fechaFabricacion,Empresa fabricante){
        super(codigo,modelo);
        this.setPaisOrigen(paisOrigen);
        this.setFechaFabricacion(fechaFabricacion);
        this.setFabricante(fabricante);


    }

    @Override
    public String toString() {
        return "AltaTecnologia{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", Codigo='" + Codigo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    //getter and setter


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    public Empresa getFabricante() { return fabricante; }

    public void setFabricante(Empresa fabricante) { this.fabricante = fabricante; }
}
