package Modelo;

/**
 *
 * @author Ainhoa
 */
public class Productor extends Thread{
    
    public Monitor monitorAlmacen;
    private String nombre;
    public Productor(Monitor monitorAlmacen, String nombre) {
        this.monitorAlmacen = monitorAlmacen;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int i = 0;
        for(i=1; i<6;i++){
            monitorAlmacen.newDato(nombre+" "+i);
            System.out.println("Produciendo "+nombre +" "+i);
        }
        
    }
  
    
    
    
    
    
}
