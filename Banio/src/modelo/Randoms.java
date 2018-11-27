package modelo;

/**
 *
 * @author Ainhoa
 */
public class Randoms {

    public static String sexo() {
        String sexo;
        if (numeroRandom() == 1) {
            sexo = "M";
        } else {
            sexo = "H";
        }
        return sexo;
    }

    public static int tiempoEntrarYsalir() {
        int tiempo;
        if (numeroRandom() == 1) {
            tiempo = 500;
        } else {
            tiempo = 1000;
        }
        return tiempo;
    }

    private static int numeroRandom() {
        int num = (int) Math.floor(Math.random() * 2 + 1);
        return num;
    }

    public static int tiempoRandom() {
        int tiempo;
        if (numeroRandom() == 1) {
            tiempo = 1000;
        } else {
            tiempo = 2000;
        }
        return tiempo;
    }

}
