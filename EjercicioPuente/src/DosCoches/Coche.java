package DosCoches;



/**
 *
 * @author Ainhoa
 */
public class Coche{

    private String nombre;
    private String sentido;

    public Coche(String nombre) {
        this.nombre = nombre;
       int intSentido = (int) (Math.random()*2+1);
        this.sentido = (intSentido == 1 ? "IDA" : "VUELTA");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    @Override
    public String toString() {
        return "Coche{" + "nombre=" + nombre + ", sentido=" + sentido + '}';
    }



 

   
}
