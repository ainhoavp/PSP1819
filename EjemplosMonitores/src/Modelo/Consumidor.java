package Modelo;

/**
 *
 * @author Ainhoa
 */
public class Consumidor extends Thread{
    
    Monitor monitorAlmacen;
    private String nombre;

    public Consumidor(Monitor monitorAlmacen, String nombre) {
        this.monitorAlmacen = monitorAlmacen;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int numeroDatosConsumidos =0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Consumiendo "+" "+nombre +" "+ monitorAlmacen.getDato());
            numeroDatosConsumidos++;
            System.out.println("Numero de datos consumidos "+ numeroDatosConsumidos);
            
        }
    }
 
    
    
    
}
