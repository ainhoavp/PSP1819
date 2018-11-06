package Modelo;

/**
 *
 * @author Ainhoa
 */
public class Coche {
    
    private String nombre;
    private String matricula;
    private int sentido;

    public Coche(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.sentido = (int)Math.random();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" + "nombre=" + nombre + ", matricula=" + matricula + ", sentido=" + sentido + '}';
    }

    
}
