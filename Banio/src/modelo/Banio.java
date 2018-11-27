package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ainhoa
 */
public class Banio {

    private boolean ocupado;
    private int m = 0;
    private int h = 0;

    public synchronized void entrarBanio(HiloPersonaBanio hPersona) {
        while (ocupado) {
            try {
                System.out.println("El baño está ocupado.");
                System.out.println(hPersona.getPersona().getNombre() + " debe esperar a que esté vacío.");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Banio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(hPersona.getPersona().toString() + " accede al baño.");
        ocupado = true;
        System.out.println("EL BAÑO ESTÁ OCUPADO.");
        notifyAll();

    }

    public synchronized void salirBanio(HiloPersonaBanio hPersona) {

        if (hPersona.getPersona().getSexo().equals("M")) {
            m++;
        } else {
            h++;
        }

        try {
            Thread.sleep(Randoms.tiempoEntrarYsalir());
        } catch (InterruptedException ex) {
            Logger.getLogger(Banio.class.getName()).log(Level.SEVERE, null, ex);
        }
        ocupado = false;
        System.out.println(hPersona.getPersona().toString() + " SALE");
        System.out.println("EL BAÑO ESTÁ LIBRE");
        System.out.println("Mujeres " + m + " Hombres " + h);
        notifyAll();

    }

    public synchronized void tiempo(HiloPersonaBanio personaTiempo) {
        try {
            Thread.sleep(Randoms.tiempoEntrarYsalir());
        } catch (InterruptedException ex) {
            Logger.getLogger(Banio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
