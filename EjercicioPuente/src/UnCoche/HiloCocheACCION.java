package UnCoche;

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

    @Override
    public void run() {
        try {
            puente.entrarPuente(coche);
            sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloCocheACCION.class.getName()).log(Level.SEVERE, null, ex);
        }
        puente.salirPuente(coche);
    }

}
