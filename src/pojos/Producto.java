package pojos;

public class Producto {

    protected String Codigo;
    protected String Modelo;




    //metodo cosntructor

    public Producto(String codigo, String modelo) {
         this.setCodigo(codigo);
        this.setModelo(modelo);

    }

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo='" + Codigo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
