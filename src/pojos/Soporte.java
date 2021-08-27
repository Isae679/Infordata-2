package pojos;

public class Soporte {

  private Empresa empresa;
  private AltaTecnologia producto;
  private double precio;

    public Soporte(Empresa empresa, AltaTecnologia producto, double precio) {
        this.setEmpresa(empresa);
        this.setProducto(producto);
        this.setPrecio(precio);
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public AltaTecnologia getProducto() {
        return producto;
    }

    public void setProducto(AltaTecnologia producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
