package DosCoches;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ainhoa
 */
public class HiloCocheACCION extends Thread {

    private Coche coche;
    private Puente puente;

    public HiloCocheACCION(Coche coche, Puente puente) {
        this.coche = coche;
        this.puente = puente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Puente getPuente() {
        return puente;
    }

    public void setPuente(Puente puente) {
        this.puente = puente;
    }
    
    
    

    @Override
    public void run() {
        try {
            puente.entrarPuente(this);
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloCocheACCION.class.getName()).log(Level.SEVERE, null, ex);
        }
        puente.salirPuente(this);
    }

}
