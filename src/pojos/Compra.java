package pojos;

import java.util.Date;

public class Compra {
    private Proveedores proveedor;
    private Producto producto;
    private Date fecha;
    private int cantidad;

    public Compra(Proveedores proveedor, Producto producto, Date fecha, int cantidad) {
        this.setProveedor(proveedor);
        this.setProducto(producto);
        this.setFecha(fecha);
        this.setCantidad(cantidad);
    }


    public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
