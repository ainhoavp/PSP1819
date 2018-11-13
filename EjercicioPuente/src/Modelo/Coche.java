package Modelo;


/**
 *
 * @author Ainhoa
 */
public class Coche{

    private String nombre;
    private boolean sentidoDerecha;

    public Coche(String nombre) {
        this.nombre = nombre;
       int intSentido = (int) (Math.random()*2);
       if(intSentido == 1){
           this.sentidoDerecha = false;
    }else{
           this.sentidoDerecha = true;
       }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSentidoDerecha() {
        return sentidoDerecha;
    }

    public void setSentidoDerecha(boolean sentidoDerecha) {
        this.sentidoDerecha = sentidoDerecha;
    }


    @Override
    public String toString() {
        return "Coche{" + "nombre=" + nombre + ", sentido=" + sentidoDerecha + '}';
    }

   
}
