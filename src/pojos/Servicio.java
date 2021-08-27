package pojos;

public class Servicio {
    private Clientes cliente;
    private Impresoras impresora;
    private String detalle;
    private double totalFcturado;

    public Servicio(Clientes cliente, Impresoras impresora, String detalle, double totalFcturado) {
        this.setCliente(cliente);
        this.setImpresora(impresora);
        this.setDetalle(detalle);
        this.setTotalFcturado(totalFcturado);
    }


    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Impresoras getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresoras impresora) {
        this.impresora = impresora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalFcturado() {
        return totalFcturado;
    }

    public void setTotalFcturado(double totalFcturado) {
        this.totalFcturado = totalFcturado;
    }
}
