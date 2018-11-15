package DosCoches;


/**
 *
 * @author Ainhoa
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Puente p = new Puente();

        for (int i = 0; i < 10; i++) {
            Coche c = new Coche("Coche " + i);
            new HiloCocheACCION(c, p).start();

        }

    }
}
