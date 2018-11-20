package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ainhoa
 */
public class HiloAmigo extends Thread {

    private SillaRCompartido silla;
    private Amigo amigo;

    public HiloAmigo(Amigo amigo, SillaRCompartido silla) {
        this.silla = silla;
        this.amigo = amigo;
    }

    public SillaRCompartido getSilla() {
        return silla;
    }

    public void setSilla(SillaRCompartido silla) {
        this.silla = silla;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    @Override
    public void run() {
        for (int i = 0; i < silla.getRacionesPizza(); i++) {
            silla.accederSilla(this);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloAmigo.class.getName()).log(Level.SEVERE, null, ex);
            }
            silla.dejarSillaLibre(this);

        }
    }

}
