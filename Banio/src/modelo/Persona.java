package modelo;

/**
 *
 * @author Ainhoa
 */
public class Persona {

    private String nombre;
    private String sexo;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.sexo = Randoms.sexo();
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona: " + "Nombre_" + nombre + ", sexo_" + sexo;
    }

}
