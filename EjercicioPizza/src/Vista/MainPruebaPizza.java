package Vista;

import Modelo.Amigo;
import Modelo.HiloAmigo;
import Modelo.SillaRCompartido;

/**
 *
 * @author Ainhoa
 */
public class MainPruebaPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SillaRCompartido silla = new SillaRCompartido();
        
        for (int i = 0; i < 4; i++) {
            Amigo a = new Amigo("A: "+ i);
           new HiloAmigo(a, silla).start();
            
        }

    }
    
}
