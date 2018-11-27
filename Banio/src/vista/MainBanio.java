package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Banio;
import modelo.Randoms;
import modelo.HiloPersonaBanio;
import modelo.Persona;

/**
 *
 * @author Ainhoa
 */
public class MainBanio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Banio banio = new Banio();
        for (int i = 0; i < 10; i++) {
            Persona persona = new Persona("P" + i);
            System.out.println(persona.getNombre() + ": va al baño");
            new HiloPersonaBanio(banio, persona).start();
            try {
                Thread.sleep(Randoms.tiempoRandom());
            } catch (InterruptedException ex) {
                Logger.getLogger(MainBanio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
