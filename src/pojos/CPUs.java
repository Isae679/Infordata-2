package pojos;

import interfaces.IReseteable;
import pojos.AltaTecnologia;

import java.util.Date;

public class CPUs extends AltaTecnologia implements IReseteable {
    private String memoriaPrinc;


    //metodo constructor
    public CPUs(String codigo, String modelo,String paisOrigen,Date fechaFabricacion,Empresa fabricante,String memoriaPrinc){
        super(codigo,modelo,paisOrigen,fechaFabricacion,fabricante);
        this.setMemoriaPrinc(memoriaPrinc);

    }

    public String getMemoriaPrinc() {
        return memoriaPrinc;
    }

    public void setMemoriaPrinc(String memoriaPrinc) {
        this.memoriaPrinc = memoriaPrinc;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando al estado de Fabrica...");
    }
}
