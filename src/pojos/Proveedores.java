package pojos;

import java.util.Date;
import java.util.List;


public class Proveedores {
     private String NIF;
     private Date FechaAcquicionProducto;
    private List<Producto> productos;




    //metodo constructor


    public Proveedores(String NIF, Date fechaAcquicionProducto, List<Producto> productos) {
        this.setNIF(NIF);
        setFechaAcquicionProducto(fechaAcquicionProducto);
        this.setProductos(productos);
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Date getFechaAcquicionProducto() {
        return FechaAcquicionProducto;
    }

    public void setFechaAcquicionProducto(Date fechaAcquicionProducto) {
        FechaAcquicionProducto = fechaAcquicionProducto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
