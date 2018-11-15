package DosCoches;

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
    private int contadorCochesPuente = 0;
    private String sentidoCoches = "";

    public Puente() {
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getContadorCochesPuente() {
        return contadorCochesPuente;
    }

    public void setContadorCochesPuente(int contadorCochesPuente) {
        this.contadorCochesPuente = contadorCochesPuente;
    }

    @Override
    public String toString() {
        return "Puente{" + "ocupado=" + ocupado + '}';
    }

    public synchronized void entrarPuente(HiloCocheACCION c) {
        try {
            while ((ocupado && !sentidoCoches.equalsIgnoreCase(c.getCoche().getSentido())) || contadorCochesPuente >= 2) {
                mensajeOcupado(c);
                wait();
            }
            sentidoCoches = c.getCoche().getSentido();
            ocupado = true;
            contadorCochesPuente++;
            mensajeEntrar(c);
            notifyAll();

        } catch (InterruptedException ex) {
            Logger.getLogger(Puente.class.getName()).log(Level.SEVERE, null, ex);
        }
            mensajeCadena(c);
    }

    public synchronized void salirPuente(HiloCocheACCION c) {
        ocupado = false;
        sentidoCoches = "";
        contadorCochesPuente--;
        mensajeSalir(c);
        //mensajeCadena(c);
        notifyAll();
    }

    public synchronized void mensajeEntrar(HiloCocheACCION c) {
        System.out.println("El coche " + c.getCoche().getNombre() + " ha accedido al puente" + " en sentido: " + c.getCoche().getSentido());
    }

    public synchronized void mensajeSalir(HiloCocheACCION c) {
        System.out.println("El coche " + c.getCoche().getNombre() + " ha salido del puente");
    }

    public synchronized void mensajeOcupado(HiloCocheACCION c) {
        System.out.println("PUENTE OCUPADO: El coche " + c.getCoche().getNombre() + " ha intentando acceder al puente con sentido: " + c.getCoche().getSentido() + " ESPERANDO.");
    }

    public synchronized void mensajeCadena(HiloCocheACCION c) {
        cadenaCoches += c.getCoche().getNombre() + " con sentido: " + c.getCoche().getSentido() + ", ";
        System.out.println(cadenaCoches);
    }

}
