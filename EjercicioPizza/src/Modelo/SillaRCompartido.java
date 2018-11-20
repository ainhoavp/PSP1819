package Modelo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ainhoa
 */
public class SillaRCompartido {

    private boolean sillaOcupada = false;
    private int racionesPizza = 10;

    public boolean isSillaOcupada() {
        return sillaOcupada;
    }

    public void setSillaOcupada(boolean sillaOcupada) {
        this.sillaOcupada = sillaOcupada;
    }

    public synchronized int getRacionesPizza() {
        return racionesPizza;
    }

    public synchronized void setRacionesPizza(int racionesPizza) {
        this.racionesPizza = racionesPizza;
    }

    public synchronized void accederSilla(HiloAmigo hiloAmigo) {

        while (sillaOcupada) {
            try {
                mensajeSillaOcupada(hiloAmigo);
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SillaRCompartido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        sillaOcupada = true;
        mensajeSeHaSentadoEnLaSilla(hiloAmigo);
        try {
            sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(SillaRCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }
        racionesPizza--;
        mensajeComiendo(hiloAmigo);
        System.out.println("Quedan " + racionesPizza + " raciones de pizza.");
        if (racionesPizza == 0) {
            mensajePizzaTerminada(hiloAmigo);

        }
        notifyAll();
    }

    public synchronized void dejarSillaLibre(HiloAmigo hiloAmigo) {
        sillaOcupada = false;
        System.out.println("Amigo " + hiloAmigo.getAmigo().getNombre() + " finaliza de comer. SILLA LIBRE");
        notifyAll();

    }

    public synchronized void mensajeSillaOcupada(HiloAmigo a) {
        System.out.println("La silla está ocupada, amigo " + a.getAmigo().getNombre() + " vuelve a ponerse a charlar.");
    }

    public synchronized void mensajeSeHaSentadoEnLaSilla(HiloAmigo a) {
        System.out.println("Amigo " + a.getAmigo().getNombre() + " se ha sentado en la silla. SILLA OCUPADA");
    }

    public synchronized void mensajeComiendo(HiloAmigo a) {
        System.out.println("Amigo " + a.getAmigo().getNombre() + ", comiendo ración de pizza.");

    }

    public synchronized void mensajePizzaTerminada(HiloAmigo a) {
        System.out.println("Se han acabado las raciones de pizza.");
    }

}
