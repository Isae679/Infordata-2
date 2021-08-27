package pojos;

import java.util.Date;

public class Venta {
    private Clientes cliente;
    private Impresoras impresora;
    private Date fecha;

    public Venta(Clientes cliente, Impresoras impresora, Date fecha) {
        this.setCliente(cliente);
        this.setImpresora(impresora);
        this.setFecha(fecha);
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
