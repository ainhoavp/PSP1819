package UnCoche;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ainhoa
 */
//-----------------------------------RECURSO COMPARTIDO------------------------------------------------
public class Puente {

    private boolean ocupado = false;
    private String cadenaCoches = "Han accedido ya al puente los coches: ";
    
    
    public Puente() {
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Puente{" + "ocupado=" + ocupado + '}';
    }

    public synchronized void entrarPuente(Coche c) {
        try {
            while (ocupado) {

                mensajeOcupado(c);
                wait();

            }
            ocupado = true;
            mensajeEntrar(c);
           // notifyAll(); preguntar porque funciona exactamente igual sin el notify aqui.

        } catch (InterruptedException ex) {
            Logger.getLogger(Puente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized void salirPuente(Coche c) {
        ocupado = false;
        mensajeSalir(c);
        mensajeCadena(c);
        notifyAll();
            }

    public synchronized void mensajeEntrar(Coche c) {
        System.out.println("El coche " + c.getNombre() + " ha accedido al puente");
    }

    public synchronized void mensajeSalir(Coche c) {
        System.out.println("El coche " + c.getNombre() + " ha salido del puente");
    }

    public synchronized void mensajeOcupado(Coche c) {
        System.out.println("PUENTE OCUPADO: El coche " + c.getNombre() + " ha intentando acceder al puente. ESPERANDO.");
           }
    
    public synchronized void mensajeCadena(Coche c){
        cadenaCoches+=c.getNombre()+" con sentido: "+c.getSentido()+", ";
        System.out.println(cadenaCoches);
    }
    
}
