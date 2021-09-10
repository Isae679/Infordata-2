import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
       /* //producto
        Producto producto= new Producto("C446A7","Teclado retroiluminado");
        System.out.println(producto);
        //alquiler
        Alquiler alquiler= new Alquiler("A23FG","monitor 20",40);
        System.out.println(alquiler);
        //tecnologia
        Empresa empresa = new Empresa("DELL","Av. Heroinas",234);
        AltaTecnologia altaTecnologia = new AltaTecnologia("GERT345","Vostro 100","USA", Calendar.getInstance().getTime(),empresa);
        System.out.println(altaTecnologia);

        //monitor
        Monitores monitores = new Monitores("ADEY23","monitor 45",60,"FULL HD");
        System.out.println(monitores);*/


       //POLIMORFISMO
        /*
        Producto  producto = new Producto("G120","Genius G120+");
        Producto lj750 = new Impresoras("lj750","Canon Laserjet 750", 30);
        //System.out.println(lj750);
        Producto S200 = new Monitores("s200+","Samsung S200 plus",15,"FHD");
       // System.out.println(S200);
        Producto m500 = new DiscosDuros("m500","Maxtor m500",10,"500");
       // System.out.println(m500);


        Impresoras impresoras =(Impresoras) lj750;
        //System.out.println(impresoras);
        Monitores monitores = (Monitores) S200;
        //System.out.println(monitores);
        DiscosDuros discosDuros =  (DiscosDuros) m500;
        //System.out.println(discosDuros);

        Producto[] productos = new Producto[3];
        productos[0] = impresoras;
        productos[1] = monitores;
        productos[2] = discosDuros;

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
            
        }
         */

        Monitores lg1080 = new Monitores("lg1080", "Monitor LG1080+", 10,"HD");
        lg1080.reset();

        lg1080.estado();

        DiscosDuros s1000 = new DiscosDuros("s1000","Samsung s1000",20,"1000GB");
        s1000.reset();
        s1000.estado();


    }

}
